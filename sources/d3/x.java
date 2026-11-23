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
    public final l f7793a;
    public final c0 f7794b;
    public final long f7795c;
    public boolean d;
    public long f7798g;
    public boolean f7800j;
    public boolean f7803m;
    public boolean f7804n;
    public int f7796e = 0;
    public long f7797f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f7799i = -9223372036854775807L;
    public float f7801k = 1.0f;
    public h2.g0 f7802l = h2.g0.f13792a;
    public final boolean f7805o = true;

    public x(Context context, l lVar, long j3) {
        this.f7793a = lVar;
        this.f7795c = j3;
        this.f7794b = new c0(context);
    }

    public final int a(long r31, long r33, long r35, long r37, boolean r39, boolean r40, d3.w r41) {
        throw new UnsupportedOperationException("Method not decompiled: d3.x.a(long, long, long, long, boolean, boolean, d3.w):int");
    }

    public final boolean b(boolean z10) {
        if (z10 && (this.f7796e == 3 || (this.f7804n && (!this.f7803m || !this.f7805o)))) {
            this.f7799i = -9223372036854775807L;
            return true;
        } else if (this.f7799i == -9223372036854775807L) {
            return false;
        } else {
            this.f7802l.getClass();
            if (SystemClock.elapsedRealtime() < this.f7799i) {
                return true;
            }
            this.f7799i = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z10) {
        long j3;
        this.f7800j = z10;
        long j10 = this.f7795c;
        if (j10 > 0) {
            this.f7802l.getClass();
            j3 = SystemClock.elapsedRealtime() + j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.f7799i = j3;
    }

    public final void d() {
        z zVar;
        this.d = true;
        this.f7802l.getClass();
        this.f7798g = l0.S(SystemClock.elapsedRealtime());
        c0 c0Var = this.f7794b;
        c0Var.d = true;
        c0Var.b();
        DisplayManager displayManager = (DisplayManager) c0Var.f7667b.getSystemService("display");
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
        c0Var.f7668c = zVar2;
        if (zVar2 != null) {
            zVar2.a();
        }
        c0Var.d(false);
    }

    public final void e(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    this.f7796e = Math.min(this.f7796e, 2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                this.f7796e = 0;
            }
        } else {
            this.f7796e = 1;
        }
        this.f7794b.b();
    }

    public final void f(float f10) {
        c0 c0Var = this.f7794b;
        c0Var.f7670f = f10;
        g gVar = c0Var.f7666a;
        gVar.f7716a.c();
        gVar.f7717b.c();
        gVar.f7718c = false;
        gVar.d = -9223372036854775807L;
        gVar.f7719e = 0;
        c0Var.c();
    }

    public final void g(Surface surface) {
        boolean z10;
        if (surface != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f7803m = z10;
        this.f7804n = false;
        c0 c0Var = this.f7794b;
        if (c0Var.f7669e != surface) {
            c0Var.a();
            c0Var.f7669e = surface;
            c0Var.d(true);
        }
        this.f7796e = Math.min(this.f7796e, 1);
    }

    public final void h(float f10) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        if (f10 == this.f7801k) {
            return;
        }
        this.f7801k = f10;
        c0 c0Var = this.f7794b;
        c0Var.f7672i = f10;
        c0Var.d(false);
    }
}
