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
    public final l f8093a;
    public final d0 f8094b;
    public final long f8095c;
    public boolean d;
    public long f8098g;
    public boolean f8100j;
    public boolean f8103m;
    public boolean f8104n;
    public int f8096e = 0;
    public long f8097f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f8099i = -9223372036854775807L;
    public float f8101k = 1.0f;
    public h2.g0 f8102l = h2.g0.f14088a;
    public final boolean f8105o = true;

    public y(Context context, l lVar, long j3) {
        this.f8093a = lVar;
        this.f8095c = j3;
        this.f8094b = new d0(context);
    }

    public final int a(long r31, long r33, long r35, long r37, boolean r39, boolean r40, d3.x r41) {
        throw new UnsupportedOperationException("Method not decompiled: d3.y.a(long, long, long, long, boolean, boolean, d3.x):int");
    }

    public final boolean b(boolean z9) {
        if (z9 && (this.f8096e == 3 || (this.f8104n && (!this.f8103m || !this.f8105o)))) {
            this.f8099i = -9223372036854775807L;
            return true;
        } else if (this.f8099i == -9223372036854775807L) {
            return false;
        } else {
            this.f8102l.getClass();
            if (SystemClock.elapsedRealtime() < this.f8099i) {
                return true;
            }
            this.f8099i = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z9) {
        long j3;
        this.f8100j = z9;
        long j10 = this.f8095c;
        if (j10 > 0) {
            this.f8102l.getClass();
            j3 = SystemClock.elapsedRealtime() + j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.f8099i = j3;
    }

    public final void d() {
        a0 a0Var;
        this.d = true;
        this.f8102l.getClass();
        this.f8098g = m0.S(SystemClock.elapsedRealtime());
        d0 d0Var = this.f8094b;
        d0Var.d = true;
        d0Var.b();
        DisplayManager displayManager = (DisplayManager) d0Var.f7967b.getSystemService("display");
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
        d0Var.f7968c = a0Var2;
        if (a0Var2 != null) {
            a0Var2.a();
        }
        d0Var.d(false);
    }

    public final void e(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    this.f8096e = Math.min(this.f8096e, 2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                this.f8096e = 0;
            }
        } else {
            this.f8096e = 1;
        }
        this.f8094b.b();
    }

    public final void f(float f10) {
        d0 d0Var = this.f8094b;
        d0Var.f7970f = f10;
        g gVar = d0Var.f7966a;
        gVar.f8010a.c();
        gVar.f8011b.c();
        gVar.f8012c = false;
        gVar.d = -9223372036854775807L;
        gVar.f8013e = 0;
        d0Var.c();
    }

    public final void g(Surface surface) {
        boolean z9;
        if (surface != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f8103m = z9;
        this.f8104n = false;
        d0 d0Var = this.f8094b;
        if (d0Var.f7969e != surface) {
            d0Var.a();
            d0Var.f7969e = surface;
            d0Var.d(true);
        }
        this.f8096e = Math.min(this.f8096e, 1);
    }

    public final void h(float f10) {
        boolean z9;
        if (f10 > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        if (f10 == this.f8101k) {
            return;
        }
        this.f8101k = f10;
        d0 d0Var = this.f8094b;
        d0Var.f7972i = f10;
        d0Var.d(false);
    }
}
