package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class ImportingService extends Service implements fn7 {
    public wn7 a;

    public ImportingService() {
        for (int i = 0; i < 4; i++) {
            jn7.f(i).a(this, jn7.v1);
            jn7.f(i).a(this, jn7.w1);
        }
    }

    public static boolean a() {
        for (int i = 0; i < 4; i++) {
            if (r7a.B(i).G.size() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if ((i == jn7.v1 || i == jn7.w1) && !a() && !a()) {
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
        new oo7(a.b).b(5, null);
        for (int i = 0; i < 4; i++) {
            jn7.f(i).n(this, jn7.v1);
            jn7.f(i).n(this, jn7.w1);
        }
        if (f11.a) {
            cc4.b("destroy import service");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i, int i2) {
        boolean z;
        if (!a()) {
            for (int i3 = 0; i3 < 4; i3++) {
                if (r7a.B(i3).E.m() == 0) {
                }
            }
            stopSelf();
            return 2;
        }
        if (f11.a) {
            cc4.b("start import service");
        }
        if (this.a == null) {
            ip7.c();
            wn7 wn7Var = new wn7(a.b, null);
            this.a = wn7Var;
            wn7Var.F.icon = 17301640;
            wn7Var.F.when = System.currentTimeMillis();
            wn7 wn7Var2 = this.a;
            wn7Var2.y = ip7.k0;
            wn7Var2.e(ob6.M0(2131689472, null));
            int i4 = 0;
            while (true) {
                if (i4 < 4) {
                    if (r7a.B(i4).E.m() != 0) {
                        z = true;
                        break;
                    }
                    i4++;
                } else {
                    z = false;
                    break;
                }
            }
            wn7 wn7Var3 = this.a;
            if (z) {
                wn7Var3.k(ob6.M0(2131749021, null));
                this.a.d(ob6.M0(2131749021, null));
            } else {
                wn7Var3.k(ob6.M0(2131749020, null));
                this.a.d(ob6.M0(2131749020, null));
            }
        }
        wn7 wn7Var4 = this.a;
        wn7Var4.n = (byte) 100;
        wn7Var4.o = 0;
        wn7Var4.p = true;
        try {
            startForeground(5, wn7Var4.b());
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        new oo7(a.b).e(null, 5, this.a.b());
        return 2;
    }

    public final void onTimeout(int i, int i2) {
        cc4.b("ImportingService timeout, type = " + i2);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
