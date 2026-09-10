package a3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import android.view.Surface;
public final class a0 {
    public final n f57a;
    public final e0 f58b;
    public final long f59c;
    public boolean d;
    public long f61g;
    public boolean f63j;
    public boolean f66m;
    public boolean f67n;
    public int e = 0;
    public long f60f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f62i = -9223372036854775807L;
    public float f64k = 1.0f;
    public e2.x f65l = e2.x.f7240a;

    public a0(Context context, n nVar, long j3) {
        this.f57a = nVar;
        this.f59c = j3;
        this.f58b = new e0(context);
    }

    public final int a(long r28, long r30, long r32, long r34, boolean r36, boolean r37, a3.z r38) {
        throw new UnsupportedOperationException("Method not decompiled: a3.a0.a(long, long, long, long, boolean, boolean, a3.z):int");
    }

    public final boolean b(boolean z10) {
        if (z10 && (this.e == 3 || (!this.f66m && this.f67n))) {
            this.f62i = -9223372036854775807L;
            return true;
        } else if (this.f62i == -9223372036854775807L) {
            return false;
        } else {
            this.f65l.getClass();
            if (SystemClock.elapsedRealtime() < this.f62i) {
                return true;
            }
            this.f62i = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z10) {
        long j3;
        this.f63j = z10;
        long j10 = this.f59c;
        if (j10 > 0) {
            this.f65l.getClass();
            j3 = SystemClock.elapsedRealtime() + j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.f62i = j3;
    }

    public final void d() {
        this.d = true;
        this.f65l.getClass();
        this.f61g = e2.d0.Q(SystemClock.elapsedRealtime());
        e0 e0Var = this.f58b;
        e0Var.d = true;
        e0Var.f90m = 0L;
        e0Var.f93p = -1L;
        e0Var.f91n = -1L;
        c0 c0Var = e0Var.f82b;
        if (c0Var != null) {
            DisplayManager displayManager = c0Var.f72a;
            d0 d0Var = e0Var.f83c;
            d0Var.getClass();
            d0Var.f77b.sendEmptyMessage(2);
            displayManager.registerDisplayListener(c0Var, e2.d0.o(null));
            e0.a(c0Var.f73b, displayManager.getDisplay(0));
        }
        e0Var.d(false);
    }

    public final void e() {
        this.d = false;
        this.f62i = -9223372036854775807L;
        e0 e0Var = this.f58b;
        e0Var.d = false;
        c0 c0Var = e0Var.f82b;
        if (c0Var != null) {
            c0Var.f72a.unregisterDisplayListener(c0Var);
            d0 d0Var = e0Var.f83c;
            d0Var.getClass();
            d0Var.f77b.sendEmptyMessage(3);
        }
        e0Var.b();
    }

    public final void f(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.e = Math.min(this.e, 2);
                    return;
                }
                throw new IllegalStateException();
            }
            this.e = 0;
            return;
        }
        this.e = 1;
    }

    public final void g(float f7) {
        e0 e0Var = this.f58b;
        e0Var.f84f = f7;
        h hVar = e0Var.f81a;
        hVar.f117a.c();
        hVar.f118b.c();
        hVar.f119c = false;
        hVar.d = -9223372036854775807L;
        hVar.e = 0;
        e0Var.c();
    }

    public final void h(Surface surface) {
        boolean z10;
        if (surface != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f66m = z10;
        this.f67n = false;
        e0 e0Var = this.f58b;
        if (e0Var.e != surface) {
            e0Var.b();
            e0Var.e = surface;
            e0Var.d(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void i(float f7) {
        boolean z10;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        if (f7 == this.f64k) {
            return;
        }
        this.f64k = f7;
        e0 e0Var = this.f58b;
        e0Var.f86i = f7;
        e0Var.f90m = 0L;
        e0Var.f93p = -1L;
        e0Var.f91n = -1L;
        e0Var.d(false);
    }
}
