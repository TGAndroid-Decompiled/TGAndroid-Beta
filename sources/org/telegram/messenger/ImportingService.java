package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import org.telegram.messenger.NotificationCenter;
public class ImportingService extends Service implements NotificationCenter.NotificationCenterDelegate {
    private e0.q builder;

    public ImportingService() {
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.historyImportProgressChanged);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    private boolean hasImportingHistory() {
        for (int i10 = 0; i10 < 4; i10++) {
            if (SendMessagesHelper.getInstance(i10).isImportingHistory()) {
                return true;
            }
        }
        return false;
    }

    private boolean hasImportingStickers() {
        for (int i10 = 0; i10 < 4; i10++) {
            if (SendMessagesHelper.getInstance(i10).isImportingStickers()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        if ((i10 == NotificationCenter.historyImportProgressChanged || i10 == NotificationCenter.stickersImportProgressChanged) && !hasImportingStickers() && !hasImportingStickers()) {
            stopSelf();
        }
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
        new e0.j0(ApplicationLoader.applicationContext).b(5, null);
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.historyImportProgressChanged);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("destroy import service");
        }
    }

    @Override
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (!hasImportingStickers() && !hasImportingHistory()) {
            stopSelf();
            return 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start import service");
        }
        if (this.builder == null) {
            NotificationsController.checkOtherNotificationsChannel();
            e0.q qVar = new e0.q(ApplicationLoader.applicationContext, null);
            this.builder = qVar;
            qVar.F.icon = 17301640;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.builder;
            qVar2.f9595y = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
            qVar2.g(LocaleController.getString(R.string.AppName));
            if (hasImportingHistory()) {
                this.builder.p(LocaleController.getString(R.string.ImporImportingService));
                this.builder.f(LocaleController.getString(R.string.ImporImportingService));
            } else {
                this.builder.p(LocaleController.getString(R.string.ImporImportingStickersService));
                this.builder.f(LocaleController.getString(R.string.ImporImportingStickersService));
            }
        }
        e0.q qVar3 = this.builder;
        qVar3.f9585n = 100;
        qVar3.f9586o = 0;
        qVar3.f9587p = true;
        try {
            startForeground(5, qVar3.b());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        new e0.j0(ApplicationLoader.applicationContext).e(null, 5, this.builder.b());
        return 2;
    }

    public void onTimeout(int i10, int i11) {
        FileLog.d("ImportingService timeout, type = " + i11);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
