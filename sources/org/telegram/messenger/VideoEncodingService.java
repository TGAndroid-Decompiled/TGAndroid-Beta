package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class VideoEncodingService extends Service implements is {
    public static VideoEncodingService f22423e;
    public e0.q f22424a;
    public kf f22425b;
    public int f22426c;
    public String d;

    public final void a(kf kfVar) {
        boolean z10;
        kf kfVar2 = this.f22425b;
        if (kfVar2 == kfVar) {
            return;
        }
        int i7 = ns.U1;
        int i10 = ns.V1;
        int i11 = ns.W1;
        if (kfVar2 != null) {
            ns.f(this.f22426c).n(this, i11);
            ns.f(this.f22426c).n(this, i10);
            ns.f(this.f22426c).n(this, i7);
        }
        if (kfVar != null) {
            gj gjVar = kfVar.f24687a;
            if (gjVar != null && gj.t3(gjVar.f23819k)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (kfVar.d) {
                this.f22424a.p(hd.M0(2131751768, null));
                this.f22424a.f(hd.M0(2131751768, null));
            } else if (z10) {
                this.f22424a.p(hd.M0(2131745579, null));
                this.f22424a.f(hd.M0(2131745579, null));
            } else {
                this.f22424a.p(hd.M0(2131745576, null));
                this.f22424a.f(hd.M0(2131745576, null));
            }
            e0.q qVar = this.f22424a;
            qVar.f9941n = 100;
            qVar.f9942o = 0;
            qVar.f9943p = true;
        }
        this.f22425b = kfVar;
        int i12 = kfVar.f24689c;
        this.f22426c = i12;
        this.d = kfVar.f24687a.f23819k.attachPath;
        ns.f(i12).b(this, i11);
        ns.f(this.f22426c).b(this, i10);
        ns.f(this.f22426c).b(this, i7);
        if (f22423e != null) {
            b();
        }
    }

    public final void b() {
        try {
            if (MediaController.B().f22334b0 == null) {
                return;
            }
            new e0.i0(t0.f26609b).e(null, 4, this.f22424a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        String str2;
        boolean z10 = false;
        if (i7 == ns.W1) {
            String str3 = (String) objArr[0];
            if (i10 == this.f22426c && (str2 = this.d) != null && str2.equals(str3)) {
                float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                Boolean bool = (Boolean) objArr[3];
                int i11 = (int) (min * 100.0f);
                e0.q qVar = this.f22424a;
                if (i11 == 0) {
                    z10 = true;
                }
                qVar.f9941n = 100;
                qVar.f9942o = i11;
                qVar.f9943p = z10;
                b();
            }
        } else if (i7 == ns.U1 || i7 == ns.V1) {
            String str4 = (String) objArr[0];
            if (i10 == this.f22426c && (str = this.d) != null && str.equals(str4)) {
                g0.h3(new h20(this, 0));
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
        f22423e = null;
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        new e0.i0(t0.f26609b).b(4, null);
        ns.f(this.f22426c).n(this, ns.W1);
        ns.f(this.f22426c).n(this, ns.V1);
        ns.f(this.f22426c).n(this, ns.U1);
        this.f22425b = null;
        if (r2.f26206a) {
            a8.b("VideoEncodingService: destroy video service");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i7, int i10) {
        kf kfVar;
        if (f22423e != null || (kfVar = MediaController.B().f22334b0) == null) {
            return 2;
        }
        f22423e = this;
        if (this.f22424a == null) {
            at.i();
            e0.q qVar = new e0.q(t0.f26609b, at.f22557k0);
            this.f22424a = qVar;
            qVar.F.icon = 17301640;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.f22424a;
            qVar2.f9951y = at.f22557k0;
            qVar2.g(hd.M0(2131689472, null));
        }
        a(kfVar);
        try {
            startForeground(4, this.f22424a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        g0.h3(new h20(this, 1));
        return 2;
    }

    public final void onTimeout(int i7, int i10) {
        a8.b("VideoEncodingService timeout, type = " + i10);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
