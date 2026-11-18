package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class ImportingService extends Service implements fs {
    public e0.q f22682a;

    public ImportingService() {
        for (int i7 = 0; i7 < 4; i7++) {
            ks.f(i7).b(this, ks.f25207v1);
            ks.f(i7).b(this, ks.f25214w1);
        }
    }

    public static boolean a() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (zy.C(i7).G.size() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if ((i7 == ks.f25207v1 || i7 == ks.f25214w1) && !a() && !a()) {
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
        new e0.i0(t0.f26915b).b(5, null);
        for (int i7 = 0; i7 < 4; i7++) {
            ks.f(i7).n(this, ks.f25207v1);
            ks.f(i7).n(this, ks.f25214w1);
        }
        if (s2.f26723a) {
            a8.b("destroy import service");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i7, int i10) {
        if (!a()) {
            for (int i11 = 0; i11 < 4; i11++) {
                if (zy.C(i11).E.m() == 0) {
                }
            }
            stopSelf();
            return 2;
        }
        if (s2.f26723a) {
            a8.b("start import service");
        }
        if (this.f22682a == null) {
            xs.i();
            e0.q qVar = new e0.q(t0.f26915b, null);
            this.f22682a = qVar;
            qVar.F.icon = 17301640;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.f22682a;
            qVar2.f10269y = xs.f27958k0;
            qVar2.g(gd.M0(2131689472, null));
            int i12 = 0;
            while (true) {
                if (i12 < 4) {
                    if (zy.C(i12).E.m() != 0) {
                        this.f22682a.p(gd.M0(2131749075, null));
                        this.f22682a.f(gd.M0(2131749075, null));
                        break;
                    }
                    i12++;
                } else {
                    this.f22682a.p(gd.M0(2131749074, null));
                    this.f22682a.f(gd.M0(2131749074, null));
                    break;
                }
            }
        }
        e0.q qVar3 = this.f22682a;
        qVar3.f10259n = 100;
        qVar3.f10260o = 0;
        qVar3.f10261p = true;
        try {
            startForeground(5, qVar3.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        new e0.i0(t0.f26915b).e(null, 5, this.f22682a.b());
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
