package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class VideoEncodingService extends Service implements fn7 {
    public static VideoEncodingService e;
    public wn7 a;
    public so6 b;
    public int c;
    public String d;

    public final void a(so6 so6Var) {
        boolean z;
        so6 so6Var2 = this.b;
        if (so6Var2 == so6Var) {
            return;
        }
        int i = jn7.U1;
        int i2 = jn7.V1;
        int i3 = jn7.W1;
        if (so6Var2 != null) {
            jn7.f(this.c).n(this, i3);
            jn7.f(this.c).n(this, i2);
            jn7.f(this.c).n(this, i);
        }
        if (so6Var != null) {
            r47 r47Var = so6Var.a;
            if (r47Var != null && r47.t3(r47Var.k)) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = so6Var.d;
            wn7 wn7Var = this.a;
            if (z2) {
                wn7Var.k(ob6.M0(2131751733, null));
                this.a.d(ob6.M0(2131751733, null));
            } else if (z) {
                wn7Var.k(ob6.M0(2131745307, null));
                this.a.d(ob6.M0(2131745307, null));
            } else {
                wn7Var.k(ob6.M0(2131745304, null));
                this.a.d(ob6.M0(2131745304, null));
            }
            wn7 wn7Var2 = this.a;
            wn7Var2.n = (byte) 100;
            wn7Var2.o = 0;
            wn7Var2.p = true;
        }
        this.b = so6Var;
        int i4 = so6Var.c;
        this.c = i4;
        this.d = so6Var.a.k.attachPath;
        jn7.f(i4).a(this, i3);
        jn7.f(this.c).a(this, i2);
        jn7.f(this.c).a(this, i);
        if (e != null) {
            b();
        }
    }

    public final void b() {
        try {
            if (MediaController.z().b0 == null) {
                return;
            }
            new oo7(a.b).e(null, 4, this.a.b());
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        String str2;
        boolean z = true;
        if (i == jn7.W1) {
            String str3 = (String) objArr[0];
            if (i2 == this.c && (str2 = this.d) != null && str2.equals(str3)) {
                float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                Boolean bool = (Boolean) objArr[3];
                int i3 = (int) (min * 100.0f);
                wn7 wn7Var = this.a;
                if (i3 != 0) {
                    z = false;
                }
                wn7Var.n = (byte) 100;
                wn7Var.o = i3;
                wn7Var.p = z;
                b();
            }
        } else if (i == jn7.U1 || i == jn7.V1) {
            String str4 = (String) objArr[0];
            if (i2 == this.c && (str = this.d) != null && str.equals(str4)) {
                hl.c3(new pec(this, (byte) 1));
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
        new oo7(a.b).b(4, null);
        jn7.f(this.c).n(this, jn7.W1);
        jn7.f(this.c).n(this, jn7.V1);
        jn7.f(this.c).n(this, jn7.U1);
        this.b = null;
        if (f11.a) {
            cc4.b("VideoEncodingService: destroy video service");
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i, int i2) {
        so6 so6Var;
        if (e != null || (so6Var = MediaController.z().b0) == null) {
            return 2;
        }
        e = this;
        if (this.a == null) {
            ip7.c();
            wn7 wn7Var = new wn7(a.b, ip7.k0);
            this.a = wn7Var;
            wn7Var.F.icon = 17301640;
            wn7Var.F.when = System.currentTimeMillis();
            wn7 wn7Var2 = this.a;
            wn7Var2.y = ip7.k0;
            wn7Var2.e(ob6.M0(2131689472, null));
        }
        a(so6Var);
        try {
            startForeground(4, this.a.b());
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        hl.c3(new pec(this, (byte) 0));
        return 2;
    }

    public final void onTimeout(int i, int i2) {
        cc4.b("VideoEncodingService timeout, type = " + i2);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
