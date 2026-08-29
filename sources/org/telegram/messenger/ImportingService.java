package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import org.telegram.messenger.NotificationCenter;
public class ImportingService extends Service implements NotificationCenter.NotificationCenterDelegate {
    private e0.t builder;

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
        new e0.n0(ApplicationLoader.applicationContext).b(5);
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
            e0.t tVar = new e0.t(ApplicationLoader.applicationContext, null);
            this.builder = tVar;
            tVar.E.icon = 17301640;
            tVar.E.when = System.currentTimeMillis();
            e0.t tVar2 = this.builder;
            tVar2.f5752y = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
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
        tVar3.f5742n = 100;
        tVar3.f5743o = 0;
        tVar3.f5744p = true;
        startForeground(5, tVar3.b());
        new e0.n0(ApplicationLoader.applicationContext).d(5, this.builder.b());
        return 2;
    }
}
