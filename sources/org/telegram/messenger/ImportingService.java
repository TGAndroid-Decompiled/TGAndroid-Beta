package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class ImportingService extends Service implements jm7 {
    public an7 a;

    public ImportingService() {
        for (int i = 0; i < 4; i++) {
            nm7.f(i).a(this, nm7.v1);
            nm7.f(i).a(this, nm7.w1);
        }
    }

    public static boolean a() {
        for (int i = 0; i < 4; i++) {
            if (a6a.B(i).G.size() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if ((i == nm7.v1 || i == nm7.w1) && !a() && !a()) {
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
        new sn7(a.b).b(5, null);
        for (int i = 0; i < 4; i++) {
            nm7.f(i).n(this, nm7.v1);
            nm7.f(i).n(this, nm7.w1);
        }
        if (e21.a) {
            fc4.b("destroy import service");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i, int i2) {
        boolean z;
        if (!a()) {
            for (int i3 = 0; i3 < 4; i3++) {
                if (a6a.B(i3).E.m() == 0) {
                }
            }
            stopSelf();
            return 2;
        }
        if (e21.a) {
            fc4.b("start import service");
        }
        if (this.a == null) {
            lo7.c();
            an7 an7Var = new an7(a.b, null);
            this.a = an7Var;
            an7Var.F.icon = 17301640;
            an7Var.F.when = System.currentTimeMillis();
            an7 an7Var2 = this.a;
            an7Var2.y = lo7.k0;
            an7Var2.e(jb6.M0(2131689472, null));
            int i4 = 0;
            while (true) {
                if (i4 < 4) {
                    if (a6a.B(i4).E.m() != 0) {
                        z = true;
                        break;
                    }
                    i4++;
                } else {
                    z = false;
                    break;
                }
            }
            an7 an7Var3 = this.a;
            if (z) {
                an7Var3.k(jb6.M0(2131749024, null));
                this.a.d(jb6.M0(2131749024, null));
            } else {
                an7Var3.k(jb6.M0(2131749023, null));
                this.a.d(jb6.M0(2131749023, null));
            }
        }
        an7 an7Var4 = this.a;
        an7Var4.n = (byte) 100;
        an7Var4.o = 0;
        an7Var4.p = true;
        try {
            startForeground(5, an7Var4.b());
        } catch (Throwable th) {
            fc4.g(th, true);
        }
        new sn7(a.b).e(null, 5, this.a.b());
        return 2;
    }

    public final void onTimeout(int i, int i2) {
        fc4.b("ImportingService timeout, type = " + i2);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
