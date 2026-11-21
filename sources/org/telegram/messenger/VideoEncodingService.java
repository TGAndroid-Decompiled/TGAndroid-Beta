package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class VideoEncodingService extends Service implements fs {
    public static VideoEncodingService f22814e;
    public e0.q f22815a;
    public jf f22816b;
    public int f22817c;
    public String d;

    public final void a(jf jfVar) {
        boolean z10;
        jf jfVar2 = this.f22816b;
        if (jfVar2 == jfVar) {
            return;
        }
        int i7 = ks.U1;
        int i10 = ks.V1;
        int i11 = ks.W1;
        if (jfVar2 != null) {
            ks.f(this.f22817c).n(this, i11);
            ks.f(this.f22817c).n(this, i10);
            ks.f(this.f22817c).n(this, i7);
        }
        if (jfVar != null) {
            fj fjVar = jfVar.f24875a;
            if (fjVar != null && fj.t3(fjVar.f23993k)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (jfVar.d) {
                this.f22815a.p(gd.N0(2131751756, null));
                this.f22815a.f(gd.N0(2131751756, null));
            } else if (z10) {
                this.f22815a.p(gd.N0(2131745383, null));
                this.f22815a.f(gd.N0(2131745383, null));
            } else {
                this.f22815a.p(gd.N0(2131745380, null));
                this.f22815a.f(gd.N0(2131745380, null));
            }
            e0.q qVar = this.f22815a;
            qVar.f10285n = 100;
            qVar.f10286o = 0;
            qVar.f10287p = true;
        }
        this.f22816b = jfVar;
        int i12 = jfVar.f24877c;
        this.f22817c = i12;
        this.d = jfVar.f24875a.f23993k.attachPath;
        ks.f(i12).b(this, i11);
        ks.f(this.f22817c).b(this, i10);
        ks.f(this.f22817c).b(this, i7);
        if (f22814e != null) {
            b();
        }
    }

    public final void b() {
        try {
            if (MediaController.B().f22725b0 == null) {
                return;
            }
            new e0.i0(t0.f26941b).e(null, 4, this.f22815a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        String str2;
        boolean z10 = false;
        if (i7 == ks.W1) {
            String str3 = (String) objArr[0];
            if (i10 == this.f22817c && (str2 = this.d) != null && str2.equals(str3)) {
                float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                Boolean bool = (Boolean) objArr[3];
                int i11 = (int) (min * 100.0f);
                e0.q qVar = this.f22815a;
                if (i11 == 0) {
                    z10 = true;
                }
                qVar.f10285n = 100;
                qVar.f10286o = i11;
                qVar.f10287p = z10;
                b();
            }
        } else if (i7 == ks.U1 || i7 == ks.V1) {
            String str4 = (String) objArr[0];
            if (i10 == this.f22817c && (str = this.d) != null && str.equals(str4)) {
                g0.g3(new f20(this, 0));
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
        f22814e = null;
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        new e0.i0(t0.f26941b).b(4, null);
        ks.f(this.f22817c).n(this, ks.W1);
        ks.f(this.f22817c).n(this, ks.V1);
        ks.f(this.f22817c).n(this, ks.U1);
        this.f22816b = null;
        if (s2.f26749a) {
            a8.b("VideoEncodingService: destroy video service");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i7, int i10) {
        jf jfVar;
        if (f22814e != null || (jfVar = MediaController.B().f22725b0) == null) {
            return 2;
        }
        f22814e = this;
        if (this.f22815a == null) {
            xs.i();
            e0.q qVar = new e0.q(t0.f26941b, xs.f27984k0);
            this.f22815a = qVar;
            qVar.F.icon = 17301640;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.f22815a;
            qVar2.f10295y = xs.f27984k0;
            qVar2.g(gd.N0(2131689472, null));
        }
        a(jfVar);
        try {
            startForeground(4, this.f22815a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        g0.g3(new f20(this, 1));
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
