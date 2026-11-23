package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class VideoEncodingService extends Service implements gs {
    public static VideoEncodingService f22781e;
    public e0.q f22782a;
    public kf f22783b;
    public int f22784c;
    public String d;

    public final void a(kf kfVar) {
        boolean z10;
        kf kfVar2 = this.f22783b;
        if (kfVar2 == kfVar) {
            return;
        }
        int i7 = ls.U1;
        int i10 = ls.V1;
        int i11 = ls.W1;
        if (kfVar2 != null) {
            ls.f(this.f22784c).n(this, i11);
            ls.f(this.f22784c).n(this, i10);
            ls.f(this.f22784c).n(this, i7);
        }
        if (kfVar != null) {
            gj gjVar = kfVar.f25026a;
            if (gjVar != null && gj.t3(gjVar.f24177k)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (kfVar.d) {
                this.f22782a.p(hd.N0(2131751756, null));
                this.f22782a.f(hd.N0(2131751756, null));
            } else if (z10) {
                this.f22782a.p(hd.N0(2131745383, null));
                this.f22782a.f(hd.N0(2131745383, null));
            } else {
                this.f22782a.p(hd.N0(2131745380, null));
                this.f22782a.f(hd.N0(2131745380, null));
            }
            e0.q qVar = this.f22782a;
            qVar.f10251n = 100;
            qVar.f10252o = 0;
            qVar.f10253p = true;
        }
        this.f22783b = kfVar;
        int i12 = kfVar.f25028c;
        this.f22784c = i12;
        this.d = kfVar.f25026a.f24177k.attachPath;
        ls.f(i12).b(this, i11);
        ls.f(this.f22784c).b(this, i10);
        ls.f(this.f22784c).b(this, i7);
        if (f22781e != null) {
            b();
        }
    }

    public final void b() {
        try {
            if (MediaController.B().f22692b0 == null) {
                return;
            }
            new e0.i0(t0.f26895b).e(null, 4, this.f22782a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        String str2;
        boolean z10 = false;
        if (i7 == ls.W1) {
            String str3 = (String) objArr[0];
            if (i10 == this.f22784c && (str2 = this.d) != null && str2.equals(str3)) {
                float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                Boolean bool = (Boolean) objArr[3];
                int i11 = (int) (min * 100.0f);
                e0.q qVar = this.f22782a;
                if (i11 == 0) {
                    z10 = true;
                }
                qVar.f10251n = 100;
                qVar.f10252o = i11;
                qVar.f10253p = z10;
                b();
            }
        } else if (i7 == ls.U1 || i7 == ls.V1) {
            String str4 = (String) objArr[0];
            if (i10 == this.f22784c && (str = this.d) != null && str.equals(str4)) {
                g0.g3(new g20(this, 0));
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
        f22781e = null;
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        new e0.i0(t0.f26895b).b(4, null);
        ls.f(this.f22784c).n(this, ls.W1);
        ls.f(this.f22784c).n(this, ls.V1);
        ls.f(this.f22784c).n(this, ls.U1);
        this.f22783b = null;
        if (s2.f26694a) {
            a8.b("VideoEncodingService: destroy video service");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i7, int i10) {
        kf kfVar;
        if (f22781e != null || (kfVar = MediaController.B().f22692b0) == null) {
            return 2;
        }
        f22781e = this;
        if (this.f22782a == null) {
            ys.i();
            e0.q qVar = new e0.q(t0.f26895b, ys.f28132k0);
            this.f22782a = qVar;
            qVar.F.icon = 17301640;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.f22782a;
            qVar2.f10261y = ys.f28132k0;
            qVar2.g(hd.N0(2131689472, null));
        }
        a(kfVar);
        try {
            startForeground(4, this.f22782a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        g0.g3(new g20(this, 1));
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
