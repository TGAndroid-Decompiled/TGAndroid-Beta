package a3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import android.view.Surface;
public final class a0 {
    public final n f63a;
    public final e0 f64b;
    public final long f65c;
    public boolean d;
    public long f68g;
    public boolean f70j;
    public boolean f73m;
    public boolean f74n;
    public int f66e = 0;
    public long f67f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f69i = -9223372036854775807L;
    public float f71k = 1.0f;
    public e2.x f72l = e2.x.f8590a;

    public a0(Context context, n nVar, long j3) {
        this.f63a = nVar;
        this.f65c = j3;
        this.f64b = new e0(context);
    }

    public final int a(long r27, long r29, long r31, long r33, boolean r35, boolean r36, a3.z r37) {
        throw new UnsupportedOperationException("Method not decompiled: a3.a0.a(long, long, long, long, boolean, boolean, a3.z):int");
    }

    public final boolean b(boolean z10) {
        if (z10 && (this.f66e == 3 || (!this.f73m && this.f74n))) {
            this.f69i = -9223372036854775807L;
            return true;
        } else if (this.f69i == -9223372036854775807L) {
            return false;
        } else {
            this.f72l.getClass();
            if (SystemClock.elapsedRealtime() < this.f69i) {
                return true;
            }
            this.f69i = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z10) {
        long j3;
        this.f70j = z10;
        long j10 = this.f65c;
        if (j10 > 0) {
            this.f72l.getClass();
            j3 = SystemClock.elapsedRealtime() + j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.f69i = j3;
    }

    public final void d() {
        this.d = true;
        this.f72l.getClass();
        this.f68g = e2.d0.P(SystemClock.elapsedRealtime());
        e0 e0Var = this.f64b;
        e0Var.d = true;
        e0Var.f99m = 0L;
        e0Var.f102p = -1L;
        e0Var.f100n = -1L;
        c0 c0Var = e0Var.f90b;
        if (c0Var != null) {
            DisplayManager displayManager = c0Var.f79a;
            d0 d0Var = e0Var.f91c;
            d0Var.getClass();
            d0Var.f85b.sendEmptyMessage(2);
            displayManager.registerDisplayListener(c0Var, e2.d0.o(null));
            e0.a(c0Var.f80b, displayManager.getDisplay(0));
        }
        e0Var.d(false);
    }

    public final void e() {
        this.d = false;
        this.f69i = -9223372036854775807L;
        e0 e0Var = this.f64b;
        e0Var.d = false;
        c0 c0Var = e0Var.f90b;
        if (c0Var != null) {
            c0Var.f79a.unregisterDisplayListener(c0Var);
            d0 d0Var = e0Var.f91c;
            d0Var.getClass();
            d0Var.f85b.sendEmptyMessage(3);
        }
        e0Var.b();
    }

    public final void f(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f66e = Math.min(this.f66e, 2);
                    return;
                }
                throw new IllegalStateException();
            }
            this.f66e = 0;
            return;
        }
        this.f66e = 1;
    }

    public final void g(float f7) {
        e0 e0Var = this.f64b;
        e0Var.f93f = f7;
        h hVar = e0Var.f89a;
        hVar.f130a.c();
        hVar.f131b.c();
        hVar.f132c = false;
        hVar.d = -9223372036854775807L;
        hVar.f133e = 0;
        e0Var.c();
    }

    public final void h(Surface surface) {
        boolean z10;
        if (surface != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f73m = z10;
        this.f74n = false;
        e0 e0Var = this.f64b;
        if (e0Var.f92e != surface) {
            e0Var.b();
            e0Var.f92e = surface;
            e0Var.d(true);
        }
        this.f66e = Math.min(this.f66e, 1);
    }

    public final void i(float f7) {
        boolean z10;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        if (f7 == this.f71k) {
            return;
        }
        this.f71k = f7;
        e0 e0Var = this.f64b;
        e0Var.f95i = f7;
        e0Var.f99m = 0L;
        e0Var.f102p = -1L;
        e0Var.f100n = -1L;
        e0Var.d(false);
    }
}
