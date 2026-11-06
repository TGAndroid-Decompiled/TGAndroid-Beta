package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class VideoEncodingService extends Service implements ls {
    public static VideoEncodingService f21340e;
    public e0.q f21341a;
    public lf f21342b;
    public int f21343c;
    public String d;

    public final void a(lf lfVar) {
        boolean z9;
        lf lfVar2 = this.f21342b;
        if (lfVar2 == lfVar) {
            return;
        }
        int i7 = qs.U1;
        int i10 = qs.V1;
        int i11 = qs.W1;
        if (lfVar2 != null) {
            qs.f(this.f21343c).n(this, i11);
            qs.f(this.f21343c).n(this, i10);
            qs.f(this.f21343c).n(this, i7);
        }
        if (lfVar != null) {
            ij ijVar = lfVar.f23875a;
            if (ijVar != null && ij.u3(ijVar.f23237k)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (lfVar.d) {
                this.f21341a.p(hd.M0(2131751768, null));
                this.f21341a.f(hd.M0(2131751768, null));
            } else if (z9) {
                this.f21341a.p(hd.M0(2131745580, null));
                this.f21341a.f(hd.M0(2131745580, null));
            } else {
                this.f21341a.p(hd.M0(2131745577, null));
                this.f21341a.f(hd.M0(2131745577, null));
            }
            e0.q qVar = this.f21341a;
            qVar.f10105n = 100;
            qVar.f10106o = 0;
            qVar.f10107p = true;
        }
        this.f21342b = lfVar;
        int i12 = lfVar.f23877c;
        this.f21343c = i12;
        this.d = lfVar.f23875a.f23237k.attachPath;
        qs.f(i12).b(this, i11);
        qs.f(this.f21343c).b(this, i10);
        qs.f(this.f21343c).b(this, i7);
        if (f21340e != null) {
            b();
        }
    }

    public final void b() {
        try {
            if (MediaController.B().f21248a0 == null) {
                return;
            }
            new e0.i0(t0.f25555b).e(null, 4, this.f21341a.b());
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
            if (i10 == this.f21343c && (str2 = this.d) != null && str2.equals(str3)) {
                float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                Boolean bool = (Boolean) objArr[3];
                int i11 = (int) (min * 100.0f);
                e0.q qVar = this.f21341a;
                if (i11 == 0) {
                    z9 = true;
                }
                qVar.f10105n = 100;
                qVar.f10106o = i11;
                qVar.f10107p = z9;
                b();
            }
        } else if (i7 == qs.U1 || i7 == qs.V1) {
            String str4 = (String) objArr[0];
            if (i10 == this.f21343c && (str = this.d) != null && str.equals(str4)) {
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
        f21340e = null;
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        new e0.i0(t0.f25555b).b(4, null);
        qs.f(this.f21343c).n(this, qs.W1);
        qs.f(this.f21343c).n(this, qs.V1);
        qs.f(this.f21343c).n(this, qs.U1);
        this.f21342b = null;
        if (r2.f25191a) {
            a8.b("VideoEncodingService: destroy video service");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i7, int i10) {
        lf lfVar;
        if (f21340e != null || (lfVar = MediaController.B().f21248a0) == null) {
            return 2;
        }
        f21340e = this;
        if (this.f21341a == null) {
            dt.i();
            e0.q qVar = new e0.q(t0.f25555b, dt.f22050j0);
            this.f21341a = qVar;
            qVar.F.icon = 17301640;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.f21341a;
            qVar2.f10115y = dt.f22050j0;
            qVar2.g(hd.M0(2131689472, null));
        }
        a(lfVar);
        try {
            startForeground(4, this.f21341a.b());
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
