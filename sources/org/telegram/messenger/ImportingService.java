package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class ImportingService extends Service implements gs {
    public e0.q f22674a;

    public ImportingService() {
        for (int i7 = 0; i7 < 4; i7++) {
            ls.f(i7).b(this, ls.f25363v1);
            ls.f(i7).b(this, ls.f25370w1);
        }
    }

    public static boolean a() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (az.C(i7).G.size() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if ((i7 == ls.f25363v1 || i7 == ls.f25370w1) && !a() && !a()) {
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
        new e0.i0(t0.f26895b).b(5, null);
        for (int i7 = 0; i7 < 4; i7++) {
            ls.f(i7).n(this, ls.f25363v1);
            ls.f(i7).n(this, ls.f25370w1);
        }
        if (s2.f26694a) {
            a8.b("destroy import service");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i7, int i10) {
        if (!a()) {
            for (int i11 = 0; i11 < 4; i11++) {
                if (az.C(i11).E.m() == 0) {
                }
            }
            stopSelf();
            return 2;
        }
        if (s2.f26694a) {
            a8.b("start import service");
        }
        if (this.f22674a == null) {
            ys.i();
            e0.q qVar = new e0.q(t0.f26895b, null);
            this.f22674a = qVar;
            qVar.F.icon = 17301640;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.f22674a;
            qVar2.f10261y = ys.f28132k0;
            qVar2.g(hd.N0(2131689472, null));
            int i12 = 0;
            while (true) {
                if (i12 < 4) {
                    if (az.C(i12).E.m() != 0) {
                        this.f22674a.p(hd.N0(2131749074, null));
                        this.f22674a.f(hd.N0(2131749074, null));
                        break;
                    }
                    i12++;
                } else {
                    this.f22674a.p(hd.N0(2131749073, null));
                    this.f22674a.f(hd.N0(2131749073, null));
                    break;
                }
            }
        }
        e0.q qVar3 = this.f22674a;
        qVar3.f10251n = 100;
        qVar3.f10252o = 0;
        qVar3.f10253p = true;
        try {
            startForeground(5, qVar3.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        new e0.i0(t0.f26895b).e(null, 5, this.f22674a.b());
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
