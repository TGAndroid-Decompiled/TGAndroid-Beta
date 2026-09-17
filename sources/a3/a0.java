package a3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import android.view.Surface;
public final class a0 {
    public final n f61a;
    public final e0 f62b;
    public final long f63c;
    public boolean d;
    public long f66g;
    public boolean f68j;
    public boolean f71m;
    public boolean f72n;
    public int f64e = 0;
    public long f65f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f67i = -9223372036854775807L;
    public float f69k = 1.0f;
    public e2.x f70l = e2.x.f8823a;

    public a0(Context context, n nVar, long j3) {
        this.f61a = nVar;
        this.f63c = j3;
        this.f62b = new e0(context);
    }

    public final int a(long r28, long r30, long r32, long r34, boolean r36, boolean r37, a3.z r38) {
        throw new UnsupportedOperationException("Method not decompiled: a3.a0.a(long, long, long, long, boolean, boolean, a3.z):int");
    }

    public final boolean b(boolean z10) {
        if (z10 && (this.f64e == 3 || (!this.f71m && this.f72n))) {
            this.f67i = -9223372036854775807L;
            return true;
        } else if (this.f67i == -9223372036854775807L) {
            return false;
        } else {
            this.f70l.getClass();
            if (SystemClock.elapsedRealtime() < this.f67i) {
                return true;
            }
            this.f67i = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z10) {
        long j3;
        this.f68j = z10;
        long j10 = this.f63c;
        if (j10 > 0) {
            this.f70l.getClass();
            j3 = SystemClock.elapsedRealtime() + j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.f67i = j3;
    }

    public final void d() {
        this.d = true;
        this.f70l.getClass();
        this.f66g = e2.d0.Q(SystemClock.elapsedRealtime());
        e0 e0Var = this.f62b;
        e0Var.d = true;
        e0Var.f97m = 0L;
        e0Var.f100p = -1L;
        e0Var.f98n = -1L;
        c0 c0Var = e0Var.f88b;
        if (c0Var != null) {
            DisplayManager displayManager = c0Var.f77a;
            d0 d0Var = e0Var.f89c;
            d0Var.getClass();
            d0Var.f83b.sendEmptyMessage(2);
            displayManager.registerDisplayListener(c0Var, e2.d0.o(null));
            e0.a(c0Var.f78b, displayManager.getDisplay(0));
        }
        e0Var.d(false);
    }

    public final void e() {
        this.d = false;
        this.f67i = -9223372036854775807L;
        e0 e0Var = this.f62b;
        e0Var.d = false;
        c0 c0Var = e0Var.f88b;
        if (c0Var != null) {
            c0Var.f77a.unregisterDisplayListener(c0Var);
            d0 d0Var = e0Var.f89c;
            d0Var.getClass();
            d0Var.f83b.sendEmptyMessage(3);
        }
        e0Var.b();
    }

    public final void f(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f64e = Math.min(this.f64e, 2);
                    return;
                }
                throw new IllegalStateException();
            }
            this.f64e = 0;
            return;
        }
        this.f64e = 1;
    }

    public final void g(float f7) {
        e0 e0Var = this.f62b;
        e0Var.f91f = f7;
        h hVar = e0Var.f87a;
        hVar.f128a.c();
        hVar.f129b.c();
        hVar.f130c = false;
        hVar.d = -9223372036854775807L;
        hVar.f131e = 0;
        e0Var.c();
    }

    public final void h(Surface surface) {
        boolean z10;
        if (surface != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f71m = z10;
        this.f72n = false;
        e0 e0Var = this.f62b;
        if (e0Var.f90e != surface) {
            e0Var.b();
            e0Var.f90e = surface;
            e0Var.d(true);
        }
        this.f64e = Math.min(this.f64e, 1);
    }

    public final void i(float f7) {
        boolean z10;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        if (f7 == this.f69k) {
            return;
        }
        this.f69k = f7;
        e0 e0Var = this.f62b;
        e0Var.f93i = f7;
        e0Var.f97m = 0L;
        e0Var.f100p = -1L;
        e0Var.f98n = -1L;
        e0Var.d(false);
    }
}
