package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
public final class uec {
    public final bn6 a;
    public final zec b;
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
    public vgb k = vgb.a;

    public uec(Context context, bn6 bn6Var, long j) {
        this.a = bn6Var;
        this.c = (int) j;
        this.b = new zec(context);
    }

    public final int a(long r29, long r31, long r33, long r35, boolean r37, boolean r38, long r39, long r41, defpackage.ry0 r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uec.a(long, long, long, long, boolean, boolean, long, long, ry0):int");
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
        wec wecVar;
        this.d = true;
        this.k.getClass();
        this.g = gcc.T(SystemClock.elapsedRealtime());
        zec zecVar = this.b;
        zecVar.d = true;
        zecVar.b();
        if (!zecVar.b) {
            DisplayManager displayManager = (DisplayManager) zecVar.a.getSystemService("display");
            wec wecVar2 = null;
            if (displayManager != null) {
                try {
                    Choreographer choreographer = Choreographer.getInstance();
                    if (Build.VERSION.SDK_INT >= 33) {
                        wecVar = new yec(choreographer, displayManager);
                    } else {
                        wecVar = new wec(choreographer, displayManager);
                    }
                    wecVar2 = wecVar;
                } catch (RuntimeException e) {
                    efd.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
                }
            }
            zecVar.c = wecVar2;
            zecVar.b = true;
        }
        wec wecVar3 = zecVar.c;
        if (wecVar3 != null) {
            wecVar3.a();
        }
        zecVar.c(false);
    }

    public final void e(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.e = Math.min(this.e, 2);
                } else {
                    grb.g();
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
        zec zecVar = this.b;
        if (zecVar.e != surface) {
            zecVar.a();
            zecVar.e = surface;
            zecVar.c(true);
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
        yve.f(z);
        if (f == this.j) {
            return;
        }
        this.j = f;
        zec zecVar = this.b;
        zecVar.h = f;
        zecVar.c(false);
    }
}
