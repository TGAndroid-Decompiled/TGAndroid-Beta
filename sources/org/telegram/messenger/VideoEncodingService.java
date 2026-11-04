package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class VideoEncodingService extends Service implements cs {
    public static VideoEncodingService f21394e;
    public e0.q f21395a;
    public cf f21396b;
    public int f21397c;
    public String d;

    public final void a(cf cfVar) {
        boolean z10;
        cf cfVar2 = this.f21396b;
        if (cfVar2 == cfVar) {
            return;
        }
        int i3 = hs.U1;
        int i10 = hs.V1;
        int i11 = hs.W1;
        if (cfVar2 != null) {
            hs.f(this.f21397c).n(this, i11);
            hs.f(this.f21397c).n(this, i10);
            hs.f(this.f21397c).n(this, i3);
        }
        if (cfVar != null) {
            zi ziVar = cfVar.f22014a;
            if (ziVar != null && zi.u3(ziVar.f26868k)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (cfVar.d) {
                this.f21395a.p(bd.M0(2131751768, null));
                this.f21395a.f(bd.M0(2131751768, null));
            } else if (z10) {
                this.f21395a.p(bd.M0(2131745589, null));
                this.f21395a.f(bd.M0(2131745589, null));
            } else {
                this.f21395a.p(bd.M0(2131745586, null));
                this.f21395a.f(bd.M0(2131745586, null));
            }
            e0.q qVar = this.f21395a;
            qVar.f9289n = 100;
            qVar.f9290o = 0;
            qVar.f9291p = true;
        }
        this.f21396b = cfVar;
        int i12 = cfVar.f22016c;
        this.f21397c = i12;
        this.d = cfVar.f22014a.f26868k.attachPath;
        hs.f(i12).b(this, i11);
        hs.f(this.f21397c).b(this, i10);
        hs.f(this.f21397c).b(this, i3);
        if (f21394e != null) {
            b();
        }
    }

    public final void b() {
        try {
            if (MediaController.B().f21305b0 == null) {
                return;
            }
            new e0.j0(t0.f25457b).e(null, 4, this.f21395a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        String str;
        String str2;
        boolean z10 = false;
        if (i3 == hs.W1) {
            String str3 = (String) objArr[0];
            if (i10 == this.f21397c && (str2 = this.d) != null && str2.equals(str3)) {
                float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                Boolean bool = (Boolean) objArr[3];
                int i11 = (int) (min * 100.0f);
                e0.q qVar = this.f21395a;
                if (i11 == 0) {
                    z10 = true;
                }
                qVar.f9289n = 100;
                qVar.f9290o = i11;
                qVar.f9291p = z10;
                b();
            }
        } else if (i3 == hs.U1 || i3 == hs.V1) {
            String str4 = (String) objArr[0];
            if (i10 == this.f21397c && (str = this.d) != null && str.equals(str4)) {
                g0.h3(new c20(this, 0));
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
        f21394e = null;
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        new e0.j0(t0.f25457b).b(4, null);
        hs.f(this.f21397c).n(this, hs.W1);
        hs.f(this.f21397c).n(this, hs.V1);
        hs.f(this.f21397c).n(this, hs.U1);
        this.f21396b = null;
        if (r2.f25040a) {
            a8.b("VideoEncodingService: destroy video service");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i3, int i10) {
        cf cfVar;
        if (f21394e != null || (cfVar = MediaController.B().f21305b0) == null) {
            return 2;
        }
        f21394e = this;
        if (this.f21395a == null) {
            us.i();
            e0.q qVar = new e0.q(t0.f25457b, us.f25747k0);
            this.f21395a = qVar;
            qVar.F.icon = 17301640;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.f21395a;
            qVar2.f9299y = us.f25747k0;
            qVar2.g(bd.M0(2131689472, null));
        }
        a(cfVar);
        try {
            startForeground(4, this.f21395a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        g0.h3(new c20(this, 1));
        return 2;
    }

    public final void onTimeout(int i3, int i10) {
        a8.b("VideoEncodingService timeout, type = " + i10);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
