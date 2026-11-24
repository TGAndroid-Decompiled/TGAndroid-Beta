package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
public final class xcc {
    public final ym6 a;
    public final cdc b;
    public final short c;
    public boolean d;
    public long g;
    public boolean i;
    public boolean l;
    public boolean m;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public float j = 1.0f;
    public bfb k = bfb.a;

    public xcc(Context context, ym6 ym6Var, long j) {
        this.a = ym6Var;
        this.c = (int) j;
        this.b = new cdc(context);
    }

    public final int a(long r29, long r31, long r33, long r35, boolean r37, boolean r38, long r39, long r41, defpackage.qz0 r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xcc.a(long, long, long, long, boolean, boolean, long, long, qz0):int");
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (this.m && !this.l))) {
            this.h = -9223372036854775807L;
            return true;
        } else if (this.h == -9223372036854775807L) {
            return false;
        } else {
            this.k.getClass();
            if (SystemClock.elapsedRealtime() < this.h) {
                return true;
            }
            this.h = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z) {
        long j;
        this.i = z;
        long j2 = this.c;
        if (j2 > 0) {
            this.k.getClass();
            j = SystemClock.elapsedRealtime() + j2;
        } else {
            j = -9223372036854775807L;
        }
        this.h = j;
    }

    public final void d() {
        zcc zccVar;
        this.d = true;
        this.k.getClass();
        this.g = hac.T(SystemClock.elapsedRealtime());
        cdc cdcVar = this.b;
        cdcVar.d = true;
        cdcVar.b();
        if (!cdcVar.b) {
            DisplayManager displayManager = (DisplayManager) cdcVar.a.getSystemService("display");
            zcc zccVar2 = null;
            if (displayManager != null) {
                try {
                    Choreographer choreographer = Choreographer.getInstance();
                    if (Build.VERSION.SDK_INT >= 33) {
                        zccVar = new bdc(choreographer, displayManager);
                    } else {
                        zccVar = new zcc(choreographer, displayManager);
                    }
                    zccVar2 = zccVar;
                } catch (RuntimeException e) {
                    ncd.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
                }
            }
            cdcVar.c = zccVar2;
            cdcVar.b = true;
        }
        zcc zccVar3 = cdcVar.c;
        if (zccVar3 != null) {
            zccVar3.a();
        }
        cdcVar.c(false);
    }

    public final void e(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.e = Math.min(this.e, 2);
                } else {
                    rjb.h();
                    return;
                }
            } else {
                this.e = 0;
            }
        } else {
            this.e = 1;
        }
        this.b.b();
    }

    public final void f(Surface surface) {
        boolean z;
        if (surface != null) {
            z = true;
        } else {
            z = false;
        }
        this.l = z;
        this.m = false;
        cdc cdcVar = this.b;
        if (cdcVar.e != surface) {
            cdcVar.a();
            cdcVar.e = surface;
            cdcVar.c(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void g(float f) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        if (f == this.j) {
            return;
        }
        this.j = f;
        cdc cdcVar = this.b;
        cdcVar.h = f;
        cdcVar.c(false);
    }
}
