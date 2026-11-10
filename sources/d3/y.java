package d3;

import a8.ia;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import h2.m0;
public final class y {
    public final l f8098a;
    public final d0 f8099b;
    public final long f8100c;
    public boolean d;
    public long f8103g;
    public boolean f8105j;
    public boolean f8108m;
    public boolean f8109n;
    public int f8101e = 0;
    public long f8102f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f8104i = -9223372036854775807L;
    public float f8106k = 1.0f;
    public h2.g0 f8107l = h2.g0.f14090a;
    public final boolean f8110o = true;

    public y(Context context, l lVar, long j3) {
        this.f8098a = lVar;
        this.f8100c = j3;
        this.f8099b = new d0(context);
    }

    public final int a(long r31, long r33, long r35, long r37, boolean r39, boolean r40, d3.x r41) {
        throw new UnsupportedOperationException("Method not decompiled: d3.y.a(long, long, long, long, boolean, boolean, d3.x):int");
    }

    public final boolean b(boolean z9) {
        if (z9 && (this.f8101e == 3 || (this.f8109n && (!this.f8108m || !this.f8110o)))) {
            this.f8104i = -9223372036854775807L;
            return true;
        } else if (this.f8104i == -9223372036854775807L) {
            return false;
        } else {
            this.f8107l.getClass();
            if (SystemClock.elapsedRealtime() < this.f8104i) {
                return true;
            }
            this.f8104i = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z9) {
        long j3;
        this.f8105j = z9;
        long j10 = this.f8100c;
        if (j10 > 0) {
            this.f8107l.getClass();
            j3 = SystemClock.elapsedRealtime() + j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.f8104i = j3;
    }

    public final void d() {
        a0 a0Var;
        this.d = true;
        this.f8107l.getClass();
        this.f8103g = m0.S(SystemClock.elapsedRealtime());
        d0 d0Var = this.f8099b;
        d0Var.d = true;
        d0Var.b();
        DisplayManager displayManager = (DisplayManager) d0Var.f7972b.getSystemService("display");
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
                h2.a.m("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }
        d0Var.f7973c = a0Var2;
        if (a0Var2 != null) {
            a0Var2.a();
        }
        d0Var.d(false);
    }

    public final void e(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    this.f8101e = Math.min(this.f8101e, 2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                this.f8101e = 0;
            }
        } else {
            this.f8101e = 1;
        }
        this.f8099b.b();
    }

    public final void f(float f10) {
        d0 d0Var = this.f8099b;
        d0Var.f7975f = f10;
        g gVar = d0Var.f7971a;
        gVar.f8015a.c();
        gVar.f8016b.c();
        gVar.f8017c = false;
        gVar.d = -9223372036854775807L;
        gVar.f8018e = 0;
        d0Var.c();
    }

    public final void g(Surface surface) {
        boolean z9;
        if (surface != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f8108m = z9;
        this.f8109n = false;
        d0 d0Var = this.f8099b;
        if (d0Var.f7974e != surface) {
            d0Var.a();
            d0Var.f7974e = surface;
            d0Var.d(true);
        }
        this.f8101e = Math.min(this.f8101e, 1);
    }

    public final void h(float f10) {
        boolean z9;
        if (f10 > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        if (f10 == this.f8106k) {
            return;
        }
        this.f8106k = f10;
        d0 d0Var = this.f8099b;
        d0Var.f7977i = f10;
        d0Var.d(false);
    }
}
