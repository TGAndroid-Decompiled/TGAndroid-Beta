package a3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import android.view.Surface;
public final class z {
    public final m f196a;
    public final d0 f197b;
    public final long f198c;
    public boolean d;
    public long f201g;
    public boolean f203j;
    public boolean f206m;
    public boolean f207n;
    public int f199e = 0;
    public long f200f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f202i = -9223372036854775807L;
    public float f204k = 1.0f;
    public e2.x f205l = e2.x.f8795a;

    public z(Context context, m mVar, long j3) {
        this.f196a = mVar;
        this.f198c = j3;
        this.f197b = new d0(context);
    }

    public final int a(long r28, long r30, long r32, long r34, boolean r36, boolean r37, a3.y r38) {
        throw new UnsupportedOperationException("Method not decompiled: a3.z.a(long, long, long, long, boolean, boolean, a3.y):int");
    }

    public final boolean b(boolean z10) {
        if (z10 && (this.f199e == 3 || (!this.f206m && this.f207n))) {
            this.f202i = -9223372036854775807L;
            return true;
        } else if (this.f202i == -9223372036854775807L) {
            return false;
        } else {
            this.f205l.getClass();
            if (SystemClock.elapsedRealtime() < this.f202i) {
                return true;
            }
            this.f202i = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z10) {
        long j3;
        this.f203j = z10;
        long j10 = this.f198c;
        if (j10 > 0) {
            this.f205l.getClass();
            j3 = SystemClock.elapsedRealtime() + j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.f202i = j3;
    }

    public final void d() {
        this.d = true;
        this.f205l.getClass();
        this.f201g = e2.d0.Q(SystemClock.elapsedRealtime());
        d0 d0Var = this.f197b;
        d0Var.d = true;
        d0Var.f73m = 0L;
        d0Var.f76p = -1L;
        d0Var.f74n = -1L;
        b0 b0Var = d0Var.f64b;
        if (b0Var != null) {
            DisplayManager displayManager = b0Var.f53a;
            c0 c0Var = d0Var.f65c;
            c0Var.getClass();
            c0Var.f59b.sendEmptyMessage(2);
            displayManager.registerDisplayListener(b0Var, e2.d0.o(null));
            d0.a(b0Var.f54b, displayManager.getDisplay(0));
        }
        d0Var.d(false);
    }

    public final void e() {
        this.d = false;
        this.f202i = -9223372036854775807L;
        d0 d0Var = this.f197b;
        d0Var.d = false;
        b0 b0Var = d0Var.f64b;
        if (b0Var != null) {
            b0Var.f53a.unregisterDisplayListener(b0Var);
            c0 c0Var = d0Var.f65c;
            c0Var.getClass();
            c0Var.f59b.sendEmptyMessage(3);
        }
        d0Var.b();
    }

    public final void f(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f199e = Math.min(this.f199e, 2);
                    return;
                }
                throw new IllegalStateException();
            }
            this.f199e = 0;
            return;
        }
        this.f199e = 1;
    }

    public final void g(float f7) {
        d0 d0Var = this.f197b;
        d0Var.f67f = f7;
        g gVar = d0Var.f63a;
        gVar.f104a.c();
        gVar.f105b.c();
        gVar.f106c = false;
        gVar.d = -9223372036854775807L;
        gVar.f107e = 0;
        d0Var.c();
    }

    public final void h(Surface surface) {
        boolean z10;
        if (surface != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f206m = z10;
        this.f207n = false;
        d0 d0Var = this.f197b;
        if (d0Var.f66e != surface) {
            d0Var.b();
            d0Var.f66e = surface;
            d0Var.d(true);
        }
        this.f199e = Math.min(this.f199e, 1);
    }

    public final void i(float f7) {
        boolean z10;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        if (f7 == this.f204k) {
            return;
        }
        this.f204k = f7;
        d0 d0Var = this.f197b;
        d0Var.f69i = f7;
        d0Var.f73m = 0L;
        d0Var.f76p = -1L;
        d0Var.f74n = -1L;
        d0Var.d(false);
    }
}
