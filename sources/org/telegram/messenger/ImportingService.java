package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import org.telegram.messenger.NotificationCenter;
public class ImportingService extends Service implements NotificationCenter.NotificationCenterDelegate {
    private e0.t builder;

    public ImportingService() {
        for (int i9 = 0; i9 < 4; i9++) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.historyImportProgressChanged);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    private boolean hasImportingHistory() {
        for (int i9 = 0; i9 < 4; i9++) {
            if (SendMessagesHelper.getInstance(i9).isImportingHistory()) {
                return true;
            }
        }
        return false;
    }

    private boolean hasImportingStickers() {
        for (int i9 = 0; i9 < 4; i9++) {
            if (SendMessagesHelper.getInstance(i9).isImportingStickers()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void didReceivedNotification(int i9, int i10, Object... objArr) {
        if ((i9 == NotificationCenter.historyImportProgressChanged || i9 == NotificationCenter.stickersImportProgressChanged) && !hasImportingStickers() && !hasImportingStickers()) {
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
        new e0.n0(ApplicationLoader.applicationContext).b(5);
        for (int i9 = 0; i9 < 4; i9++) {
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.historyImportProgressChanged);
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("destroy import service");
        }
    }

    @Override
    public int onStartCommand(Intent intent, int i9, int i10) {
        if (!hasImportingStickers() && !hasImportingHistory()) {
            stopSelf();
            return 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start import service");
        }
        if (this.builder == null) {
            NotificationsController.checkOtherNotificationsChannel();
            e0.t tVar = new e0.t(ApplicationLoader.applicationContext, null);
            this.builder = tVar;
            tVar.E.icon = 17301640;
            tVar.E.when = System.currentTimeMillis();
            e0.t tVar2 = this.builder;
            tVar2.f4782y = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
            tVar2.g(LocaleController.getString(R.string.AppName));
            if (hasImportingHistory()) {
                this.builder.p(LocaleController.getString(R.string.ImporImportingService));
                this.builder.f(LocaleController.getString(R.string.ImporImportingService));
            } else {
                this.builder.p(LocaleController.getString(R.string.ImporImportingStickersService));
                this.builder.f(LocaleController.getString(R.string.ImporImportingStickersService));
            }
        }
        e0.t tVar3 = this.builder;
        tVar3.f4772n = 100;
        tVar3.f4773o = 0;
        tVar3.f4774p = true;
        startForeground(5, tVar3.b());
        new e0.n0(ApplicationLoader.applicationContext).d(5, this.builder.b());
        return 2;
    }
}
