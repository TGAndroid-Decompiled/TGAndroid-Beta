package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.NotificationCompat$Builder;
import androidx.core.app.NotificationManagerCompat;

public class ImportingService extends Service implements NotificationCenter.NotificationCenterDelegate {
    private NotificationCompat$Builder builder;

    public ImportingService() {
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.historyImportProgressChanged);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    private boolean hasImportingHistory() {
        for (int i = 0; i < 4; i++) {
            if (SendMessagesHelper.getInstance(i).isImportingHistory()) {
                return true;
            }
        }
        return false;
    }

    private boolean hasImportingStickers() {
        for (int i = 0; i < 4; i++) {
            if (SendMessagesHelper.getInstance(i).isImportingStickers()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if ((i != NotificationCenter.historyImportProgressChanged && i != NotificationCenter.stickersImportProgressChanged) || hasImportingStickers() || hasImportingStickers()) {
            return;
        }
        stopSelf();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        new NotificationManagerCompat(ApplicationLoader.applicationContext).cancel(5);
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.historyImportProgressChanged);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("destroy import service");
        }
    }

    @Override
    public int onStartCommand(Intent intent, int i, int i2) {
        if (!hasImportingStickers() && !hasImportingHistory()) {
            stopSelf();
            return 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start import service");
        }
        if (this.builder == null) {
            NotificationsController.checkOtherNotificationsChannel();
            NotificationCompat$Builder notificationCompat$Builder = new NotificationCompat$Builder(ApplicationLoader.applicationContext, null);
            this.builder = notificationCompat$Builder;
            notificationCompat$Builder.mNotification.icon = 17301640;
            notificationCompat$Builder.mNotification.when = System.currentTimeMillis();
            NotificationCompat$Builder notificationCompat$Builder2 = this.builder;
            notificationCompat$Builder2.mChannelId = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
            notificationCompat$Builder2.setContentTitle(LocaleController.getString(R.string.AppName));
            if (hasImportingHistory()) {
                NotificationCompat$Builder notificationCompat$Builder3 = this.builder;
                int i3 = R.string.ImporImportingService;
                notificationCompat$Builder3.setTicker(LocaleController.getString(i3));
                this.builder.setContentText(LocaleController.getString(i3));
            } else {
                NotificationCompat$Builder notificationCompat$Builder4 = this.builder;
                int i4 = R.string.ImporImportingStickersService;
                notificationCompat$Builder4.setTicker(LocaleController.getString(i4));
                this.builder.setContentText(LocaleController.getString(i4));
            }
        }
        NotificationCompat$Builder notificationCompat$Builder5 = this.builder;
        notificationCompat$Builder5.mProgressMax = 100;
        notificationCompat$Builder5.mProgress = 0;
        notificationCompat$Builder5.mProgressIndeterminate = true;
        startForeground(5, notificationCompat$Builder5.build());
        new NotificationManagerCompat(ApplicationLoader.applicationContext).notify(5, this.builder.build());
        return 2;
    }
}
