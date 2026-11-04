package c3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import b8.zb;
import g2.n0;
public final class y {
    public final l f4121a;
    public final d0 f4122b;
    public final long f4123c;
    public boolean d;
    public long f4126g;
    public boolean f4128j;
    public boolean f4131m;
    public boolean f4132n;
    public int f4124e = 0;
    public long f4125f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f4127i = -9223372036854775807L;
    public float f4129k = 1.0f;
    public g2.h0 f4130l = g2.h0.f11849a;
    public final boolean f4133o = true;

    public y(Context context, l lVar, long j10) {
        this.f4121a = lVar;
        this.f4123c = j10;
        this.f4122b = new d0(context);
    }

    public final int a(long r31, long r33, long r35, long r37, boolean r39, boolean r40, c3.x r41) {
        throw new UnsupportedOperationException("Method not decompiled: c3.y.a(long, long, long, long, boolean, boolean, c3.x):int");
    }

    public final boolean b(boolean z10) {
        if (z10 && (this.f4124e == 3 || (this.f4132n && (!this.f4131m || !this.f4133o)))) {
            this.f4127i = -9223372036854775807L;
            return true;
        } else if (this.f4127i == -9223372036854775807L) {
            return false;
        } else {
            this.f4130l.getClass();
            if (SystemClock.elapsedRealtime() < this.f4127i) {
                return true;
            }
            this.f4127i = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z10) {
        long j10;
        this.f4128j = z10;
        long j11 = this.f4123c;
        if (j11 > 0) {
            this.f4130l.getClass();
            j10 = SystemClock.elapsedRealtime() + j11;
        } else {
            j10 = -9223372036854775807L;
        }
        this.f4127i = j10;
    }

    public final void d() {
        a0 a0Var;
        this.d = true;
        this.f4130l.getClass();
        this.f4126g = n0.S(SystemClock.elapsedRealtime());
        d0 d0Var = this.f4122b;
        d0Var.d = true;
        d0Var.b();
        DisplayManager displayManager = (DisplayManager) d0Var.f3991b.getSystemService("display");
        a0 a0Var2 = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                if (Build.VERSION.SDK_INT >= 33) {
                    a0Var = new c0(choreographer, displayManager);
                } else {
                    a0Var = new a0(choreographer, displayManager);
                }
                a0Var2 = a0Var;
            } catch (RuntimeException e10) {
                g2.a.m("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }
        d0Var.f3992c = a0Var2;
        if (a0Var2 != null) {
            a0Var2.a();
        }
        d0Var.d(false);
    }

    public final void e(int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    this.f4124e = Math.min(this.f4124e, 2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                this.f4124e = 0;
            }
        } else {
            this.f4124e = 1;
        }
        this.f4122b.b();
    }

    public final void f(float f10) {
        d0 d0Var = this.f4122b;
        d0Var.f3994f = f10;
        g gVar = d0Var.f3990a;
        gVar.f4035a.c();
        gVar.f4036b.c();
        gVar.f4037c = false;
        gVar.d = -9223372036854775807L;
        gVar.f4038e = 0;
        d0Var.c();
    }

    public final void g(Surface surface) {
        boolean z10;
        if (surface != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f4131m = z10;
        this.f4132n = false;
        d0 d0Var = this.f4122b;
        if (d0Var.f3993e != surface) {
            d0Var.a();
            d0Var.f3993e = surface;
            d0Var.d(true);
        }
        this.f4124e = Math.min(this.f4124e, 1);
    }

    public final void h(float f10) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        if (f10 == this.f4129k) {
            return;
        }
        this.f4129k = f10;
        d0 d0Var = this.f4122b;
        d0Var.f3996i = f10;
        d0Var.d(false);
    }
}
