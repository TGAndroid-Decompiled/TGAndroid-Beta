package d3;

import a8.la;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import h2.l0;
public final class x {
    public final l f7761a;
    public final c0 f7762b;
    public final long f7763c;
    public boolean d;
    public long f7766g;
    public boolean f7768j;
    public boolean f7771m;
    public boolean f7772n;
    public int f7764e = 0;
    public long f7765f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f7767i = -9223372036854775807L;
    public float f7769k = 1.0f;
    public h2.g0 f7770l = h2.g0.f13760a;
    public final boolean f7773o = true;

    public x(Context context, l lVar, long j3) {
        this.f7761a = lVar;
        this.f7763c = j3;
        this.f7762b = new c0(context);
    }

    public final int a(long r31, long r33, long r35, long r37, boolean r39, boolean r40, d3.w r41) {
        throw new UnsupportedOperationException("Method not decompiled: d3.x.a(long, long, long, long, boolean, boolean, d3.w):int");
    }

    public final boolean b(boolean z10) {
        if (z10 && (this.f7764e == 3 || (this.f7772n && (!this.f7771m || !this.f7773o)))) {
            this.f7767i = -9223372036854775807L;
            return true;
        } else if (this.f7767i == -9223372036854775807L) {
            return false;
        } else {
            this.f7770l.getClass();
            if (SystemClock.elapsedRealtime() < this.f7767i) {
                return true;
            }
            this.f7767i = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z10) {
        long j3;
        this.f7768j = z10;
        long j10 = this.f7763c;
        if (j10 > 0) {
            this.f7770l.getClass();
            j3 = SystemClock.elapsedRealtime() + j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.f7767i = j3;
    }

    public final void d() {
        z zVar;
        this.d = true;
        this.f7770l.getClass();
        this.f7766g = l0.S(SystemClock.elapsedRealtime());
        c0 c0Var = this.f7762b;
        c0Var.d = true;
        c0Var.b();
        DisplayManager displayManager = (DisplayManager) c0Var.f7635b.getSystemService("display");
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
        c0Var.f7636c = zVar2;
        if (zVar2 != null) {
            zVar2.a();
        }
        c0Var.d(false);
    }

    public final void e(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    this.f7764e = Math.min(this.f7764e, 2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                this.f7764e = 0;
            }
        } else {
            this.f7764e = 1;
        }
        this.f7762b.b();
    }

    public final void f(float f10) {
        c0 c0Var = this.f7762b;
        c0Var.f7638f = f10;
        g gVar = c0Var.f7634a;
        gVar.f7684a.c();
        gVar.f7685b.c();
        gVar.f7686c = false;
        gVar.d = -9223372036854775807L;
        gVar.f7687e = 0;
        c0Var.c();
    }

    public final void g(Surface surface) {
        boolean z10;
        if (surface != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f7771m = z10;
        this.f7772n = false;
        c0 c0Var = this.f7762b;
        if (c0Var.f7637e != surface) {
            c0Var.a();
            c0Var.f7637e = surface;
            c0Var.d(true);
        }
        this.f7764e = Math.min(this.f7764e, 1);
    }

    public final void h(float f10) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        if (f10 == this.f7769k) {
            return;
        }
        this.f7769k = f10;
        c0 c0Var = this.f7762b;
        c0Var.f7640i = f10;
        c0Var.d(false);
    }
}
