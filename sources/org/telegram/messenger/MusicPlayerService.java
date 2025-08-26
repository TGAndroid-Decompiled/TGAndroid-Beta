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
import android.media.MediaMetadata;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.audioinfo.AudioInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.LaunchActivity;

public class MusicPlayerService extends Service implements NotificationCenter.NotificationCenterDelegate {
    private static final int ID_NOTIFICATION = 5;
    public static final String NOTIFY_CLOSE = "org.telegram.android.musicplayer.close";
    public static final String NOTIFY_NEXT = "org.telegram.android.musicplayer.next";
    public static final String NOTIFY_PAUSE = "org.telegram.android.musicplayer.pause";
    public static final String NOTIFY_PLAY = "org.telegram.android.musicplayer.play";
    public static final String NOTIFY_PREVIOUS = "org.telegram.android.musicplayer.previous";
    public static final String NOTIFY_SEEK = "org.telegram.android.musicplayer.seek";
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
    private MediaSession mediaSession;
    private int notificationMessageID;
    private PlaybackState.Builder playbackState;
    private RemoteControlClient remoteControlClient;

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
        imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
            @Override
            public final void didSetImage(ImageReceiver imageReceiver2, boolean z, boolean z2, boolean z3) {
                MusicPlayerService.this.lambda$onCreate$0(imageReceiver2, z, z2, z3);
            }

