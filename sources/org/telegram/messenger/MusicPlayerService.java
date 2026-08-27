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
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
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
    private android.support.v4.media.session.d0 mediaSession;
    private int notificationMessageID;
    private android.support.v4.media.session.g0 playbackState;
    private RemoteControlClient remoteControlClient;

    public void createNotification(MessageObject messageObject, boolean z10) {
        long j10;
        Bitmap avatarBitmap;
        Bitmap bitmapLoadArtworkFromUrl;
        Bitmap avatarBitmap2;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        String str;
        long j11;
        MessageObject messageObject2;
        String str2;
        int i10;
        int i11;
        se.a aVar;
        String str3;
        Bitmap bitmap;
        String musicTitle = messageObject.getMusicTitle();
        String musicAuthor = messageObject.getMusicAuthor();
        se.a audioInfo = MediaController.getInstance().getAudioInfo();
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
        if (messageObject.isMusic()) {
            intent.setAction("com.tmessages.openplayer");
            intent.addCategory("android.intent.category.LAUNCHER");
        } else if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            intent.setAction("android.intent.action.VIEW");
            TLRPC.Peer peer = messageObject.messageOwner.peer_id;
            boolean z11 = peer instanceof TLRPC.TL_peerUser;
            if (z11) {
                j10 = peer.user_id;
            } else if (peer instanceof TLRPC.TL_peerChat) {
                j10 = peer.chat_id;
            } else {
                j10 = peer instanceof TLRPC.TL_peerChannel ? peer.channel_id : 0L;
            }
            if (j10 != 0) {
                if (z11) {
                    StringBuilder sbQ = a9.p.q(j10, "tg://openmessage?user_id=", "&message_id=");
                    sbQ.append(messageObject.getId());
                    intent.setData(Uri.parse(sbQ.toString()));
                } else {
                    StringBuilder sbQ2 = a9.p.q(j10, "tg://openmessage?chat_id=", "&message_id=");
                    sbQ2.append(messageObject.getId());
                    intent.setData(Uri.parse(sbQ2.toString()));
                }
            }
        }
        PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, fixIntentFlags(33554432));
        long duration = (long) (messageObject.getDuration() * 1000.0d);
        if (messageObject.isMusic()) {
            String artworkUrl = messageObject.getArtworkUrl(true);
            String artworkUrl2 = messageObject.getArtworkUrl(false);
            bitmapLoadArtworkFromUrl = audioInfo != null ? audioInfo.f47870p : null;
            avatarBitmap = audioInfo != null ? audioInfo.f47869o : null;
            this.loadingFilePath = null;
            this.imageReceiver.setImageBitmap((Drawable) null);
            if (bitmapLoadArtworkFromUrl != null || TextUtils.isEmpty(artworkUrl)) {
                this.loadingFilePath = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(messageObject.getDocument()).getAbsolutePath();
            } else {
                boolean z12 = !z10;
                Bitmap bitmapLoadArtworkFromUrl2 = loadArtworkFromUrl(artworkUrl2, true, z12);
                if (bitmapLoadArtworkFromUrl2 == null) {
                    bitmapLoadArtworkFromUrl = loadArtworkFromUrl(artworkUrl, false, z12);
                    avatarBitmap = bitmapLoadArtworkFromUrl;
                } else {
                    bitmapLoadArtworkFromUrl = loadArtworkFromUrl(artworkUrl2, false, z12);
                    avatarBitmap = bitmapLoadArtworkFromUrl2;
                }
            }
        } else if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            long senderId = messageObject.getSenderId();
            if (messageObject.isFromUser()) {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(senderId));
                if (user != null) {
                    musicTitle = UserObject.getUserName(user);
                    boolean z13 = !z10;
                    avatarBitmap = getAvatarBitmap(user, true, z13);
                    avatarBitmap2 = getAvatarBitmap(user, false, z13);
                } else {
                    avatarBitmap2 = null;
                    avatarBitmap = null;
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-senderId));
                if (chat != null) {
                    musicTitle = chat.title;
                    boolean z14 = !z10;
                    avatarBitmap = getAvatarBitmap(chat, true, z14);
                    avatarBitmap2 = getAvatarBitmap(chat, false, z14);
                } else {
                    avatarBitmap = null;
                    bitmapLoadArtworkFromUrl = null;
                }
                if (avatarBitmap == null && bitmapLoadArtworkFromUrl != null) {
                    avatarBitmap = bitmapLoadArtworkFromUrl;
                }
                if (messageObject.isVoice()) {
                    musicAuthor = LocaleController.getString(R.string.AttachAudio);
                } else {
                    musicAuthor = LocaleController.getString(R.string.AttachRound);
                }
            }
            bitmapLoadArtworkFromUrl = avatarBitmap2;
            if (avatarBitmap == null) {
                avatarBitmap = bitmapLoadArtworkFromUrl;
            }
            if (messageObject.isVoice()) {
                musicAuthor = LocaleController.getString(R.string.AttachAudio);
            } else {
                musicAuthor = LocaleController.getString(R.string.AttachRound);
            }
        } else {
            avatarBitmap = null;
            bitmapLoadArtworkFromUrl = null;
        }
        int i12 = Build.VERSION.SDK_INT;
        boolean zIsMessagePaused = MediaController.getInstance().isMessagePaused();
        boolean z15 = !zIsMessagePaused;
        Bitmap bitmap2 = avatarBitmap;
        PendingIntent broadcast = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.previous").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent service = PendingIntent.getService(getApplicationContext(), 0, new Intent(this, getClass()).setAction(getPackageName() + ".STOP_PLAYER"), fixIntentFlags(301989888));
        PendingIntent broadcast2 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(!zIsMessagePaused ? "org.telegram.android.musicplayer.pause" : "org.telegram.android.musicplayer.play").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent broadcast3 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.next").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.seek").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent broadcast4 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.repeat").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent broadcast5 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.shuffle").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        Notification.MediaStyle mediaSession = new Notification.MediaStyle().setMediaSession((MediaSession.Token) this.mediaSession.f818a.f844b.f796b);
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
        builder.setSmallIcon(R.drawable.player).setOngoing(z15).setContentTitle(musicTitle).setContentText(musicAuthor).setSubText((audioInfo == null || !messageObject.isMusic()) ? null : audioInfo.f47861f).setContentIntent(activity).setDeleteIntent(service).setShowWhen(false).setCategory("transport").setPriority(2).setStyle(mediaSession);
        if (i12 >= 26) {
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
        this.playbackState = new android.support.v4.media.session.g0();
        if (MediaController.getInstance().isDownloadingCurrentMessage()) {
            android.support.v4.media.session.g0 g0Var = this.playbackState;
            j11 = 1000;
            g0Var.c(6, 0L, 1.0f);
            g0Var.f829e = 0L;
            if (messageObject.isMusic()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_previous, string2, broadcast).build());
            }
            builder.addAction(new Notification.Action.Builder(R.drawable.loading_animation2, LocaleController.getString(R.string.Loading), (PendingIntent) null).build());
            if (messageObject.isMusic()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_next, string, pendingIntent2).build());
            }
            musicTitle = musicTitle;
            musicAuthor = musicAuthor;
            audioInfo = audioInfo;
            i12 = i12;
            str2 = null;
            messageObject2 = messageObject;
        } else {
            PendingIntent pendingIntent3 = pendingIntent2;
            j11 = 1000;
            long j12 = messageObject.isMusic() ? 2360118L : 2360070L;
            if (messageObject.isMusic()) {
                int i13 = SharedConfig.shuffleMusic ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off;
                android.support.v4.media.session.g0 g0Var2 = this.playbackState;
                String string3 = LocaleController.getString(R.string.ShuffleList);
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(string3)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i13 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                g0Var2.a(new PlaybackStateCompat.CustomAction(str, string3, i13, null));
            }
            android.support.v4.media.session.g0 g0Var3 = this.playbackState;
            messageObject2 = messageObject;
            g0Var3.c(!zIsMessagePaused ? 3 : 2, ((long) MediaController.getInstance().getPlayingMessageObject().audioProgressSec) * 1000, getPlaybackSpeed(z15, messageObject2));
            g0Var3.f829e = j12;
            if (messageObject2.isMusic()) {
                int i14 = SharedConfig.repeatMode;
                if (i14 != 1) {
                    i11 = i14 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone;
                } else {
                    i11 = R.drawable.player_new_repeatall;
                }
                android.support.v4.media.session.g0 g0Var4 = this.playbackState;
                String string4 = LocaleController.getString(R.string.RepeatSong);
                if (TextUtils.isEmpty("org.telegram.android.musicplayer.repeat")) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(string4)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i11 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                str2 = null;
                g0Var4.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.repeat", string4, i11, null));
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
                int i15 = SharedConfig.repeatMode;
                if (i15 != 1) {
                    i10 = i15 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone;
                } else {
                    i10 = R.drawable.player_new_repeatall;
                }
                builder.addAction(new Notification.Action.Builder(i10, LocaleController.getString(R.string.RepeatSong), broadcast4).build());
            }
        }
        this.mediaSession.f(this.playbackState.b());
        updateRepeatMode();
        updateShuffleMode();
        android.support.v4.media.c cVar = new android.support.v4.media.c();
        String str4 = musicAuthor;
        cVar.e("android.media.metadata.ALBUM_ARTIST", str4);
        cVar.e("android.media.metadata.ARTIST", str4);
        cVar.d(duration, "android.media.metadata.DURATION");
        String str5 = musicTitle;
        cVar.e("android.media.metadata.TITLE", str5);
        if (audioInfo == null || !messageObject2.isMusic()) {
            aVar = audioInfo;
            str3 = str2;
        } else {
            aVar = audioInfo;
            str3 = aVar.f47861f;
        }
        cVar.e("android.media.metadata.ALBUM", str3);
        if (bitmap2 == null || bitmap2.isRecycled()) {
            bitmap = bitmap2;
        } else {
            bitmap = bitmap2;
            cVar.c("android.media.metadata.ALBUM_ART", bitmap);
        }
        this.mediaSession.e(cVar.a());
        builder.setVisibility(1);
        Notification notificationBuild = builder.build();
        if (i12 >= 31) {
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
            int id2 = MediaController.getInstance().getPlayingMessageObject().getId();
            if (this.notificationMessageID != id2) {
                this.notificationMessageID = id2;
                RemoteControlClient.MetadataEditor metadataEditorEditMetadata = this.remoteControlClient.editMetadata(true);
                metadataEditorEditMetadata.putString(2, str4);
                metadataEditorEditMetadata.putString(7, str5);
                if (aVar != null && !TextUtils.isEmpty(aVar.f47861f)) {
                    metadataEditorEditMetadata.putString(1, aVar.f47861f);
                }
                metadataEditorEditMetadata.putLong(9, ((long) MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration) * j11);
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
                }, j11);
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

    private int fixIntentFlags(int i10) {
        return (Build.VERSION.SDK_INT >= 31 || !XiaomiUtilities.isMIUI()) ? i10 : i10 & (-100663297);
    }

    private Bitmap getAvatarBitmap(TLObject tLObject, boolean z10, boolean z11) {
        int i10 = z10 ? 600 : 100;
        try {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.FileLocation fileLocation = z10 ? user.photo.photo_big : user.photo.photo_small;
                if (fileLocation != null) {
                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(fileLocation, true);
                    if (pathToAttach.exists()) {
                        float f10 = i10;
                        return ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, f10, f10, false);
                    }
                    if (z10) {
                        if (z11) {
                            this.loadingFilePath = FileLoader.getAttachFileName(fileLocation);
                            this.imageReceiver.setImage(ImageLocation.getForUser(UserConfig.selectedAccount, user, 0), "", null, null, null, 0);
                        } else {
                            this.loadingFilePath = null;
                        }
                    }
                }
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                TLRPC.FileLocation fileLocation2 = z10 ? chat.photo.photo_big : chat.photo.photo_small;
                if (fileLocation2 != null) {
                    File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(fileLocation2, true);
                    if (pathToAttach2.exists()) {
                        float f11 = i10;
                        return ImageLoader.loadBitmap(pathToAttach2.getAbsolutePath(), null, f11, f11, false);
                    }
                    if (z10) {
                        if (z11) {
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
        if (z10) {
            return null;
        }
        org.telegram.ui.ActionBar.g6.R(this);
        org.telegram.ui.Components.y8 y8Var = tLObject instanceof TLRPC.User ? new org.telegram.ui.Components.y8(0, (TLRPC.User) tLObject) : new org.telegram.ui.Components.y8((TLRPC.Chat) tLObject);
        y8Var.f34860r = 1;
        float f12 = i10;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(f12), AndroidUtilities.dp(f12), Bitmap.Config.ARGB_8888);
        y8Var.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        y8Var.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    private float getPlaybackSpeed(boolean z10, MessageObject messageObject) {
        if (!z10) {
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

    public void lambda$onCreate$0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        if (!z10 || TextUtils.isEmpty(this.loadingFilePath)) {
            return;
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null) {
            createNotification(playingMessageObject, true);
        }
        this.loadingFilePath = null;
    }

    private Bitmap loadArtworkFromUrl(String str, boolean z10, boolean z11) {
        File httpFilePath = ImageLoader.getHttpFilePath(str, "jpg");
        if (httpFilePath.exists()) {
            return ImageLoader.loadBitmap(httpFilePath.getAbsolutePath(), null, z10 ? 600.0f : 100.0f, z10 ? 600.0f : 100.0f, false);
        }
        if (z11) {
            this.loadingFilePath = httpFilePath.getAbsolutePath();
            if (!z10) {
                this.imageReceiver.setImage(str, "48_48", null, null, 0L);
            }
        } else {
            this.loadingFilePath = null;
        }
        return null;
    }

    public void updatePlaybackState(long j10) {
        long j11;
        int i10;
        this.playbackState = new android.support.v4.media.session.g0();
        boolean zIsMessagePaused = MediaController.getInstance().isMessagePaused();
        boolean z10 = !zIsMessagePaused;
        if (MediaController.getInstance().isDownloadingCurrentMessage()) {
            android.support.v4.media.session.g0 g0Var = this.playbackState;
            g0Var.c(6, 0L, 1.0f);
            g0Var.f829e = 0L;
        } else {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject == null || !playingMessageObject.isMusic()) {
                j11 = 2360070;
            } else {
                int i11 = SharedConfig.shuffleMusic ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off;
                android.support.v4.media.session.g0 g0Var2 = this.playbackState;
                String string = LocaleController.getString(R.string.ShuffleList);
                if (TextUtils.isEmpty("org.telegram.android.musicplayer.shuffle")) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(string)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i11 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                g0Var2.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.shuffle", string, i11, null));
                j11 = 2360118;
            }
            android.support.v4.media.session.g0 g0Var3 = this.playbackState;
            g0Var3.c(!zIsMessagePaused ? 3 : 2, j10, getPlaybackSpeed(z10, playingMessageObject));
            g0Var3.f829e = j11;
            if (playingMessageObject != null && playingMessageObject.isMusic()) {
                int i12 = SharedConfig.repeatMode;
                if (i12 != 1) {
                    i10 = i12 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone;
                } else {
                    i10 = R.drawable.player_new_repeatall;
                }
                android.support.v4.media.session.g0 g0Var4 = this.playbackState;
                String string2 = LocaleController.getString(R.string.RepeatSong);
                if (TextUtils.isEmpty("org.telegram.android.musicplayer.repeat")) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(string2)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i10 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                g0Var4.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.repeat", string2, i10, null));
            }
        }
        this.mediaSession.f(this.playbackState.b());
    }

    public void updateRepeatMode() {
        android.support.v4.media.session.d0 d0Var = this.mediaSession;
        if (d0Var != null) {
            int i10 = SharedConfig.repeatMode;
            int i11 = 2;
            if (i10 != 1) {
                i11 = i10 != 2 ? 0 : 1;
            }
            d0Var.h(i11);
        }
    }

    public void updateShuffleMode() {
        android.support.v4.media.session.d0 d0Var = this.mediaSession;
        if (d0Var != null) {
            d0Var.i(SharedConfig.shuffleMusic ? 1 : 0);
        }
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        String str2;
        if (i10 == NotificationCenter.messagePlayingPlayStateChanged) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                createNotification(playingMessageObject, false);
                return;
            } else {
                stopSelf();
                return;
            }
        }
        if (i10 == NotificationCenter.messagePlayingDidSeek) {
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
        if (i10 == NotificationCenter.httpFileDidLoad) {
            String str3 = (String) objArr[0];
            MessageObject playingMessageObject3 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject3 == null || (str2 = this.loadingFilePath) == null || !str2.equals(str3)) {
                return;
            }
            createNotification(playingMessageObject3, false);
            return;
        }
        if (i10 == NotificationCenter.fileLoaded) {
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
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidSeek);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.httpFileDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.imageReceiver = imageReceiver;
        imageReceiver.setDelegate(new d(this, 10));
        this.mediaSession = new android.support.v4.media.session.d0(this, "telegramAudioPlayer", null, null);
        this.playbackState = new android.support.v4.media.session.g0();
        this.albumArtPlaceholder = Bitmap.createBitmap(AndroidUtilities.dp(102.0f), AndroidUtilities.dp(102.0f), Bitmap.Config.ARGB_8888);
        Drawable drawable = getResources().getDrawable(R.drawable.nocover_big);
        drawable.setBounds(0, 0, this.albumArtPlaceholder.getWidth(), this.albumArtPlaceholder.getHeight());
        drawable.draw(new Canvas(this.albumArtPlaceholder));
        this.mediaSession.d(new android.support.v4.media.session.t() {
            @Override
            public void onCustomAction(String str, Bundle bundle) {
                if ("org.telegram.android.musicplayer.repeat".equals(str)) {
                    SharedConfig.setRepeatMode((SharedConfig.repeatMode + 1) % 3);
                    MusicPlayerService.this.updateRepeatMode();
                    org.telegram.ui.Components.b8 b8Var = org.telegram.ui.Components.b8.P0;
                    if (b8Var != null) {
                        b8Var.H0();
                    }
                } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
                    if (SharedConfig.shuffleMusic) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    } else {
                        MediaController.getInstance().setPlaybackOrderType(2);
                    }
                    MusicPlayerService.this.updateShuffleMode();
                    org.telegram.ui.Components.b8 b8Var2 = org.telegram.ui.Components.b8.P0;
                    if (b8Var2 != null) {
                        b8Var2.H0();
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
            public void onSeekTo(long j10) {
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null) {
                    MediaController.getInstance().seekToProgress(playingMessageObject, (j10 / 1000) / ((float) playingMessageObject.getDuration()));
                    MusicPlayerService.this.updatePlaybackState(j10);
                }
            }

            @Override
            public void onSetRepeatMode(int i11) {
                int i12 = 2;
                if (i11 != 1) {
                    i12 = (i11 == 2 || i11 == 3) ? 1 : 0;
                }
                SharedConfig.setRepeatMode(i12);
                MusicPlayerService.this.updateRepeatMode();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null) {
                    MusicPlayerService.this.createNotification(playingMessageObject, false);
                }
            }

            @Override
            public void onSetShuffleMode(int i11) {
                if (i11 == 1 || i11 == 2) {
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
        this.mediaSession.c(true);
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
        android.support.v4.media.session.d0 d0Var = this.mediaSession;
        if (d0Var != null) {
            d0Var.b();
        }
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidSeek);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.httpFileDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileLoaded);
        }
    }

    @Override
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (intent != null) {
            try {
                if ((getPackageName() + ".STOP_PLAYER").equals(intent.getAction())) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                    return 2;
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            AndroidUtilities.runOnUIThread(new rg(this, 0));
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
            } catch (Exception e10) {
                FileLog.e(e10);
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
