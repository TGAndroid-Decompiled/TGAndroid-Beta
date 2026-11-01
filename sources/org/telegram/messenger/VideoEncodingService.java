package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class VideoEncodingService extends Service implements vs {
    public static VideoEncodingService e;
    public e0.r f14528a;
    public kf f14529b;
    public int f14530c;
    public String d;

    public final void a(kf kfVar) {
        boolean z10;
        kf kfVar2 = this.f14529b;
        if (kfVar2 == kfVar) {
            return;
        }
        int i10 = at.U1;
        int i11 = at.V1;
        int i12 = at.W1;
        if (kfVar2 != null) {
            at.f(this.f14530c).n(this, i12);
            at.f(this.f14530c).n(this, i11);
            at.f(this.f14530c).n(this, i10);
        }
        if (kfVar != null) {
            kj kjVar = kfVar.f16623a;
            if (kjVar != null && kj.t3(kjVar.f16690k)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (kfVar.d) {
                this.f14528a.p(dd.L0(2131751768, null));
                this.f14528a.f(dd.L0(2131751768, null));
            } else if (z10) {
                this.f14528a.p(dd.L0(2131745596, null));
                this.f14528a.f(dd.L0(2131745596, null));
            } else {
                this.f14528a.p(dd.L0(2131745593, null));
                this.f14528a.f(dd.L0(2131745593, null));
            }
            e0.r rVar = this.f14528a;
            rVar.f6067n = 100;
            rVar.f6068o = 0;
            rVar.f6069p = true;
        }
        this.f14529b = kfVar;
        int i13 = kfVar.f16625c;
        this.f14530c = i13;
        this.d = kfVar.f16623a.f16690k.attachPath;
        at.f(i13).b(this, i12);
        at.f(this.f14530c).b(this, i11);
        at.f(this.f14530c).b(this, i10);
        if (e != null) {
            b();
        }
    }

    public final void b() {
        try {
            if (MediaController.B().f14439a0 == null) {
                return;
            }
            new e0.k0(w0.f18945b).e(null, 4, this.f14528a.b());
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        String str2;
        boolean z10 = false;
        if (i10 == at.W1) {
            String str3 = (String) objArr[0];
            if (i11 == this.f14530c && (str2 = this.d) != null && str2.equals(str3)) {
                float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                Boolean bool = (Boolean) objArr[3];
                int i12 = (int) (min * 100.0f);
                e0.r rVar = this.f14528a;
                if (i12 == 0) {
                    z10 = true;
                }
                rVar.f6067n = 100;
                rVar.f6068o = i12;
                rVar.f6069p = z10;
                b();
            }
        } else if (i10 == at.U1 || i10 == at.V1) {
            String str4 = (String) objArr[0];
            if (i11 == this.f14530c && (str = this.d) != null && str.equals(str4)) {
                i0.g3(new z20(this, 0));
            }
        }
    }

    @Override
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        e = null;
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        new e0.k0(w0.f18945b).b(4, null);
        at.f(this.f14530c).n(this, at.W1);
        at.f(this.f14530c).n(this, at.V1);
        at.f(this.f14530c).n(this, at.U1);
        this.f14529b = null;
        if (v2.f18578a) {
            f8.b("VideoEncodingService: destroy video service");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i10, int i11) {
        kf kfVar;
        if (e != null || (kfVar = MediaController.B().f14439a0) == null) {
            return 2;
        }
        e = this;
        if (this.f14528a == null) {
            pt.i();
            e0.r rVar = new e0.r(w0.f18945b, pt.f17636j0);
            this.f14528a = rVar;
            rVar.F.icon = 17301640;
            rVar.F.when = System.currentTimeMillis();
            e0.r rVar2 = this.f14528a;
            rVar2.f6077y = pt.f17636j0;
            rVar2.g(dd.L0(2131689472, null));
        }
        a(kfVar);
        try {
            startForeground(4, this.f14528a.b());
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
        i0.g3(new z20(this, 1));
        return 2;
    }

    public final void onTimeout(int i10, int i11) {
        f8.b("VideoEncodingService timeout, type = " + i11);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
