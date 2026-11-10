package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class VideoEncodingService extends Service implements ls {
    public static VideoEncodingService f21348e;
    public e0.q f21349a;
    public lf f21350b;
    public int f21351c;
    public String d;

    public final void a(lf lfVar) {
        boolean z9;
        lf lfVar2 = this.f21350b;
        if (lfVar2 == lfVar) {
            return;
        }
        int i7 = qs.U1;
        int i10 = qs.V1;
        int i11 = qs.W1;
        if (lfVar2 != null) {
            qs.f(this.f21351c).n(this, i11);
            qs.f(this.f21351c).n(this, i10);
            qs.f(this.f21351c).n(this, i7);
        }
        if (lfVar != null) {
            ij ijVar = lfVar.f23891a;
            if (ijVar != null && ij.t3(ijVar.f23266k)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (lfVar.d) {
                this.f21349a.p(id.M0(2131751768, null));
                this.f21349a.f(id.M0(2131751768, null));
            } else if (z9) {
                this.f21349a.p(id.M0(2131745579, null));
                this.f21349a.f(id.M0(2131745579, null));
            } else {
                this.f21349a.p(id.M0(2131745576, null));
                this.f21349a.f(id.M0(2131745576, null));
            }
            e0.q qVar = this.f21349a;
            qVar.f10110n = 100;
            qVar.f10111o = 0;
            qVar.f10112p = true;
        }
        this.f21350b = lfVar;
        int i12 = lfVar.f23893c;
        this.f21351c = i12;
        this.d = lfVar.f23891a.f23266k.attachPath;
        qs.f(i12).b(this, i11);
        qs.f(this.f21351c).b(this, i10);
        qs.f(this.f21351c).b(this, i7);
        if (f21348e != null) {
            b();
        }
    }

    public final void b() {
        try {
            if (MediaController.B().f21256a0 == null) {
                return;
            }
            new e0.i0(t0.f25570b).e(null, 4, this.f21349a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        String str2;
        boolean z9 = false;
        if (i7 == qs.W1) {
            String str3 = (String) objArr[0];
            if (i10 == this.f21351c && (str2 = this.d) != null && str2.equals(str3)) {
                float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                Boolean bool = (Boolean) objArr[3];
                int i11 = (int) (min * 100.0f);
                e0.q qVar = this.f21349a;
                if (i11 == 0) {
                    z9 = true;
                }
                qVar.f10110n = 100;
                qVar.f10111o = i11;
                qVar.f10112p = z9;
                b();
            }
        } else if (i7 == qs.U1 || i7 == qs.V1) {
            String str4 = (String) objArr[0];
            if (i10 == this.f21351c && (str = this.d) != null && str.equals(str4)) {
                g0.h3(new k20(this, 0));
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
        f21348e = null;
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        new e0.i0(t0.f25570b).b(4, null);
        qs.f(this.f21351c).n(this, qs.W1);
        qs.f(this.f21351c).n(this, qs.V1);
        qs.f(this.f21351c).n(this, qs.U1);
        this.f21350b = null;
        if (r2.f25216a) {
            a8.b("VideoEncodingService: destroy video service");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i7, int i10) {
        lf lfVar;
        if (f21348e != null || (lfVar = MediaController.B().f21256a0) == null) {
            return 2;
        }
        f21348e = this;
        if (this.f21349a == null) {
            dt.i();
            e0.q qVar = new e0.q(t0.f25570b, dt.f22079j0);
            this.f21349a = qVar;
            qVar.F.icon = 17301640;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.f21349a;
            qVar2.f10120y = dt.f22079j0;
            qVar2.g(id.M0(2131689472, null));
        }
        a(lfVar);
        try {
            startForeground(4, this.f21349a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        g0.h3(new k20(this, 1));
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
