package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class VideoEncodingService extends Service implements us {
    public static VideoEncodingService e;
    public e0.r f14527a;
    public jf f14528b;
    public int f14529c;
    public String d;

    public final void a(jf jfVar) {
        boolean z10;
        jf jfVar2 = this.f14528b;
        if (jfVar2 == jfVar) {
            return;
        }
        int i10 = zs.U1;
        int i11 = zs.V1;
        int i12 = zs.W1;
        if (jfVar2 != null) {
            zs.f(this.f14529c).n(this, i12);
            zs.f(this.f14529c).n(this, i11);
            zs.f(this.f14529c).n(this, i10);
        }
        if (jfVar != null) {
            jj jjVar = jfVar.f16270a;
            if (jjVar != null && jj.t3(jjVar.f16337k)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (jfVar.d) {
                this.f14527a.p(cd.L0(2131751768, null));
                this.f14527a.f(cd.L0(2131751768, null));
            } else if (z10) {
                this.f14527a.p(cd.L0(2131745596, null));
                this.f14527a.f(cd.L0(2131745596, null));
            } else {
                this.f14527a.p(cd.L0(2131745593, null));
                this.f14527a.f(cd.L0(2131745593, null));
            }
            e0.r rVar = this.f14527a;
            rVar.f6067n = 100;
            rVar.f6068o = 0;
            rVar.f6069p = true;
        }
        this.f14528b = jfVar;
        int i13 = jfVar.f16272c;
        this.f14529c = i13;
        this.d = jfVar.f16270a.f16337k.attachPath;
        zs.f(i13).b(this, i12);
        zs.f(this.f14529c).b(this, i11);
        zs.f(this.f14529c).b(this, i10);
        if (e != null) {
            b();
        }
    }

    public final void b() {
        try {
            if (MediaController.B().f14438a0 == null) {
                return;
            }
            new e0.k0(w0.f19025b).e(null, 4, this.f14527a.b());
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        String str2;
        boolean z10 = false;
        if (i10 == zs.W1) {
            String str3 = (String) objArr[0];
            if (i11 == this.f14529c && (str2 = this.d) != null && str2.equals(str3)) {
                float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                Boolean bool = (Boolean) objArr[3];
                int i12 = (int) (min * 100.0f);
                e0.r rVar = this.f14527a;
                if (i12 == 0) {
                    z10 = true;
                }
                rVar.f6067n = 100;
                rVar.f6068o = i12;
                rVar.f6069p = z10;
                b();
            }
        } else if (i10 == zs.U1 || i10 == zs.V1) {
            String str4 = (String) objArr[0];
            if (i11 == this.f14529c && (str = this.d) != null && str.equals(str4)) {
                i0.g3(new y20(this, 0));
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
        new e0.k0(w0.f19025b).b(4, null);
        zs.f(this.f14529c).n(this, zs.W1);
        zs.f(this.f14529c).n(this, zs.V1);
        zs.f(this.f14529c).n(this, zs.U1);
        this.f14528b = null;
        if (v2.f18448a) {
            f8.b("VideoEncodingService: destroy video service");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i10, int i11) {
        jf jfVar;
        if (e != null || (jfVar = MediaController.B().f14438a0) == null) {
            return 2;
        }
        e = this;
        if (this.f14527a == null) {
            ot.i();
            e0.r rVar = new e0.r(w0.f19025b, ot.f17303j0);
            this.f14527a = rVar;
            rVar.F.icon = 17301640;
            rVar.F.when = System.currentTimeMillis();
            e0.r rVar2 = this.f14527a;
            rVar2.f6077y = ot.f17303j0;
            rVar2.g(cd.L0(2131689472, null));
        }
        a(jfVar);
        try {
            startForeground(4, this.f14527a.b());
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
        i0.g3(new y20(this, 1));
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
