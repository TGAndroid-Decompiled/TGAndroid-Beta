package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class ImportingService extends Service implements is {
    public e0.q f22316a;

    public ImportingService() {
        for (int i7 = 0; i7 < 4; i7++) {
            ns.f(i7).b(this, ns.f25587v1);
            ns.f(i7).b(this, ns.f25594w1);
        }
    }

    public static boolean a() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (ez.C(i7).G.size() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if ((i7 == ns.f25587v1 || i7 == ns.f25594w1) && !a() && !a()) {
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
        new e0.i0(t0.f26600b).b(5, null);
        for (int i7 = 0; i7 < 4; i7++) {
            ns.f(i7).n(this, ns.f25587v1);
            ns.f(i7).n(this, ns.f25594w1);
        }
        if (r2.f26198a) {
            a8.b("destroy import service");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i7, int i10) {
        if (!a()) {
            for (int i11 = 0; i11 < 4; i11++) {
                if (ez.C(i11).E.m() == 0) {
                }
            }
            stopSelf();
            return 2;
        }
        if (r2.f26198a) {
            a8.b("start import service");
        }
        if (this.f22316a == null) {
            at.i();
            e0.q qVar = new e0.q(t0.f26600b, null);
            this.f22316a = qVar;
            qVar.F.icon = 17301640;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.f22316a;
            qVar2.f9951y = at.f22557k0;
            qVar2.g(hd.M0(2131689472, null));
            int i12 = 0;
            while (true) {
                if (i12 < 4) {
                    if (ez.C(i12).E.m() != 0) {
                        this.f22316a.p(hd.M0(2131749267, null));
                        this.f22316a.f(hd.M0(2131749267, null));
                        break;
                    }
                    i12++;
                } else {
                    this.f22316a.p(hd.M0(2131749266, null));
                    this.f22316a.f(hd.M0(2131749266, null));
                    break;
                }
            }
        }
        e0.q qVar3 = this.f22316a;
        qVar3.f9941n = 100;
        qVar3.f9942o = 0;
        qVar3.f9943p = true;
        try {
            startForeground(5, qVar3.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        new e0.i0(t0.f26600b).e(null, 5, this.f22316a.b());
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
