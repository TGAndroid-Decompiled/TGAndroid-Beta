package org.telegram.messenger;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.android.billingclient.api.zzcu;
import com.google.android.exoplayer2.audio.AacUtil;
import java.io.File;
import org.telegram.messenger.audioinfo.AudioInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.LaunchActivity;

public class MusicPlayerService extends Service implements NotificationCenter.NotificationCenterDelegate {
    private static final int ID_NOTIFICATION = 5;
    public static final String NOTIFY_CLOSE = "org.telegram.android.musicplayer.close";
    public static final String NOTIFY_NEXT = "org.telegram.android.musicplayer.next";
    public static final String NOTIFY_PAUSE = "org.telegram.android.musicplayer.pause";
    public static final String NOTIFY_PLAY = "org.telegram.android.musicplayer.play";
    public static final String NOTIFY_PREVIOUS = "org.telegram.android.musicplayer.previous";
    public static final String NOTIFY_REPEAT = "org.telegram.android.musicplayer.repeat";
    public static final String NOTIFY_SEEK = "org.telegram.android.musicplayer.seek";
    public static final String NOTIFY_SHUFFLE = "org.telegram.android.musicplayer.shuffle";
    private static boolean supportBigNotifications = true;
    private static boolean supportLockScreenControls = true ^ TextUtils.isEmpty(AndroidUtilities.getSystemProperty("ro.miui.ui.version.code"));
    private Bitmap albumArtPlaceholder;
    private AudioManager audioManager;
    private boolean foregroundServiceIsStarted;
    private BroadcastReceiver headsetPlugReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
            }
        }
    };
    private ImageReceiver imageReceiver;
    private String loadingFilePath;
    private MediaSessionCompat mediaSession;
    private int notificationMessageID;
    private PlaybackStateCompat.Builder playbackState;
    private RemoteControlClient remoteControlClient;

    public void createNotification(MessageObject messageObject, boolean z) {
        long j;
        Bitmap avatarBitmap;
        Bitmap avatarBitmap2;
        Bitmap bitmapLoadArtworkFromUrl;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        String str;
        long j2;
        MessageObject messageObject2;
        String str2;
        int i;
        int i2;
        AudioInfo audioInfo;
        String str3;
        Bitmap bitmap;
        String musicTitle = messageObject.getMusicTitle();
        String musicAuthor = messageObject.getMusicAuthor();
        AudioInfo audioInfo2 = MediaController.getInstance().getAudioInfo();
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
        if (messageObject.isMusic()) {
            intent.setAction("com.tmessages.openplayer");
            intent.addCategory("android.intent.category.LAUNCHER");
        } else if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            intent.setAction("android.intent.action.VIEW");
            TLRPC.Peer peer = messageObject.messageOwner.peer_id;
            boolean z2 = peer instanceof TLRPC.TL_peerUser;
            if (z2) {
                j = peer.user_id;
            } else if (peer instanceof TLRPC.TL_peerChat) {
                j = peer.chat_id;
            } else {
                j = peer instanceof TLRPC.TL_peerChannel ? peer.channel_id : 0L;
            }
            if (j != 0) {
                if (z2) {
                    StringBuilder sbM = AacUtil.m(j, "tg://openmessage?user_id=", "&message_id=");
                    sbM.append(messageObject.getId());
                    intent.setData(Uri.parse(sbM.toString()));
                } else {
                    StringBuilder sbM2 = AacUtil.m(j, "tg://openmessage?chat_id=", "&message_id=");
                    sbM2.append(messageObject.getId());
                    intent.setData(Uri.parse(sbM2.toString()));
                }
            }
        }
        PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, fixIntentFlags(33554432));
        long duration = (long) (messageObject.getDuration() * 1000.0d);
        if (messageObject.isMusic()) {
            String artworkUrl = messageObject.getArtworkUrl(true);
            String artworkUrl2 = messageObject.getArtworkUrl(false);
            bitmapLoadArtworkFromUrl = audioInfo2 != null ? audioInfo2.smallCover : null;
            avatarBitmap = audioInfo2 != null ? audioInfo2.cover : null;
            this.loadingFilePath = null;
            this.imageReceiver.setImageBitmap((Drawable) null);
            if (bitmapLoadArtworkFromUrl != null || TextUtils.isEmpty(artworkUrl)) {
                this.loadingFilePath = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(messageObject.getDocument()).getAbsolutePath();
            } else {
                boolean z3 = !z;
                Bitmap bitmapLoadArtworkFromUrl2 = loadArtworkFromUrl(artworkUrl2, true, z3);
                if (bitmapLoadArtworkFromUrl2 == null) {
                    bitmapLoadArtworkFromUrl = loadArtworkFromUrl(artworkUrl, false, z3);
                    avatarBitmap = bitmapLoadArtworkFromUrl;
                } else {
                    bitmapLoadArtworkFromUrl = loadArtworkFromUrl(artworkUrl2, false, z3);
                    avatarBitmap = bitmapLoadArtworkFromUrl2;
                }
            }
        } else if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            long senderId = messageObject.getSenderId();
            if (messageObject.isFromUser()) {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(senderId));
                if (user != null) {
                    musicTitle = UserObject.getUserName(user);
                    boolean z4 = !z;
                    avatarBitmap = getAvatarBitmap(user, true, z4);
                    avatarBitmap2 = getAvatarBitmap(user, false, z4);
                    bitmapLoadArtworkFromUrl = avatarBitmap2;
                } else {
                    avatarBitmap = null;
                    bitmapLoadArtworkFromUrl = null;
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-senderId));
                if (chat != null) {
                    musicTitle = chat.title;
                    boolean z5 = !z;
                    avatarBitmap = getAvatarBitmap(chat, true, z5);
                    avatarBitmap2 = getAvatarBitmap(chat, false, z5);
                    bitmapLoadArtworkFromUrl = avatarBitmap2;
                } else {
                    avatarBitmap = null;
                    bitmapLoadArtworkFromUrl = null;
                }
            }
            if (avatarBitmap == null && bitmapLoadArtworkFromUrl != null) {
                avatarBitmap = bitmapLoadArtworkFromUrl;
            }
            musicAuthor = messageObject.isVoice() ? LocaleController.getString(R.string.AttachAudio) : LocaleController.getString(R.string.AttachRound);
        } else {
            avatarBitmap = null;
            bitmapLoadArtworkFromUrl = null;
        }
        int i3 = Build.VERSION.SDK_INT;
        boolean zIsMessagePaused = MediaController.getInstance().isMessagePaused();
        boolean z6 = !zIsMessagePaused;
        Bitmap bitmap2 = avatarBitmap;
        PendingIntent broadcast = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.previous").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent service = PendingIntent.getService(getApplicationContext(), 0, new Intent(this, getClass()).setAction(getPackageName() + ".STOP_PLAYER"), fixIntentFlags(301989888));
        PendingIntent broadcast2 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(!zIsMessagePaused ? "org.telegram.android.musicplayer.pause" : "org.telegram.android.musicplayer.play").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent broadcast3 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.next").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.seek").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent broadcast4 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.repeat").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent broadcast5 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.shuffle").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        Notification.MediaStyle mediaSession = new Notification.MediaStyle().setMediaSession((MediaSession.Token) this.mediaSession.mImpl.mToken.mInner);
        if (messageObject.isMusic()) {
            pendingIntent = broadcast5;
            pendingIntent2 = broadcast3;
            str = "org.telegram.android.musicplayer.shuffle";
            mediaSession.setShowActionsInCompactView(0, 1, 2, 3, 4);
        } else {
            pendingIntent = broadcast5;
            pendingIntent2 = broadcast3;
            str = "org.telegram.android.musicplayer.shuffle";
            if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                mediaSession.setShowActionsInCompactView(0);
            }
        }
        Notification.Builder builder = new Notification.Builder(this);
        builder.setSmallIcon(R.drawable.player).setOngoing(z6).setContentTitle(musicTitle).setContentText(musicAuthor).setSubText((audioInfo2 == null || !messageObject.isMusic()) ? null : audioInfo2.album).setContentIntent(activity).setDeleteIntent(service).setShowWhen(false).setCategory("transport").setPriority(2).setStyle(mediaSession);
        if (i3 >= 26) {
            NotificationsController.checkOtherNotificationsChannel();
            builder.setChannelId(NotificationsController.OTHER_NOTIFICATIONS_CHANNEL);
        }
        if (bitmapLoadArtworkFromUrl != null) {
            builder.setLargeIcon(bitmapLoadArtworkFromUrl);
        } else {
            builder.setLargeIcon(this.albumArtPlaceholder);
        }
        String string = LocaleController.getString(R.string.Next);
        String string2 = LocaleController.getString(R.string.AccDescrPrevious);
        this.playbackState = new PlaybackStateCompat.Builder();
        if (MediaController.getInstance().isDownloadingCurrentMessage()) {
            PlaybackStateCompat.Builder builder2 = this.playbackState;
            j2 = 1000;
            builder2.setState(6, 0L, 1.0f);
            builder2.mActions = 0L;
            if (messageObject.isMusic()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_previous, string2, broadcast).build());
            }
            builder.addAction(new Notification.Action.Builder(R.drawable.loading_animation2, LocaleController.getString(R.string.Loading), (PendingIntent) null).build());
            if (messageObject.isMusic()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_next, string, pendingIntent2).build());
            }
            musicTitle = musicTitle;
            musicAuthor = musicAuthor;
            audioInfo2 = audioInfo2;
            i3 = i3;
            str2 = null;
            messageObject2 = messageObject;
        } else {
            PendingIntent pendingIntent3 = pendingIntent2;
            j2 = 1000;
            long j3 = messageObject.isMusic() ? 2360118L : 2360070L;
            if (messageObject.isMusic()) {
                int i4 = SharedConfig.shuffleMusic ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off;
                PlaybackStateCompat.Builder builder3 = this.playbackState;
                String string3 = LocaleController.getString(R.string.ShuffleList);
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(string3)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i4 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                builder3.addCustomAction(new PlaybackStateCompat.CustomAction(str, string3, i4, null));
            }
            PlaybackStateCompat.Builder builder4 = this.playbackState;
            messageObject2 = messageObject;
            builder4.setState(!zIsMessagePaused ? 3 : 2, ((long) MediaController.getInstance().getPlayingMessageObject().audioProgressSec) * 1000, getPlaybackSpeed(z6, messageObject2));
            builder4.mActions = j3;
            if (messageObject2.isMusic()) {
                int i5 = SharedConfig.repeatMode;
                if (i5 != 1) {
                    i2 = i5 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone;
                } else {
                    i2 = R.drawable.player_new_repeatall;
                }
                PlaybackStateCompat.Builder builder5 = this.playbackState;
                String string4 = LocaleController.getString(R.string.RepeatSong);
                if (TextUtils.isEmpty("org.telegram.android.musicplayer.repeat")) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(string4)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i2 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                str2 = null;
                builder5.addCustomAction(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.repeat", string4, i2, null));
            } else {
                str2 = null;
            }
            String string5 = LocaleController.getString(!zIsMessagePaused ? R.string.AccActionPause : R.string.AccActionPlay);
            if (messageObject2.isMusic()) {
                builder.addAction(new Notification.Action.Builder(SharedConfig.shuffleMusic ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off, LocaleController.getString(R.string.ShuffleList), pendingIntent).build());
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_previous, string2, broadcast).build());
            }
            builder.addAction(new Notification.Action.Builder(!zIsMessagePaused ? R.drawable.ic_action_pause : R.drawable.ic_action_play, string5, broadcast2).build());
            if (messageObject2.isMusic()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_next, string, pendingIntent3).build());
                int i6 = SharedConfig.repeatMode;
                if (i6 != 1) {
                    i = i6 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone;
                } else {
                    i = R.drawable.player_new_repeatall;
                }
                builder.addAction(new Notification.Action.Builder(i, LocaleController.getString(R.string.RepeatSong), broadcast4).build());
            }
        }
        this.mediaSession.setPlaybackState(this.playbackState.build());
        updateRepeatMode();
        updateShuffleMode();
        zzcu zzcuVar = new zzcu(2);
        String str4 = musicAuthor;
        zzcuVar.putString("android.media.metadata.ALBUM_ARTIST", str4);
        zzcuVar.putString("android.media.metadata.ARTIST", str4);
        zzcuVar.putLong(duration, "android.media.metadata.DURATION");
        String str5 = musicTitle;
        zzcuVar.putString("android.media.metadata.TITLE", str5);
        if (audioInfo2 == null || !messageObject2.isMusic()) {
            audioInfo = audioInfo2;
            str3 = str2;
        } else {
            audioInfo = audioInfo2;
            str3 = audioInfo.album;
        }
        zzcuVar.putString("android.media.metadata.ALBUM", str3);
        if (bitmap2 == null || bitmap2.isRecycled()) {
            bitmap = bitmap2;
        } else {
            bitmap = bitmap2;
            zzcuVar.putBitmap("android.media.metadata.ALBUM_ART", bitmap);
        }
        this.mediaSession.setMetadata(zzcuVar.build());
        builder.setVisibility(1);
        Notification notificationBuild = builder.build();
        if (i3 >= 31) {
            if (this.foregroundServiceIsStarted) {
                ((NotificationManager) getSystemService("notification")).notify(5, notificationBuild);
            } else {
                this.foregroundServiceIsStarted = true;
                startForeground(5, notificationBuild);
            }
        } else if (zIsMessagePaused) {
            stopForeground(false);
            ((NotificationManager) getSystemService("notification")).notify(5, notificationBuild);
        } else {
            startForeground(5, notificationBuild);
        }
        if (this.remoteControlClient != null) {
            int id = MediaController.getInstance().getPlayingMessageObject().getId();
            if (this.notificationMessageID != id) {
                this.notificationMessageID = id;
                RemoteControlClient.MetadataEditor metadataEditorEditMetadata = this.remoteControlClient.editMetadata(true);
                metadataEditorEditMetadata.putString(2, str4);
                metadataEditorEditMetadata.putString(7, str5);
                if (audioInfo != null && !TextUtils.isEmpty(audioInfo.album)) {
                    metadataEditorEditMetadata.putString(1, audioInfo.album);
                }
                metadataEditorEditMetadata.putLong(9, ((long) MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration) * j2);
                if (bitmap != null) {
                    try {
                        metadataEditorEditMetadata.putBitmap(100, bitmap);
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                }
                metadataEditorEditMetadata.apply();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public void run() {
                        if (MusicPlayerService.this.remoteControlClient == null || MediaController.getInstance().getPlayingMessageObject() == null) {
                            return;
                        }
                        if (MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration == -9223372036854775807L) {
                            AndroidUtilities.runOnUIThread(this, 500L);
                            return;
                        }
                        RemoteControlClient.MetadataEditor metadataEditorEditMetadata2 = MusicPlayerService.this.remoteControlClient.editMetadata(false);
                        metadataEditorEditMetadata2.putLong(9, ((long) MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration) * 1000);
                        metadataEditorEditMetadata2.apply();
                        MusicPlayerService.this.remoteControlClient.setPlaybackState(MediaController.getInstance().isMessagePaused() ? 2 : 3, Math.max(((long) MediaController.getInstance().getPlayingMessageObject().audioProgressSec) * 1000, 100L), MediaController.getInstance().isMessagePaused() ? 0.0f : 1.0f);
                    }
                }, j2);
            }
            if (MediaController.getInstance().isDownloadingCurrentMessage()) {
                this.remoteControlClient.setPlaybackState(8);
                return;
            }
            RemoteControlClient.MetadataEditor metadataEditorEditMetadata2 = this.remoteControlClient.editMetadata(false);
            metadataEditorEditMetadata2.putLong(9, ((long) MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration) * 1000);
            metadataEditorEditMetadata2.apply();
            this.remoteControlClient.setPlaybackState(MediaController.getInstance().isMessagePaused() ? 2 : 3, Math.max(((long) MediaController.getInstance().getPlayingMessageObject().audioProgressSec) * 1000, 100L), MediaController.getInstance().isMessagePaused() ? 0.0f : 1.0f);
        }
    }

    private int fixIntentFlags(int i) {
        return (Build.VERSION.SDK_INT >= 31 || !XiaomiUtilities.isMIUI()) ? i : i & (-100663297);
    }

    private Bitmap getAvatarBitmap(TLObject tLObject, boolean z, boolean z2) {
        int i = z ? 600 : 100;
        try {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.FileLocation fileLocation = z ? user.photo.photo_big : user.photo.photo_small;
                if (fileLocation != null) {
                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(fileLocation, true);
                    if (pathToAttach.exists()) {
                        float f = i;
                        return ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, f, f, false);
                    }
                    if (z) {
                        if (z2) {
                            this.loadingFilePath = FileLoader.getAttachFileName(fileLocation);
                            this.imageReceiver.setImage(ImageLocation.getForUser(UserConfig.selectedAccount, user, 0), "", null, null, null, 0);
                        } else {
                            this.loadingFilePath = null;
                        }
                    }
                }
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                TLRPC.FileLocation fileLocation2 = z ? chat.photo.photo_big : chat.photo.photo_small;
                if (fileLocation2 != null) {
                    File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(fileLocation2, true);
                    if (pathToAttach2.exists()) {
                        float f2 = i;
                        return ImageLoader.loadBitmap(pathToAttach2.getAbsolutePath(), null, f2, f2, false);
                    }
                    if (z) {
                        if (z2) {
                            this.loadingFilePath = FileLoader.getAttachFileName(fileLocation2);
                            this.imageReceiver.setImage(ImageLocation.getForChat(chat, 0), "", null, null, null, 0);
                        } else {
                            this.loadingFilePath = null;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        if (z) {
            return null;
        }
        Theme.createDialogsResources(this);
        AvatarDrawable avatarDrawable = tLObject instanceof TLRPC.User ? new AvatarDrawable((TLRPC.User) tLObject) : new AvatarDrawable((TLRPC.Chat) tLObject);
        avatarDrawable.setRoundRadius(1);
        float f3 = i;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(f3), AndroidUtilities.dp(f3), Bitmap.Config.ARGB_8888);
        avatarDrawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        avatarDrawable.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    private float getPlaybackSpeed(boolean z, MessageObject messageObject) {
        if (!z) {
            return 0.0f;
        }
        if (messageObject == null) {
            return 1.0f;
        }
        if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            return MediaController.getInstance().getPlaybackSpeed(false);
        }
        return 1.0f;
    }

    public void lambda$onCreate$0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        if (!z || TextUtils.isEmpty(this.loadingFilePath)) {
            return;
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            createNotification(playingMessageObject, true);
        }
        this.loadingFilePath = null;
    }

    private Bitmap loadArtworkFromUrl(String str, boolean z, boolean z2) {
        File httpFilePath = ImageLoader.getHttpFilePath(str, "jpg");
        if (httpFilePath.exists()) {
            return ImageLoader.loadBitmap(httpFilePath.getAbsolutePath(), null, z ? 600.0f : 100.0f, z ? 600.0f : 100.0f, false);
        }
        if (z2) {
            this.loadingFilePath = httpFilePath.getAbsolutePath();
            if (!z) {
                this.imageReceiver.setImage(str, "48_48", null, null, 0L);
            }
        } else {
            this.loadingFilePath = null;
        }
        return null;
    }

    public void updatePlaybackState(long j) {
        long j2;
        int i;
        this.playbackState = new PlaybackStateCompat.Builder();
        boolean zIsMessagePaused = MediaController.getInstance().isMessagePaused();
        boolean z = !zIsMessagePaused;
        if (MediaController.getInstance().isDownloadingCurrentMessage()) {
            PlaybackStateCompat.Builder builder = this.playbackState;
            builder.setState(6, 0L, 1.0f);
            builder.mActions = 0L;
        } else {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject == null || !playingMessageObject.isMusic()) {
                j2 = 2360070;
            } else {
                int i2 = SharedConfig.shuffleMusic ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off;
                PlaybackStateCompat.Builder builder2 = this.playbackState;
                String string = LocaleController.getString(R.string.ShuffleList);
                if (TextUtils.isEmpty("org.telegram.android.musicplayer.shuffle")) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(string)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i2 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                builder2.addCustomAction(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.shuffle", string, i2, null));
                j2 = 2360118;
            }
            PlaybackStateCompat.Builder builder3 = this.playbackState;
            builder3.setState(!zIsMessagePaused ? 3 : 2, j, getPlaybackSpeed(z, playingMessageObject));
            builder3.mActions = j2;
            if (playingMessageObject != null && playingMessageObject.isMusic()) {
                int i3 = SharedConfig.repeatMode;
                if (i3 != 1) {
                    i = i3 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone;
                } else {
                    i = R.drawable.player_new_repeatall;
                }
                PlaybackStateCompat.Builder builder4 = this.playbackState;
                String string2 = LocaleController.getString(R.string.RepeatSong);
                if (TextUtils.isEmpty("org.telegram.android.musicplayer.repeat")) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(string2)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                builder4.addCustomAction(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.repeat", string2, i, null));
            }
        }
        this.mediaSession.setPlaybackState(this.playbackState.build());
    }

    public void updateRepeatMode() {
        MediaSessionCompat mediaSessionCompat = this.mediaSession;
        if (mediaSessionCompat != null) {
            int i = SharedConfig.repeatMode;
            int i2 = 2;
            if (i != 1) {
                i2 = i != 2 ? 0 : 1;
            }
            mediaSessionCompat.setRepeatMode(i2);
        }
    }

    public void updateShuffleMode() {
        MediaSessionCompat mediaSessionCompat = this.mediaSession;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.setShuffleMode(SharedConfig.shuffleMusic ? 1 : 0);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        String str2;
        if (i == NotificationCenter.messagePlayingPlayStateChanged) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                createNotification(playingMessageObject, false);
                return;
            } else {
                stopSelf();
                return;
            }
        }
        if (i == NotificationCenter.messagePlayingDidSeek) {
            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject2 == null) {
                return;
            }
            long jRound = ((long) Math.round(((Float) objArr[1]).floatValue() * playingMessageObject2.audioPlayerDuration)) * 1000;
            updatePlaybackState(jRound);
            RemoteControlClient remoteControlClient = this.remoteControlClient;
            if (remoteControlClient != null) {
                remoteControlClient.setPlaybackState(MediaController.getInstance().isMessagePaused() ? 2 : 3, jRound, MediaController.getInstance().isMessagePaused() ? 0.0f : 1.0f);
                return;
            }
            return;
        }
        if (i == NotificationCenter.httpFileDidLoad) {
            String str3 = (String) objArr[0];
            MessageObject playingMessageObject3 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject3 == null || (str2 = this.loadingFilePath) == null || !str2.equals(str3)) {
                return;
            }
            createNotification(playingMessageObject3, false);
            return;
        }
        if (i == NotificationCenter.fileLoaded) {
            String str4 = (String) objArr[0];
            MessageObject playingMessageObject4 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject4 == null || (str = this.loadingFilePath) == null || !str.equals(str4)) {
                return;
            }
            createNotification(playingMessageObject4, false);
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        this.audioManager = (AudioManager) getSystemService("audio");
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingDidSeek);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.httpFileDidLoad);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileLoaded);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.imageReceiver = imageReceiver;
        imageReceiver.setDelegate(new BillingController$$ExternalSyntheticLambda0(this, 10));
        this.mediaSession = new MediaSessionCompat(this, "telegramAudioPlayer", null, null);
        this.playbackState = new PlaybackStateCompat.Builder();
        this.albumArtPlaceholder = Bitmap.createBitmap(AndroidUtilities.dp(102.0f), AndroidUtilities.dp(102.0f), Bitmap.Config.ARGB_8888);
        Drawable drawable = getResources().getDrawable(R.drawable.nocover_big);
        drawable.setBounds(0, 0, this.albumArtPlaceholder.getWidth(), this.albumArtPlaceholder.getHeight());
        drawable.draw(new Canvas(this.albumArtPlaceholder));
        this.mediaSession.setCallback(new MediaSessionCompat.Callback() {
            @Override
            public void onCustomAction(String str, Bundle bundle) {
                if ("org.telegram.android.musicplayer.repeat".equals(str)) {
                    SharedConfig.setRepeatMode((SharedConfig.repeatMode + 1) % 3);
                    MusicPlayerService.this.updateRepeatMode();
                    AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.instance;
                    if (audioPlayerAlert != null) {
                        audioPlayerAlert.updateRepeatButton();
                    }
                } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
                    if (SharedConfig.shuffleMusic) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    } else {
                        MediaController.getInstance().setPlaybackOrderType(2);
                    }
                    MusicPlayerService.this.updateShuffleMode();
                    AudioPlayerAlert audioPlayerAlert2 = AudioPlayerAlert.instance;
                    if (audioPlayerAlert2 != null) {
                        audioPlayerAlert2.updateRepeatButton();
                    }
                }
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null) {
                    MusicPlayerService.this.createNotification(playingMessageObject, false);
                }
            }

            @Override
            public void onPause() {
                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
            }

            @Override
            public void onPlay() {
                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
            }

            @Override
            public void onSeekTo(long j) {
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null) {
                    MediaController.getInstance().seekToProgress(playingMessageObject, (j / 1000) / ((float) playingMessageObject.getDuration()));
                    MusicPlayerService.this.updatePlaybackState(j);
                }
            }

            @Override
            public void onSetRepeatMode(int i2) {
                int i3 = 2;
                if (i2 != 1) {
                    i3 = (i2 == 2 || i2 == 3) ? 1 : 0;
                }
                SharedConfig.setRepeatMode(i3);
                MusicPlayerService.this.updateRepeatMode();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null) {
                    MusicPlayerService.this.createNotification(playingMessageObject, false);
                }
            }

            @Override
            public void onSetShuffleMode(int i2) {
                if (i2 == 1 || i2 == 2) {
                    if (!SharedConfig.shuffleMusic) {
                        MediaController.getInstance().setPlaybackOrderType(2);
                    }
                } else if (SharedConfig.shuffleMusic) {
                    MediaController.getInstance().setPlaybackOrderType(0);
                }
                MusicPlayerService.this.updateShuffleMode();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null) {
                    MusicPlayerService.this.createNotification(playingMessageObject, false);
                }
            }

            @Override
            public void onSkipToNext() {
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject == null || !playingMessageObject.isMusic()) {
                    return;
                }
                MediaController.getInstance().playNextMessage();
            }

            @Override
            public void onSkipToPrevious() {
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject == null || !playingMessageObject.isMusic()) {
                    return;
                }
                MediaController.getInstance().playPreviousMessage();
            }

            @Override
            public void onStop() {
            }
        }, null);
        this.mediaSession.setActive(true);
        updateRepeatMode();
        updateShuffleMode();
        registerReceiver(this.headsetPlugReceiver, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        unregisterReceiver(this.headsetPlugReceiver);
        super.onDestroy();
        stopForeground(true);
        RemoteControlClient remoteControlClient = this.remoteControlClient;
        if (remoteControlClient != null) {
            RemoteControlClient.MetadataEditor metadataEditorEditMetadata = remoteControlClient.editMetadata(true);
            metadataEditorEditMetadata.clear();
            metadataEditorEditMetadata.apply();
            this.audioManager.unregisterRemoteControlClient(this.remoteControlClient);
        }
        MediaSessionCompat mediaSessionCompat = this.mediaSession;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.release();
        }
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingDidSeek);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.httpFileDidLoad);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.fileLoaded);
        }
    }

    @Override
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            try {
                if ((getPackageName() + ".STOP_PLAYER").equals(intent.getAction())) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                    return 2;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            AndroidUtilities.runOnUIThread(new SecretChatHelper$$ExternalSyntheticLambda22(this, 1));
            return 1;
        }
        if (supportLockScreenControls) {
            ComponentName componentName = new ComponentName(getApplicationContext(), MusicPlayerReceiver.class.getName());
            try {
                if (this.remoteControlClient == null) {
                    this.audioManager.registerMediaButtonEventReceiver(componentName);
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    RemoteControlClient remoteControlClient = new RemoteControlClient(PendingIntent.getBroadcast(this, 0, intent2, fixIntentFlags(33554432)));
                    this.remoteControlClient = remoteControlClient;
                    this.audioManager.registerRemoteControlClient(remoteControlClient);
                }
                this.remoteControlClient.setTransportControlFlags(189);
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        createNotification(playingMessageObject, false);
        return 1;
    }

    public void setListeners(RemoteViews remoteViews) {
        remoteViews.setOnClickPendingIntent(R.id.player_previous, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.previous"), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_close, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.close"), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_pause, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.pause"), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_next, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.next"), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_play, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.play"), fixIntentFlags(167772160)));
    }
}
