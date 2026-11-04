package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class ImportingService extends Service implements cs {
    public e0.q f21287a;

    public ImportingService() {
        for (int i3 = 0; i3 < 4; i3++) {
            hs.f(i3).b(this, hs.f23320v1);
            hs.f(i3).b(this, hs.f23327w1);
        }
    }

    public static boolean a() {
        for (int i3 = 0; i3 < 4; i3++) {
            if (yy.C(i3).G.size() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if ((i3 == hs.f23320v1 || i3 == hs.f23327w1) && !a() && !a()) {
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
        new e0.j0(t0.f25457b).b(5, null);
        for (int i3 = 0; i3 < 4; i3++) {
            hs.f(i3).n(this, hs.f23320v1);
            hs.f(i3).n(this, hs.f23327w1);
        }
        if (r2.f25040a) {
            a8.b("destroy import service");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i3, int i10) {
        if (!a()) {
            for (int i11 = 0; i11 < 4; i11++) {
                if (yy.C(i11).E.m() == 0) {
                }
            }
            stopSelf();
            return 2;
        }
        if (r2.f25040a) {
            a8.b("start import service");
        }
        if (this.f21287a == null) {
            us.i();
            e0.q qVar = new e0.q(t0.f25457b, null);
            this.f21287a = qVar;
            qVar.F.icon = 17301640;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.f21287a;
            qVar2.f9299y = us.f25747k0;
            qVar2.g(bd.M0(2131689472, null));
            int i12 = 0;
            while (true) {
                if (i12 < 4) {
                    if (yy.C(i12).E.m() != 0) {
                        this.f21287a.p(bd.M0(2131749275, null));
                        this.f21287a.f(bd.M0(2131749275, null));
                        break;
                    }
                    i12++;
                } else {
                    this.f21287a.p(bd.M0(2131749274, null));
                    this.f21287a.f(bd.M0(2131749274, null));
                    break;
                }
            }
        }
        e0.q qVar3 = this.f21287a;
        qVar3.f9289n = 100;
        qVar3.f9290o = 0;
        qVar3.f9291p = true;
        try {
            startForeground(5, qVar3.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        new e0.j0(t0.f25457b).e(null, 5, this.f21287a.b());
        return 2;
    }

    public final void onTimeout(int i3, int i10) {
        a8.b("ImportingService timeout, type = " + i10);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
