package a3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import v7.u6;
public final class a0 {
    public final n f56a;
    public final f0 f57b;
    public final long f58c;
    public boolean d;
    public long f60g;
    public boolean f62j;
    public boolean f65m;
    public boolean f66n;
    public int e = 0;
    public long f59f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f61i = -9223372036854775807L;
    public float f63k = 1.0f;
    public e2.g0 f64l = e2.g0.f8229a;
    public final boolean f67o = true;

    public a0(Context context, n nVar, long j10) {
        this.f56a = nVar;
        this.f58c = j10;
        this.f57b = new f0(context);
    }

    public final int a(long r31, long r33, long r35, long r37, boolean r39, boolean r40, a3.z r41) {
        throw new UnsupportedOperationException("Method not decompiled: a3.a0.a(long, long, long, long, boolean, boolean, a3.z):int");
    }

    public final boolean b(boolean z10) {
        if (z10 && (this.e == 3 || (this.f66n && (!this.f65m || !this.f67o)))) {
            this.f61i = -9223372036854775807L;
            return true;
        } else if (this.f61i == -9223372036854775807L) {
            return false;
        } else {
            this.f64l.getClass();
            if (SystemClock.elapsedRealtime() < this.f61i) {
                return true;
            }
            this.f61i = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z10) {
        long j10;
        this.f62j = z10;
        long j11 = this.f58c;
        if (j11 > 0) {
            this.f64l.getClass();
            j10 = SystemClock.elapsedRealtime() + j11;
        } else {
            j10 = -9223372036854775807L;
        }
        this.f61i = j10;
    }

    public final void d() {
        c0 c0Var;
        this.d = true;
        this.f64l.getClass();
        this.f60g = e2.m0.S(SystemClock.elapsedRealtime());
        f0 f0Var = this.f57b;
        f0Var.d = true;
        f0Var.b();
        DisplayManager displayManager = (DisplayManager) f0Var.f87b.getSystemService("display");
        c0 c0Var2 = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                if (Build.VERSION.SDK_INT >= 33) {
                    c0Var = new e0(choreographer, displayManager);
                } else {
                    c0Var = new c0(choreographer, displayManager);
                }
                c0Var2 = c0Var;
            } catch (RuntimeException e) {
                e2.a.m("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }
        f0Var.f88c = c0Var2;
        if (c0Var2 != null) {
            c0Var2.a();
        }
        f0Var.d(false);
    }

    public final void e(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.e = Math.min(this.e, 2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                this.e = 0;
            }
        } else {
            this.e = 1;
        }
        this.f57b.b();
    }

    public final void f(float f7) {
        f0 f0Var = this.f57b;
        f0Var.f89f = f7;
        h hVar = f0Var.f86a;
        hVar.f116a.c();
        hVar.f117b.c();
        hVar.f118c = false;
        hVar.d = -9223372036854775807L;
        hVar.e = 0;
        f0Var.c();
    }

    public final void g(Surface surface) {
        boolean z10;
        if (surface != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f65m = z10;
        this.f66n = false;
        f0 f0Var = this.f57b;
        if (f0Var.e != surface) {
            f0Var.a();
            f0Var.e = surface;
            f0Var.d(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void h(float f7) {
        boolean z10;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        if (f7 == this.f63k) {
            return;
        }
        this.f63k = f7;
        f0 f0Var = this.f57b;
        f0Var.f91i = f7;
        f0Var.d(false);
    }
}
