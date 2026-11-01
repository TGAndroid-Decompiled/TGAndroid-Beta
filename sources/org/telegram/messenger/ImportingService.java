package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class ImportingService extends Service implements vs {
    public e0.r f14426a;

    public ImportingService() {
        for (int i10 = 0; i10 < 4; i10++) {
            at.f(i10).b(this, at.f14801v1);
            at.f(i10).b(this, at.f14808w1);
        }
    }

    public static boolean a() {
        for (int i10 = 0; i10 < 4; i10++) {
            if (rz.C(i10).F.size() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if ((i10 == at.f14801v1 || i10 == at.f14808w1) && !a() && !a()) {
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
        new e0.k0(w0.f18945b).b(5, null);
        for (int i10 = 0; i10 < 4; i10++) {
            at.f(i10).n(this, at.f14801v1);
            at.f(i10).n(this, at.f14808w1);
        }
        if (v2.f18578a) {
            f8.b("destroy import service");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i10, int i11) {
        if (!a()) {
            for (int i12 = 0; i12 < 4; i12++) {
                if (rz.C(i12).D.m() == 0) {
                }
            }
            stopSelf();
            return 2;
        }
        if (v2.f18578a) {
            f8.b("start import service");
        }
        if (this.f14426a == null) {
            pt.i();
            e0.r rVar = new e0.r(w0.f18945b, null);
            this.f14426a = rVar;
            rVar.F.icon = 17301640;
            rVar.F.when = System.currentTimeMillis();
            e0.r rVar2 = this.f14426a;
            rVar2.f6077y = pt.f17636j0;
            rVar2.g(dd.L0(2131689472, null));
            int i13 = 0;
            while (true) {
                if (i13 < 4) {
                    if (rz.C(i13).D.m() != 0) {
                        this.f14426a.p(dd.L0(2131749276, null));
                        this.f14426a.f(dd.L0(2131749276, null));
                        break;
                    }
                    i13++;
                } else {
                    this.f14426a.p(dd.L0(2131749275, null));
                    this.f14426a.f(dd.L0(2131749275, null));
                    break;
                }
            }
        }
        e0.r rVar3 = this.f14426a;
        rVar3.f6067n = 100;
        rVar3.f6068o = 0;
        rVar3.f6069p = true;
        try {
            startForeground(5, rVar3.b());
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
        new e0.k0(w0.f18945b).e(null, 5, this.f14426a.b());
        return 2;
    }

    public final void onTimeout(int i10, int i11) {
        f8.b("ImportingService timeout, type = " + i11);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
