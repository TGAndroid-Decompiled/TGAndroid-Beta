package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class ImportingService extends Service implements us {
    public e0.r f14425a;

    public ImportingService() {
        for (int i10 = 0; i10 < 4; i10++) {
            zs.f(i10).b(this, zs.f19705v1);
            zs.f(i10).b(this, zs.f19712w1);
        }
    }

    public static boolean a() {
        for (int i10 = 0; i10 < 4; i10++) {
            if (qz.C(i10).F.size() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if ((i10 == zs.f19705v1 || i10 == zs.f19712w1) && !a() && !a()) {
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
        new e0.k0(w0.f19025b).b(5, null);
        for (int i10 = 0; i10 < 4; i10++) {
            zs.f(i10).n(this, zs.f19705v1);
            zs.f(i10).n(this, zs.f19712w1);
        }
        if (v2.f18448a) {
            f8.b("destroy import service");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i10, int i11) {
        if (!a()) {
            for (int i12 = 0; i12 < 4; i12++) {
                if (qz.C(i12).D.m() == 0) {
                }
            }
            stopSelf();
            return 2;
        }
        if (v2.f18448a) {
            f8.b("start import service");
        }
        if (this.f14425a == null) {
            ot.i();
            e0.r rVar = new e0.r(w0.f19025b, null);
            this.f14425a = rVar;
            rVar.F.icon = 17301640;
            rVar.F.when = System.currentTimeMillis();
            e0.r rVar2 = this.f14425a;
            rVar2.f6077y = ot.f17303j0;
            rVar2.g(cd.L0(2131689472, null));
            int i13 = 0;
            while (true) {
                if (i13 < 4) {
                    if (qz.C(i13).D.m() != 0) {
                        this.f14425a.p(cd.L0(2131749276, null));
                        this.f14425a.f(cd.L0(2131749276, null));
                        break;
                    }
                    i13++;
                } else {
                    this.f14425a.p(cd.L0(2131749275, null));
                    this.f14425a.f(cd.L0(2131749275, null));
                    break;
                }
            }
        }
        e0.r rVar3 = this.f14425a;
        rVar3.f6067n = 100;
        rVar3.f6068o = 0;
        rVar3.f6069p = true;
        try {
            startForeground(5, rVar3.b());
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
        new e0.k0(w0.f19025b).e(null, 5, this.f14425a.b());
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
