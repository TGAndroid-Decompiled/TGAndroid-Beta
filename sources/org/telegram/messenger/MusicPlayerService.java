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
import android.content.res.Resources;
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
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
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

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() throws Resources.NotFoundException {
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
            public final void didSetImage(ImageReceiver imageReceiver2, boolean z, boolean z2, boolean z3) throws IllegalArgumentException {
                this.f$0.lambda$onCreate$0(imageReceiver2, z, z2, z3);
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
        this.mediaSession = new MediaSessionCompat(this, "telegramAudioPlayer");
        this.playbackState = new PlaybackStateCompat.Builder();
        this.albumArtPlaceholder = Bitmap.createBitmap(AndroidUtilities.dp(102.0f), AndroidUtilities.dp(102.0f), Bitmap.Config.ARGB_8888);
        Drawable drawable = getResources().getDrawable(R.drawable.nocover_big);
        drawable.setBounds(0, 0, this.albumArtPlaceholder.getWidth(), this.albumArtPlaceholder.getHeight());
        drawable.draw(new Canvas(this.albumArtPlaceholder));
        this.mediaSession.setCallback(new MediaSessionCompat.Callback() {
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
                    MediaController.getInstance().seekToProgress(playingMessageObject, (j / 1000) / ((float) playingMessageObject.getDuration()));
                    MusicPlayerService.this.updatePlaybackState(j);
                }
            }

            @Override
            public void onSetRepeatMode(int i2) throws IllegalArgumentException {
                SharedConfig.setRepeatMode(i2 != 1 ? (i2 == 2 || i2 == 3) ? 1 : 0 : 2);
                MusicPlayerService.this.updateRepeatMode();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null) {
                    MusicPlayerService.this.createNotification(playingMessageObject, false);
                }
            }

            @Override
            public void onSetShuffleMode(int i2) throws IllegalArgumentException {
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
            public void onCustomAction(String str, Bundle bundle) throws IllegalArgumentException {
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
        });
        this.mediaSession.setActive(true);
        updateRepeatMode();
        updateShuffleMode();
        registerReceiver(this.headsetPlugReceiver, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        super.onCreate();
    }

    public void lambda$onCreate$0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) throws IllegalArgumentException {
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
                    this.f$0.stopSelf();
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
        if (tLObject instanceof TLRPC.User) {
            avatarDrawable = new AvatarDrawable((TLRPC.User) tLObject);
        } else {
            avatarDrawable = new AvatarDrawable((TLRPC.Chat) tLObject);
        }
        avatarDrawable.setRoundRadius(1);
        float f3 = i;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(f3), AndroidUtilities.dp(f3), Bitmap.Config.ARGB_8888);
        avatarDrawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        avatarDrawable.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public void createNotification(MessageObject messageObject, boolean z) throws IllegalArgumentException {
        long j;
        Bitmap avatarBitmap;
        Bitmap avatarBitmap2;
        Bitmap smallCover;
        Bitmap cover;
        Bitmap bitmap;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        String str;
        AudioInfo audioInfo;
        int i;
        int i2;
        int i3;
        Bitmap bitmap2;
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
            smallCover = audioInfo2 != null ? audioInfo2.getSmallCover() : null;
            cover = audioInfo2 != null ? audioInfo2.getCover() : null;
            this.loadingFilePath = null;
            this.imageReceiver.setImageBitmap((Drawable) null);
            if (smallCover == null && !TextUtils.isEmpty(artworkUrl)) {
                boolean z3 = !z;
                cover = loadArtworkFromUrl(artworkUrl2, true, z3);
                if (cover == null) {
                    smallCover = loadArtworkFromUrl(artworkUrl, false, z3);
                    bitmap = smallCover;
                } else {
                    smallCover = loadArtworkFromUrl(artworkUrl2, false, z3);
                }
            } else {
                this.loadingFilePath = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(messageObject.getDocument()).getAbsolutePath();
            }
            bitmap = cover;
        } else if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            long senderId = messageObject.getSenderId();
            if (messageObject.isFromUser()) {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(senderId));
                if (user != null) {
                    musicTitle = UserObject.getUserName(user);
                    boolean z4 = !z;
                    avatarBitmap = getAvatarBitmap(user, true, z4);
                    avatarBitmap2 = getAvatarBitmap(user, false, z4);
                    smallCover = avatarBitmap2;
                }
                avatarBitmap = null;
                smallCover = null;
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-senderId));
                if (chat != null) {
                    musicTitle = chat.title;
                    boolean z5 = !z;
                    avatarBitmap = getAvatarBitmap(chat, true, z5);
                    avatarBitmap2 = getAvatarBitmap(chat, false, z5);
                    smallCover = avatarBitmap2;
                }
                avatarBitmap = null;
                smallCover = null;
            }
            cover = (avatarBitmap != null || smallCover == null) ? avatarBitmap : smallCover;
            musicAuthor = messageObject.isVoice() ? LocaleController.getString(R.string.AttachAudio) : LocaleController.getString(R.string.AttachRound);
            bitmap = cover;
        } else {
            bitmap = null;
            smallCover = null;
        }
        int i4 = Build.VERSION.SDK_INT;
        boolean zIsMessagePaused = MediaController.getInstance().isMessagePaused();
        boolean z6 = !zIsMessagePaused;
        Bitmap bitmap3 = bitmap;
        PendingIntent broadcast = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.previous").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent service = PendingIntent.getService(getApplicationContext(), 0, new Intent(this, getClass()).setAction(getPackageName() + ".STOP_PLAYER"), fixIntentFlags(301989888));
        PendingIntent broadcast2 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(!zIsMessagePaused ? "org.telegram.android.musicplayer.pause" : "org.telegram.android.musicplayer.play").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent broadcast3 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.next").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.seek").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent broadcast4 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.repeat").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        PendingIntent broadcast5 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.shuffle").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), fixIntentFlags(301989888));
        Notification.MediaStyle mediaSession = new Notification.MediaStyle().setMediaSession((MediaSession.Token) this.mediaSession.getSessionToken().getToken());
        if (messageObject.isMusic()) {
            pendingIntent = broadcast5;
            pendingIntent2 = broadcast;
            str = "org.telegram.android.musicplayer.shuffle";
            mediaSession.setShowActionsInCompactView(0, 1, 2, 3, 4);
        } else {
            pendingIntent = broadcast5;
            pendingIntent2 = broadcast;
            str = "org.telegram.android.musicplayer.shuffle";
            if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                mediaSession.setShowActionsInCompactView(0);
            }
        }
        Notification.Builder builder = new Notification.Builder(this);
        builder.setSmallIcon(R.drawable.player).setOngoing(z6).setContentTitle(musicTitle).setContentText(musicAuthor).setSubText((audioInfo2 == null || !messageObject.isMusic()) ? null : audioInfo2.getAlbum()).setContentIntent(activity).setDeleteIntent(service).setShowWhen(false).setCategory("transport").setPriority(2).setStyle(mediaSession);
        if (i4 >= 26) {
            NotificationsController.checkOtherNotificationsChannel();
            builder.setChannelId(NotificationsController.OTHER_NOTIFICATIONS_CHANNEL);
        }
        if (smallCover != null) {
            builder.setLargeIcon(smallCover);
        } else {
            builder.setLargeIcon(this.albumArtPlaceholder);
        }
        String string = LocaleController.getString(R.string.Next);
        String string2 = LocaleController.getString(R.string.AccDescrPrevious);
        this.playbackState = new PlaybackStateCompat.Builder();
        if (MediaController.getInstance().isDownloadingCurrentMessage()) {
            this.playbackState.setState(6, 0L, 1.0f).setActions(0L);
            if (messageObject.isMusic()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_previous, string2, pendingIntent2).build());
            }
            builder.addAction(new Notification.Action.Builder(R.drawable.loading_animation2, LocaleController.getString(R.string.Loading), (PendingIntent) null).build());
            if (messageObject.isMusic()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_next, string, broadcast3).build());
            }
            audioInfo = audioInfo2;
            i = i4;
        } else {
            PendingIntent pendingIntent3 = pendingIntent2;
            long j2 = messageObject.isMusic() ? 2360118L : 2360070L;
            if (messageObject.isMusic()) {
                i = i4;
                audioInfo = audioInfo2;
                this.playbackState.addCustomAction(new PlaybackStateCompat.CustomAction.Builder(str, LocaleController.getString(R.string.ShuffleList), SharedConfig.shuffleMusic ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off).build());
            } else {
                audioInfo = audioInfo2;
                i = i4;
            }
            this.playbackState.setState(!zIsMessagePaused ? 3 : 2, MediaController.getInstance().getPlayingMessageObject().audioProgressSec * 1000, getPlaybackSpeed(z6, messageObject)).setActions(j2);
            if (messageObject.isMusic()) {
                int i5 = SharedConfig.repeatMode;
                if (i5 == 1) {
                    i3 = R.drawable.player_new_repeatall;
                } else if (i5 == 2) {
                    i3 = R.drawable.player_new_repeatone;
                } else {
                    i3 = R.drawable.player_new_repeat_off;
                }
                this.playbackState.addCustomAction(new PlaybackStateCompat.CustomAction.Builder("org.telegram.android.musicplayer.repeat", LocaleController.getString(R.string.RepeatSong), i3).build());
            }
            String string3 = LocaleController.getString(!zIsMessagePaused ? R.string.AccActionPause : R.string.AccActionPlay);
            if (messageObject.isMusic()) {
                builder.addAction(new Notification.Action.Builder(SharedConfig.shuffleMusic ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off, LocaleController.getString(R.string.ShuffleList), pendingIntent).build());
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_previous, string2, pendingIntent3).build());
            }
            builder.addAction(new Notification.Action.Builder(!zIsMessagePaused ? R.drawable.ic_action_pause : R.drawable.ic_action_play, string3, broadcast2).build());
            if (messageObject.isMusic()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_next, string, broadcast3).build());
                int i6 = SharedConfig.repeatMode;
                if (i6 == 1) {
                    i2 = R.drawable.player_new_repeatall;
                } else if (i6 == 2) {
                    i2 = R.drawable.player_new_repeatone;
                } else {
                    i2 = R.drawable.player_new_repeat_off;
                }
                builder.addAction(new Notification.Action.Builder(i2, LocaleController.getString(R.string.RepeatSong), broadcast4).build());
            }
        }
        this.mediaSession.setPlaybackState(this.playbackState.build());
        updateRepeatMode();
        updateShuffleMode();
        MediaMetadataCompat.Builder builderPutString = new MediaMetadataCompat.Builder().putString("android.media.metadata.ALBUM_ARTIST", musicAuthor).putString("android.media.metadata.ARTIST", musicAuthor).putLong("android.media.metadata.DURATION", duration).putString("android.media.metadata.TITLE", musicTitle).putString("android.media.metadata.ALBUM", (audioInfo == null || !messageObject.isMusic()) ? null : audioInfo.getAlbum());
        if (bitmap3 == null || bitmap3.isRecycled()) {
            bitmap2 = bitmap3;
        } else {
            bitmap2 = bitmap3;
            builderPutString.putBitmap("android.media.metadata.ALBUM_ART", bitmap2);
        }
        this.mediaSession.setMetadata(builderPutString.build());
        builder.setVisibility(1);
        Notification notificationBuild = builder.build();
        if (i >= 31) {
            if (!this.foregroundServiceIsStarted) {
                this.foregroundServiceIsStarted = true;
                startForeground(5, notificationBuild);
            } else {
                ((NotificationManager) getSystemService("notification")).notify(5, notificationBuild);
            }
        } else if (!zIsMessagePaused) {
            startForeground(5, notificationBuild);
        } else {
            stopForeground(false);
            ((NotificationManager) getSystemService("notification")).notify(5, notificationBuild);
        }
        if (this.remoteControlClient != null) {
            int id = MediaController.getInstance().getPlayingMessageObject().getId();
            if (this.notificationMessageID != id) {
                this.notificationMessageID = id;
                RemoteControlClient.MetadataEditor metadataEditorEditMetadata = this.remoteControlClient.editMetadata(true);
                metadataEditorEditMetadata.putString(2, musicAuthor);
                metadataEditorEditMetadata.putString(7, musicTitle);
                if (audioInfo != null && !TextUtils.isEmpty(audioInfo.getAlbum())) {
                    metadataEditorEditMetadata.putString(1, audioInfo.getAlbum());
                }
                metadataEditorEditMetadata.putLong(9, MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration * 1000);
                if (bitmap2 != null) {
                    try {
                        metadataEditorEditMetadata.putBitmap(100, bitmap2);
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                }
                metadataEditorEditMetadata.apply();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public void run() throws IllegalArgumentException {
                        if (MusicPlayerService.this.remoteControlClient == null || MediaController.getInstance().getPlayingMessageObject() == null) {
                            return;
                        }
                        if (MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration != -9223372036854775807L) {
                            RemoteControlClient.MetadataEditor metadataEditorEditMetadata2 = MusicPlayerService.this.remoteControlClient.editMetadata(false);
                            metadataEditorEditMetadata2.putLong(9, MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration * 1000);
                            metadataEditorEditMetadata2.apply();
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
            RemoteControlClient.MetadataEditor metadataEditorEditMetadata2 = this.remoteControlClient.editMetadata(false);
            metadataEditorEditMetadata2.putLong(9, MediaController.getInstance().getPlayingMessageObject().audioPlayerDuration * 1000);
            metadataEditorEditMetadata2.apply();
            this.remoteControlClient.setPlaybackState(MediaController.getInstance().isMessagePaused() ? 2 : 3, Math.max(MediaController.getInstance().getPlayingMessageObject().audioProgressSec * 1000, 100L), MediaController.getInstance().isMessagePaused() ? 0.0f : 1.0f);
        }
    }

    public void updatePlaybackState(long j) {
        long j2;
        int i;
        this.playbackState = new PlaybackStateCompat.Builder();
        boolean zIsMessagePaused = MediaController.getInstance().isMessagePaused();
        boolean z = !zIsMessagePaused;
        if (MediaController.getInstance().isDownloadingCurrentMessage()) {
            this.playbackState.setState(6, 0L, 1.0f).setActions(0L);
        } else {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject == null || !playingMessageObject.isMusic()) {
                j2 = 2360070;
            } else {
                this.playbackState.addCustomAction(new PlaybackStateCompat.CustomAction.Builder("org.telegram.android.musicplayer.shuffle", LocaleController.getString(R.string.ShuffleList), SharedConfig.shuffleMusic ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off).build());
                j2 = 2360118;
            }
            this.playbackState.setState(!zIsMessagePaused ? 3 : 2, j, getPlaybackSpeed(z, playingMessageObject)).setActions(j2);
            if (playingMessageObject != null && playingMessageObject.isMusic()) {
                int i2 = SharedConfig.repeatMode;
                if (i2 == 1) {
                    i = R.drawable.player_new_repeatall;
                } else if (i2 == 2) {
                    i = R.drawable.player_new_repeatone;
                } else {
                    i = R.drawable.player_new_repeat_off;
                }
                this.playbackState.addCustomAction(new PlaybackStateCompat.CustomAction.Builder("org.telegram.android.musicplayer.repeat", LocaleController.getString(R.string.RepeatSong), i).build());
            }
        }
        this.mediaSession.setPlaybackState(this.playbackState.build());
    }

    public void updateRepeatMode() {
        MediaSessionCompat mediaSessionCompat = this.mediaSession;
        if (mediaSessionCompat != null) {
            int i = SharedConfig.repeatMode;
            mediaSessionCompat.setRepeatMode(i != 1 ? i != 2 ? 0 : 1 : 2);
        }
    }

    public void updateShuffleMode() {
        MediaSessionCompat mediaSessionCompat = this.mediaSession;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.setShuffleMode(SharedConfig.shuffleMusic ? 1 : 0);
        }
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
    public void didReceivedNotification(int i, int i2, Object... objArr) throws IllegalArgumentException {
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
            long jRound = Math.round(r3.audioPlayerDuration * ((Float) objArr[1]).floatValue()) * 1000;
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
