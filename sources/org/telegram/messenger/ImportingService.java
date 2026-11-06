package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class ImportingService extends Service implements ls {
    public e0.q f21234a;

    public ImportingService() {
        for (int i7 = 0; i7 < 4; i7++) {
            qs.f(i7).b(this, qs.f25082v1);
            qs.f(i7).b(this, qs.f25089w1);
        }
    }

    public static boolean a() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (gz.C(i7).F.size() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if ((i7 == qs.f25082v1 || i7 == qs.f25089w1) && !a() && !a()) {
            stopSelf();
        }
    }

    @Override
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        new e0.i0(t0.f25563b).b(5, null);
        for (int i7 = 0; i7 < 4; i7++) {
            qs.f(i7).n(this, qs.f25082v1);
            qs.f(i7).n(this, qs.f25089w1);
        }
        if (r2.f25199a) {
            a8.b("destroy import service");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i7, int i10) {
        if (!a()) {
            for (int i11 = 0; i11 < 4; i11++) {
                if (gz.C(i11).D.m() == 0) {
                }
            }
            stopSelf();
            return 2;
        }
        if (r2.f25199a) {
            a8.b("start import service");
        }
        if (this.f21234a == null) {
            dt.i();
            e0.q qVar = new e0.q(t0.f25563b, null);
            this.f21234a = qVar;
            qVar.F.icon = 17301640;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.f21234a;
            qVar2.f10115y = dt.f22057j0;
            qVar2.g(hd.M0(2131689472, null));
            int i12 = 0;
            while (true) {
                if (i12 < 4) {
                    if (gz.C(i12).D.m() != 0) {
                        this.f21234a.p(hd.M0(2131749266, null));
                        this.f21234a.f(hd.M0(2131749266, null));
                        break;
                    }
                    i12++;
                } else {
                    this.f21234a.p(hd.M0(2131749265, null));
                    this.f21234a.f(hd.M0(2131749265, null));
                    break;
                }
            }
        }
        e0.q qVar3 = this.f21234a;
        qVar3.f10105n = 100;
        qVar3.f10106o = 0;
        qVar3.f10107p = true;
        try {
            startForeground(5, qVar3.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        new e0.i0(t0.f25563b).e(null, 5, this.f21234a.b());
        return 2;
    }

    public final void onTimeout(int i7, int i10) {
        a8.b("ImportingService timeout, type = " + i10);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
