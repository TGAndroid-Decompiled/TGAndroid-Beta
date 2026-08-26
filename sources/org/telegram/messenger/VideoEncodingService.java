package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.NotificationCompat$Builder;
import androidx.core.app.NotificationManagerCompat;

public class VideoEncodingService extends Service implements NotificationCenter.NotificationCenterDelegate {
    private static VideoEncodingService instance;
    private NotificationCompat$Builder builder;
    int currentAccount;
    private MediaController.VideoConvertMessage currentMessage;
    String currentPath;

    public static boolean isRunning() {
        return instance != null;
    }

    public void lambda$didReceivedNotification$0() {
        MediaController.VideoConvertMessage currentForegroundConverMessage = MediaController.getInstance().getCurrentForegroundConverMessage();
        if (currentForegroundConverMessage != null) {
            setCurrentMessage(currentForegroundConverMessage);
        } else {
            stopSelf();
        }
    }

    private void setCurrentMessage(MediaController.VideoConvertMessage videoConvertMessage) {
        MediaController.VideoConvertMessage videoConvertMessage2 = this.currentMessage;
        if (videoConvertMessage2 == videoConvertMessage) {
            return;
        }
        if (videoConvertMessage2 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploaded);
        }
        updateBuilderForMessage(videoConvertMessage);
        this.currentMessage = videoConvertMessage;
        int i = videoConvertMessage.currentAccount;
        this.currentAccount = i;
        this.currentPath = videoConvertMessage.messageObject.messageOwner.attachPath;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
        if (isRunning()) {
            updateNotification();
        }
    }

    public static void start(boolean z) {
        if (instance == null) {
            try {
                ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) VideoEncodingService.class));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (z) {
            MediaController.VideoConvertMessage currentForegroundConverMessage = MediaController.getInstance().getCurrentForegroundConverMessage();
            VideoEncodingService videoEncodingService = instance;
            if (videoEncodingService.currentMessage != currentForegroundConverMessage) {
                if (currentForegroundConverMessage != null) {
                    videoEncodingService.setCurrentMessage(currentForegroundConverMessage);
                } else {
                    videoEncodingService.stopSelf();
                }
            }
        }
    }

    public static void stop() {
        VideoEncodingService videoEncodingService = instance;
        if (videoEncodingService != null) {
            videoEncodingService.stopSelf();
        }
    }

    private void updateBuilderForMessage(MediaController.VideoConvertMessage videoConvertMessage) {
        if (videoConvertMessage == null) {
            return;
        }
        MessageObject messageObject = videoConvertMessage.messageObject;
        boolean z = messageObject != null && MessageObject.isGifMessage(messageObject.messageOwner);
        if (videoConvertMessage.foregroundConversion) {
            NotificationCompat$Builder notificationCompat$Builder = this.builder;
            int i = R.string.ConvertingVideo;
            notificationCompat$Builder.setTicker(LocaleController.getString(i));
            this.builder.setContentText(LocaleController.getString(i));
        } else if (z) {
            NotificationCompat$Builder notificationCompat$Builder2 = this.builder;
            int i2 = R.string.SendingGif;
            notificationCompat$Builder2.setTicker(LocaleController.getString(i2));
            this.builder.setContentText(LocaleController.getString(i2));
        } else {
            NotificationCompat$Builder notificationCompat$Builder3 = this.builder;
            int i3 = R.string.SendingVideo;
            notificationCompat$Builder3.setTicker(LocaleController.getString(i3));
            this.builder.setContentText(LocaleController.getString(i3));
        }
        NotificationCompat$Builder notificationCompat$Builder4 = this.builder;
        notificationCompat$Builder4.mProgressMax = 100;
        notificationCompat$Builder4.mProgress = 0;
        notificationCompat$Builder4.mProgressIndeterminate = true;
    }

    public void updateNotification() {
        try {
            if (MediaController.getInstance().getCurrentForegroundConverMessage() == null) {
                return;
            }
            new NotificationManagerCompat(ApplicationLoader.applicationContext).notify(4, this.builder.build());
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        String str2;
        if (i != NotificationCenter.fileUploadProgressChanged) {
            if (i == NotificationCenter.fileUploaded || i == NotificationCenter.fileUploadFailed) {
                String str3 = (String) objArr[0];
                if (i2 == this.currentAccount && (str = this.currentPath) != null && str.equals(str3)) {
                    AndroidUtilities.runOnUIThread(new VideoEncodingService$$ExternalSyntheticLambda0(this, 0));
                    return;
                }
                return;
            }
            return;
        }
        String str4 = (String) objArr[0];
        if (i2 == this.currentAccount && (str2 = this.currentPath) != null && str2.equals(str4)) {
            float fMin = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            int i3 = (int) (fMin * 100.0f);
            NotificationCompat$Builder notificationCompat$Builder = this.builder;
            boolean z = i3 == 0;
            notificationCompat$Builder.mProgressMax = 100;
            notificationCompat$Builder.mProgress = i3;
            notificationCompat$Builder.mProgressIndeterminate = z;
            updateNotification();
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        instance = null;
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        new NotificationManagerCompat(ApplicationLoader.applicationContext).cancel(4);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploaded);
        this.currentMessage = null;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("VideoEncodingService: destroy video service");
        }
    }

    @Override
    public int onStartCommand(Intent intent, int i, int i2) {
        MediaController.VideoConvertMessage currentForegroundConverMessage;
        if (isRunning() || (currentForegroundConverMessage = MediaController.getInstance().getCurrentForegroundConverMessage()) == null) {
            return 2;
        }
        instance = this;
        if (this.builder == null) {
            NotificationsController.checkOtherNotificationsChannel();
            NotificationCompat$Builder notificationCompat$Builder = new NotificationCompat$Builder(ApplicationLoader.applicationContext, NotificationsController.OTHER_NOTIFICATIONS_CHANNEL);
            this.builder = notificationCompat$Builder;
            notificationCompat$Builder.mNotification.icon = 17301640;
            notificationCompat$Builder.mNotification.when = System.currentTimeMillis();
            NotificationCompat$Builder notificationCompat$Builder2 = this.builder;
            notificationCompat$Builder2.mChannelId = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
            notificationCompat$Builder2.setContentTitle(LocaleController.getString(R.string.AppName));
        }
        setCurrentMessage(currentForegroundConverMessage);
        try {
            startForeground(4, this.builder.build());
        } catch (Throwable th) {
            FileLog.e(th);
        }
        AndroidUtilities.runOnUIThread(new VideoEncodingService$$ExternalSyntheticLambda0(this, 1));
        return 2;
    }
}
