package d3;

import a8.ma;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import h2.l0;
public final class x {
    public final l f7755a;
    public final c0 f7756b;
    public final long f7757c;
    public boolean d;
    public long f7760g;
    public boolean f7762j;
    public boolean f7765m;
    public boolean f7766n;
    public int f7758e = 0;
    public long f7759f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f7761i = -9223372036854775807L;
    public float f7763k = 1.0f;
    public h2.g0 f7764l = h2.g0.f13755a;
    public final boolean f7767o = true;

    public x(Context context, l lVar, long j3) {
        this.f7755a = lVar;
        this.f7757c = j3;
        this.f7756b = new c0(context);
    }

    public final int a(long r31, long r33, long r35, long r37, boolean r39, boolean r40, d3.w r41) {
        throw new UnsupportedOperationException("Method not decompiled: d3.x.a(long, long, long, long, boolean, boolean, d3.w):int");
    }

    public final boolean b(boolean z10) {
        if (z10 && (this.f7758e == 3 || (this.f7766n && (!this.f7765m || !this.f7767o)))) {
            this.f7761i = -9223372036854775807L;
            return true;
        } else if (this.f7761i == -9223372036854775807L) {
            return false;
        } else {
            this.f7764l.getClass();
            if (SystemClock.elapsedRealtime() < this.f7761i) {
                return true;
            }
            this.f7761i = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z10) {
        long j3;
        this.f7762j = z10;
        long j10 = this.f7757c;
        if (j10 > 0) {
            this.f7764l.getClass();
            j3 = SystemClock.elapsedRealtime() + j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.f7761i = j3;
    }

    public final void d() {
        z zVar;
        this.d = true;
        this.f7764l.getClass();
        this.f7760g = l0.S(SystemClock.elapsedRealtime());
        c0 c0Var = this.f7756b;
        c0Var.d = true;
        c0Var.b();
        DisplayManager displayManager = (DisplayManager) c0Var.f7629b.getSystemService("display");
        z zVar2 = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                if (Build.VERSION.SDK_INT >= 33) {
                    zVar = new b0(choreographer, displayManager);
                } else {
                    zVar = new z(choreographer, displayManager);
                }
                zVar2 = zVar;
            } catch (RuntimeException e10) {
                h2.a.m("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }
        c0Var.f7630c = zVar2;
        if (zVar2 != null) {
            zVar2.a();
        }
        c0Var.d(false);
    }

    public final void e(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    this.f7758e = Math.min(this.f7758e, 2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                this.f7758e = 0;
            }
        } else {
            this.f7758e = 1;
        }
        this.f7756b.b();
    }

    public final void f(float f10) {
        c0 c0Var = this.f7756b;
        c0Var.f7632f = f10;
        g gVar = c0Var.f7628a;
        gVar.f7678a.c();
        gVar.f7679b.c();
        gVar.f7680c = false;
        gVar.d = -9223372036854775807L;
        gVar.f7681e = 0;
        c0Var.c();
    }

    public final void g(Surface surface) {
        boolean z10;
        if (surface != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f7765m = z10;
        this.f7766n = false;
        c0 c0Var = this.f7756b;
        if (c0Var.f7631e != surface) {
            c0Var.a();
            c0Var.f7631e = surface;
            c0Var.d(true);
        }
        this.f7758e = Math.min(this.f7758e, 1);
    }

    public final void h(float f10) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        if (f10 == this.f7763k) {
            return;
        }
        this.f7763k = f10;
        c0 c0Var = this.f7756b;
        c0Var.f7634i = f10;
        c0Var.d(false);
    }
}
