package org.telegram.messenger;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import org.telegram.tgnet.TL_smsjobs$TL_smsjobs_status;
import org.telegram.ui.LaunchActivity;

public class SMSJobsNotification extends Service {
    private static SMSJobsNotification[] instance = new SMSJobsNotification[4];
    private static Intent[] service = new Intent[4];
    private NotificationCompat.Builder builder;
    public int currentAccount;
    public boolean shown;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public static boolean check() {
        boolean z = false;
        for (int i = 0; i < 4; i++) {
            z = check(i) || z;
        }
        return z;
    }

    public static boolean check(int i) {
        boolean z = ApplicationLoader.mainInterfacePaused;
        if (z) {
            z = MessagesController.getInstance(i).smsjobsStickyNotificationEnabled;
        }
        if (z) {
            z = SMSJobController.getInstance(i).getState() == 3 && SMSJobController.getInstance(i).currentStatus != null;
        }
        SMSJobsNotification[] sMSJobsNotificationArr = instance;
        boolean z2 = sMSJobsNotificationArr[i] != null && sMSJobsNotificationArr[i].shown;
        if (z2 != z) {
            if (z) {
                service[i] = new Intent(ApplicationLoader.applicationContext, (Class<?>) SMSJobsNotification.class);
                service[i].putExtra("account", i);
                if (Build.VERSION.SDK_INT >= 26) {
                    ApplicationLoader.applicationContext.startForegroundService(service[i]);
                } else {
                    ApplicationLoader.applicationContext.startService(service[i]);
                }
            } else if (service[i] != null) {
                ApplicationLoader.applicationContext.stopService(service[i]);
                service[i] = null;
            }
        } else if (z2) {
            sMSJobsNotificationArr[i].update();
        }
        return z;
    }

    @Override
    public void onDestroy() {
        this.shown = false;
        super.onDestroy();
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        try {
            NotificationManagerCompat.from(ApplicationLoader.applicationContext).cancel(38);
        } catch (Throwable unused2) {
        }
    }

    @Override
    public int onStartCommand(Intent intent, int i, int i2) {
        int intExtra = intent.getIntExtra("account", UserConfig.selectedAccount);
        this.currentAccount = intExtra;
        SMSJobsNotification[] sMSJobsNotificationArr = instance;
        if (sMSJobsNotificationArr[intExtra] != this && sMSJobsNotificationArr[intExtra] != null) {
            sMSJobsNotificationArr[intExtra].stopSelf();
        }
        instance[this.currentAccount] = this;
        this.shown = true;
        if (this.builder == null) {
            NotificationsController.checkOtherNotificationsChannel();
            NotificationCompat.Builder builder = new NotificationCompat.Builder(ApplicationLoader.applicationContext, NotificationsController.OTHER_NOTIFICATIONS_CHANNEL);
            this.builder = builder;
            builder.setSmallIcon(2131231238);
            this.builder.setWhen(System.currentTimeMillis());
            this.builder.setChannelId(NotificationsController.OTHER_NOTIFICATIONS_CHANNEL);
            Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
            intent2.setData(Uri.parse("tg://settings/premium_sms"));
            this.builder.setContentIntent(PendingIntent.getActivity(getApplicationContext(), 0, intent2, 67108864));
        }
        this.builder.setContentTitle(LocaleController.getString(2131696929));
        TL_smsjobs$TL_smsjobs_status tL_smsjobs$TL_smsjobs_status = SMSJobController.getInstance(this.currentAccount).currentStatus;
        int i3 = tL_smsjobs$TL_smsjobs_status != null ? tL_smsjobs$TL_smsjobs_status.recent_sent : 0;
        int i4 = tL_smsjobs$TL_smsjobs_status != null ? tL_smsjobs$TL_smsjobs_status.recent_sent + tL_smsjobs$TL_smsjobs_status.recent_remains : 100;
        this.builder.setContentText(LocaleController.formatString(2131696928, Integer.valueOf(i3), Integer.valueOf(i4)));
        this.builder.setProgress(i4, i3, false);
        try {
            startForeground(38, this.builder.build());
        } catch (Throwable th) {
            FileLog.e(th);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SMSJobsNotification.this.updateNotify();
            }
        });
        return 2;
    }

    public void update() {
        NotificationCompat.Builder builder = this.builder;
        if (builder != null) {
            builder.setContentTitle(LocaleController.getString(2131696929));
            TL_smsjobs$TL_smsjobs_status tL_smsjobs$TL_smsjobs_status = SMSJobController.getInstance(this.currentAccount).currentStatus;
            int i = tL_smsjobs$TL_smsjobs_status != null ? tL_smsjobs$TL_smsjobs_status.recent_sent : 0;
            int i2 = tL_smsjobs$TL_smsjobs_status != null ? tL_smsjobs$TL_smsjobs_status.recent_sent + tL_smsjobs$TL_smsjobs_status.recent_remains : 100;
            this.builder.setContentText(LocaleController.formatString(2131696928, Integer.valueOf(i), Integer.valueOf(i2)));
            this.builder.setProgress(i2, i, false);
        }
        updateNotify();
    }

    public void updateNotify() {
        if (this.builder == null) {
            return;
        }
        try {
            NotificationManagerCompat.from(ApplicationLoader.applicationContext).notify(38, this.builder.build());
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }
}