            @Override
            public void didSetImageBitmap(int i2, String str, Drawable drawable) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i2, str, drawable);
            }

            @Override
            public void onAnimationReady(ImageReceiver imageReceiver2) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver2);
            }
        });
        this.mediaSession = new MediaSession(this, "telegramAudioPlayer");
        this.playbackState = new PlaybackState.Builder();
        this.albumArtPlaceholder = Bitmap.createBitmap(AndroidUtilities.dp(102.0f), AndroidUtilities.dp(102.0f), Bitmap.Config.ARGB_8888);
        Drawable drawable = getResources().getDrawable(R.drawable.nocover_big);
        drawable.setBounds(0, 0, this.albumArtPlaceholder.getWidth(), this.albumArtPlaceholder.getHeight());
        drawable.draw(new Canvas(this.albumArtPlaceholder));
        this.mediaSession.setCallback(new MediaSession.Callback() {
            @Override
            public void onStop() {
            }

            @Override
            public void onPlay() {
                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
            }

            @Override
            public void onPause() {
                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
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
            public void onSeekTo(long j) {
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null) {
                    MediaController.getInstance().seekToProgress(playingMessageObject, ((float) (j / 1000)) / ((float) playingMessageObject.getDuration()));
                    MusicPlayerService.this.updatePlaybackState(j);
                }
            }
        });
        this.mediaSession.setActive(true);
        registerReceiver(this.headsetPlugReceiver, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        super.onCreate();
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
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MusicPlayerService.this.stopSelf();
                }
            });
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

    private Bitmap loadArtworkFromUrl(String str, boolean z, boolean z2) {
        ImageLoader.getHttpFileName(str);
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

    private Bitmap getAvatarBitmap(TLObject tLObject, boolean z, boolean z2) {
        AvatarDrawable avatarDrawable;
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
                            this.imageReceiver.setImage(ImageLocation.getForUser(user, 0), "", null, null, null, 0);
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
        if (tLObject instanceof TLRPC.User) {
            avatarDrawable = new AvatarDrawable((TLRPC.User) tLObject);
        } else {
            avatarDrawable = new AvatarDrawable((TLRPC.Chat) tLObject);
        }
        avatarDrawable.setRoundRadius(1);
        float f3 = i;
        Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(f3), AndroidUtilities.dp(f3), Bitmap.Config.ARGB_8888);
        avatarDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        avatarDrawable.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    private void createNotification(MessageObject messageObject, boolean z) {
        long j;
        Bitmap avatarBitmap;
        Bitmap avatarBitmap2;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        boolean z2;
        String str;
        String str2;
        Bitmap bitmap4;
        String musicTitle = messageObject.getMusicTitle();
        String musicAuthor = messageObject.getMusicAuthor();
        AudioInfo audioInfo = MediaController.getInstance().getAudioInfo();
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
        if (messageObject.isMusic()) {
            intent.setAction("com.tmessages.openplayer");
            intent.addCategory("android.intent.category.LAUNCHER");
        } else if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            intent.setAction("android.intent.action.VIEW");
            TLRPC.Peer peer = messageObject.messageOwner.peer_id;
            boolean z3 = peer instanceof TLRPC.TL_peerUser;
            if (z3) {
                j = peer.user_id;
            } else if (peer instanceof TLRPC.TL_peerChat) {
                j = peer.chat_id;
            } else {
                j = peer instanceof TLRPC.TL_peerChannel ? peer.channel_id : 0L;
            }
            if (j != 0) {
                if (z3) {
                    intent.setData(Uri.parse("tg://openmessage?user_id=" + j + "&message_id=" + messageObject.getId()));
                } else {
                    intent.setData(Uri.parse("tg://openmessage?chat_id=" + j + "&message_id=" + messageObject.getId()));
                }
            }
        }
        PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, fixIntentFlags(33554432));
        long duration = (long) (messageObject.getDuration() * 1000.0d);
        if (messageObject.isMusic()) {
            String artworkUrl = messageObject.getArtworkUrl(true);
            String artworkUrl2 = messageObject.getArtworkUrl(false);
            bitmap = audioInfo != null ? audioInfo.getSmallCover() : null;
            bitmap2 = audioInfo != null ? audioInfo.getCover() : null;
            this.loadingFilePath = null;
            this.imageReceiver.setImageBitmap((Drawable) null);
            if (bitmap == null && !TextUtils.isEmpty(artworkUrl)) {
                boolean z4 = !z;
                bitmap2 = loadArtworkFromUrl(artworkUrl2, true, z4);
                if (bitmap2 == null) {
                    bitmap = loadArtworkFromUrl(artworkUrl, false, z4);
                    bitmap3 = bitmap;
                } else {
                    bitmap = loadArtworkFromUrl(artworkUrl2, false, z4);
                }
            } else {
                this.loadingFilePath = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(messageObject.getDocument()).getAbsolutePath();
            }
            bitmap3 = bitmap2;
        } else if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            long senderId = messageObject.getSenderId();
            if (messageObject.isFromUser()) {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(senderId));
                if (user != null) {
                    musicTitle = UserObject.getUserName(user);
                    boolean z5 = !z;
                    avatarBitmap = getAvatarBitmap(user, true, z5);
                    avatarBitmap2 = getAvatarBitmap(user, false, z5);
                    bitmap = avatarBitmap2;
                }
                avatarBitmap = null;
                bitmap = null;
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-senderId));
                if (chat != null) {
                    musicTitle = chat.title;
                    boolean z6 = !z;
                    avatarBitmap = getAvatarBitmap(chat, true, z6);
                    avatarBitmap2 = getAvatarBitmap(chat, false, z6);
                    bitmap = avatarBitmap2;
                }
                avatarBitmap = null;
                bitmap = null;
            }
            bitmap2 = (avatarBitmap != null || bitmap == null) ? avatarBitmap : bitmap;
            musicAuthor = messageObject.isVoice() ? LocaleController.getString(R.string.AttachAudio) : LocaleController.getString(R.string.AttachRound);
            bitmap3 = bitmap2;
        } else {
            bitmap3 = null;
            bitmap = null;
        }
        int i = Build.VERSION.SDK_INT;
        boolean isMessagePaused = MediaController.getInstance().isMessagePaused();
        boolean z7 = !isMessagePaused;
        Bitmap bitmap5 = bitmap3;
        PendingIntent broadcast = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.previous").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent service = PendingIntent.getService(getApplicationContext(), 0, new Intent(this, getClass()).setAction(getPackageName() + ".STOP_PLAYER"), fixIntentFlags(301989888));
        PendingIntent broadcast2 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(!isMessagePaused ? "org.telegram.android.musicplayer.pause" : "org.telegram.android.musicplayer.play").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent broadcast3 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.next").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.seek").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        Notification.MediaStyle mediaSession = new Notification.MediaStyle().setMediaSession(this.mediaSession.getSessionToken());
        if (messageObject.isMusic()) {
            z2 = isMessagePaused;
            mediaSession.setShowActionsInCompactView(0, 1, 2);
        } else {
            z2 = isMessagePaused;
            if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                mediaSession.setShowActionsInCompactView(0);
            }
        }
        Notification.Builder builder = new Notification.Builder(this);
        builder.setSmallIcon(R.drawable.player).setOngoing(z7).setContentTitle(musicTitle).setContentText(musicAuthor).setSubText((audioInfo == null || !messageObject.isMusic()) ? null : audioInfo.getAlbum()).setContentIntent(activity).setDeleteIntent(service).setShowWhen(false).setCategory("transport").setPriority(2).setStyle(mediaSession);
        if (i >= 26) {
            NotificationsController.checkOtherNotificationsChannel();
            builder.setChannelId(NotificationsController.OTHER_NOTIFICATIONS_CHANNEL);
        }
        if (bitmap != null) {
            builder.setLargeIcon(bitmap);
        } else {
            builder.setLargeIcon(this.albumArtPlaceholder);
        }
        String string = LocaleController.getString(R.string.Next);
        String string2 = LocaleController.getString(R.string.AccDescrPrevious);
        if (MediaController.getInstance().isDownloadingCurrentMessage()) {
            this.playbackState.setState(6, 0L, 1.0f).setActions(0L);
            if (messageObject.isMusic()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_previous, string2, broadcast).build());
            }
            builder.addAction(new Notification.Action.Builder(R.drawable.loading_animation2, LocaleController.getString(R.string.Loading), (PendingIntent) null).build());
            if (messageObject.isMusic()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_next, string, broadcast3).build());
            }
            str = musicTitle;
            str2 = musicAuthor;
        } else {
            str = musicTitle;
            str2 = musicAuthor;
            this.playbackState.setState(!z2 ? 3 : 2, MediaController.getInstance().getPlayingMessageObject().audioProgressSec * 1000, getPlaybackSpeed(z7, messageObject)).setActions(messageObject.isMusic() ? 822L : 774L);
            String string3 = LocaleController.getString(!z2 ? R.string.AccActionPause : R.string.AccActionPlay);
            if (messageObject.isMusic()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_previous, string2, broadcast).build());
            }
            builder.addAction(new Notification.Action.Builder(!z2 ? R.drawable.ic_action_pause : R.drawable.ic_action_play, string3, broadcast2).build());
            if (messageObject.isMusic()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_next, string, broadcast3).build());
            }
        }
        this.mediaSession.setPlaybackState(this.playbackState.build());
        String str3 = str2;
        String str4 = str;
        MediaMetadata.Builder putString = new MediaMetadata.Builder().putString("android.media.metadata.ALBUM_ARTIST", str3).putString("android.media.metadata.ARTIST", str3).putLong("android.media.metadata.DURATION", duration).putString("android.media.metadata.TITLE", str4).putString("android.media.metadata.ALBUM", (audioInfo == null || !messageObject.isMusic()) ? null : audioInfo.getAlbum());
        if (bitmap5 == null || bitmap5.isRecycled()) {
            bitmap4 = bitmap5;
        } else {
            bitmap4 = bitmap5;
            putString.putBitmap("android.media.metadata.ALBUM_ART", bitmap4);
        }
        this.mediaSession.setMetadata(putString.build());
        builder.setVisibility(1);
        Notification build = builder.build();
        if (i >= 31) {
            if (!this.foregroundServiceIsStarted) {
                this.foregroundServiceIsStarted = true;
                startForeground(5, build);
            } else {
                ((NotificationManager) getSystemService("notification")).notify(5, build);
            }
        } else if (!z2) {
            startForeground(5, build);
        } else {
            stopForeground(false);
            ((NotificationManager) getSystemService("notification")).notify(5, build);
        }
        if (this.remoteControlClient != null) {
            int id = MediaController.getInstance().getPlayingMessageObject().getId();
            if (this.notificationMessageID != id) {
                this.notificationMessageID = id;
                RemoteControlClient.MetadataEditor editMetadata = this.remoteControlClient.editMetadata(true);
                editMetadata.putString(2, str3);
                editMetadata.putString(7, str4);
                if (audioInfo != null && !TextUtils.isEmpty(audioInfo.getAlbum())) {
                    editMetadata.putString(1, audioInfo.getAlbum());
                }
                editMetadata.putLong(9, MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration * 1000);
                if (bitmap4 != null) {
                    try {
                        editMetadata.putBitmap(100, bitmap4);
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                }
                editMetadata.apply();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public void run() {
                        if (MusicPlayerService.this.remoteControlClient == null || MediaController.getInstance().getPlayingMessageObject() == null) {
                            return;
                        }
                        if (MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration != -9223372036854775807L) {
                            RemoteControlClient.MetadataEditor editMetadata2 = MusicPlayerService.this.remoteControlClient.editMetadata(false);
                            editMetadata2.putLong(9, MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration * 1000);
                            editMetadata2.apply();
                            MusicPlayerService.this.remoteControlClient.setPlaybackState(MediaController.getInstance().isMessagePaused() ? 2 : 3, Math.max(MediaController.getInstance().getPlayingMessageObject().audioProgressSec * 1000, 100L), MediaController.getInstance().isMessagePaused() ? 0.0f : 1.0f);
                            return;
                        }
                        AndroidUtilities.runOnUIThread(this, 500L);
                    }
                }, 1000L);
            }
            if (MediaController.getInstance().isDownloadingCurrentMessage()) {
                this.remoteControlClient.setPlaybackState(8);
                return;
            }
            RemoteControlClient.MetadataEditor editMetadata2 = this.remoteControlClient.editMetadata(false);
            editMetadata2.putLong(9, MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration * 1000);
            editMetadata2.apply();
            this.remoteControlClient.setPlaybackState(MediaController.getInstance().isMessagePaused() ? 2 : 3, Math.max(MediaController.getInstance().getPlayingMessageObject().audioProgressSec * 1000, 100L), MediaController.getInstance().isMessagePaused() ? 0.0f : 1.0f);
        }
    }

    public void updatePlaybackState(long j) {
        boolean isMessagePaused = MediaController.getInstance().isMessagePaused();
        boolean z = !isMessagePaused;
        if (MediaController.getInstance().isDownloadingCurrentMessage()) {
            this.playbackState.setState(6, 0L, 1.0f).setActions(0L);
        } else {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            this.playbackState.setState(!isMessagePaused ? 3 : 2, j, getPlaybackSpeed(z, playingMessageObject)).setActions((playingMessageObject == null || !playingMessageObject.isMusic()) ? 774L : 822L);
        }
        this.mediaSession.setPlaybackState(this.playbackState.build());
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

    public void setListeners(RemoteViews remoteViews) {
        remoteViews.setOnClickPendingIntent(R.id.player_previous, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.previous"), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_close, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.close"), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_pause, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.pause"), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_next, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.next"), fixIntentFlags(167772160)));
        remoteViews.setOnClickPendingIntent(R.id.player_play, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.play"), fixIntentFlags(167772160)));
    }

    private int fixIntentFlags(int i) {
        return (Build.VERSION.SDK_INT >= 31 || !XiaomiUtilities.isMIUI()) ? i : i & (-100663297);
    }

    @Override
    public void onDestroy() {
        unregisterReceiver(this.headsetPlugReceiver);
        super.onDestroy();
        stopForeground(true);
        RemoteControlClient remoteControlClient = this.remoteControlClient;
        if (remoteControlClient != null) {
            RemoteControlClient.MetadataEditor editMetadata = remoteControlClient.editMetadata(true);
            editMetadata.clear();
            editMetadata.apply();
            this.audioManager.unregisterRemoteControlClient(this.remoteControlClient);
        }
        this.mediaSession.release();
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingDidSeek);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.httpFileDidLoad);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.fileLoaded);
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
            if (MediaController.getInstance().getPlayingMessageObject() == null) {
                return;
            }
            long round = Math.round(r3.audioPlayerDuration * ((Float) objArr[1]).floatValue()) * 1000;
            updatePlaybackState(round);
            RemoteControlClient remoteControlClient = this.remoteControlClient;
            if (remoteControlClient != null) {
                remoteControlClient.setPlaybackState(MediaController.getInstance().isMessagePaused() ? 2 : 3, round, MediaController.getInstance().isMessagePaused() ? 0.0f : 1.0f);
                return;
            }
            return;
        }
        if (i == NotificationCenter.httpFileDidLoad) {
            String str3 = (String) objArr[0];
            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject2 == null || (str2 = this.loadingFilePath) == null || !str2.equals(str3)) {
                return;
            }
            createNotification(playingMessageObject2, false);
            return;
        }
        if (i == NotificationCenter.fileLoaded) {
            String str4 = (String) objArr[0];
            MessageObject playingMessageObject3 = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject3 == null || (str = this.loadingFilePath) == null || !str.equals(str4)) {
                return;
            }
            createNotification(playingMessageObject3, false);
        }
    }
}
