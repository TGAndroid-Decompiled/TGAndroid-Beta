package a3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import android.view.Surface;
public final class a0 {
    public final n f59a;
    public final e0 f60b;
    public final long f61c;
    public boolean d;
    public long f63g;
    public boolean f65j;
    public boolean f68m;
    public boolean f69n;
    public int e = 0;
    public long f62f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f64i = -9223372036854775807L;
    public float f66k = 1.0f;
    public e2.x f67l = e2.x.f7940a;

    public a0(Context context, n nVar, long j3) {
        this.f59a = nVar;
        this.f61c = j3;
        this.f60b = new e0(context);
    }

    public final int a(long r28, long r30, long r32, long r34, boolean r36, boolean r37, a3.z r38) {
        throw new UnsupportedOperationException("Method not decompiled: a3.a0.a(long, long, long, long, boolean, boolean, a3.z):int");
    }

    public final boolean b(boolean z10) {
        if (z10 && (this.e == 3 || (!this.f68m && this.f69n))) {
            this.f64i = -9223372036854775807L;
            return true;
        } else if (this.f64i == -9223372036854775807L) {
            return false;
        } else {
            this.f67l.getClass();
            if (SystemClock.elapsedRealtime() < this.f64i) {
                return true;
            }
            this.f64i = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z10) {
        long j3;
        this.f65j = z10;
        long j10 = this.f61c;
        if (j10 > 0) {
            this.f67l.getClass();
            j3 = SystemClock.elapsedRealtime() + j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.f64i = j3;
    }

    public final void d() {
        this.d = true;
        this.f67l.getClass();
        this.f63g = e2.d0.Q(SystemClock.elapsedRealtime());
        e0 e0Var = this.f60b;
        e0Var.d = true;
        e0Var.f92m = 0L;
        e0Var.f95p = -1L;
        e0Var.f93n = -1L;
        c0 c0Var = e0Var.f84b;
        if (c0Var != null) {
            DisplayManager displayManager = c0Var.f74a;
            d0 d0Var = e0Var.f85c;
            d0Var.getClass();
            d0Var.f79b.sendEmptyMessage(2);
            displayManager.registerDisplayListener(c0Var, e2.d0.o(null));
            e0.a(c0Var.f75b, displayManager.getDisplay(0));
        }
        e0Var.d(false);
    }

    public final void e() {
        this.d = false;
        this.f64i = -9223372036854775807L;
        e0 e0Var = this.f60b;
        e0Var.d = false;
        c0 c0Var = e0Var.f84b;
        if (c0Var != null) {
            c0Var.f74a.unregisterDisplayListener(c0Var);
            d0 d0Var = e0Var.f85c;
            d0Var.getClass();
            d0Var.f79b.sendEmptyMessage(3);
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
        e0 e0Var = this.f60b;
        e0Var.f86f = f7;
        h hVar = e0Var.f83a;
        hVar.f119a.c();
        hVar.f120b.c();
        hVar.f121c = false;
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
        this.f68m = z10;
        this.f69n = false;
        e0 e0Var = this.f60b;
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
        if (f7 == this.f66k) {
            return;
        }
        this.f66k = f7;
        e0 e0Var = this.f60b;
        e0Var.f88i = f7;
        e0Var.f92m = 0L;
        e0Var.f95p = -1L;
        e0Var.f93n = -1L;
        e0Var.d(false);
    }
}
