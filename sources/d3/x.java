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
    public final l f7764a;
    public final c0 f7765b;
    public final long f7766c;
    public boolean d;
    public long f7769g;
    public boolean f7771j;
    public boolean f7774m;
    public boolean f7775n;
    public int f7767e = 0;
    public long f7768f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f7770i = -9223372036854775807L;
    public float f7772k = 1.0f;
    public h2.g0 f7773l = h2.g0.f13763a;
    public final boolean f7776o = true;

    public x(Context context, l lVar, long j3) {
        this.f7764a = lVar;
        this.f7766c = j3;
        this.f7765b = new c0(context);
    }

    public final int a(long r31, long r33, long r35, long r37, boolean r39, boolean r40, d3.w r41) {
        throw new UnsupportedOperationException("Method not decompiled: d3.x.a(long, long, long, long, boolean, boolean, d3.w):int");
    }

    public final boolean b(boolean z10) {
        if (z10 && (this.f7767e == 3 || (this.f7775n && (!this.f7774m || !this.f7776o)))) {
            this.f7770i = -9223372036854775807L;
            return true;
        } else if (this.f7770i == -9223372036854775807L) {
            return false;
        } else {
            this.f7773l.getClass();
            if (SystemClock.elapsedRealtime() < this.f7770i) {
                return true;
            }
            this.f7770i = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z10) {
        long j3;
        this.f7771j = z10;
        long j10 = this.f7766c;
        if (j10 > 0) {
            this.f7773l.getClass();
            j3 = SystemClock.elapsedRealtime() + j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.f7770i = j3;
    }

    public final void d() {
        z zVar;
        this.d = true;
        this.f7773l.getClass();
        this.f7769g = l0.S(SystemClock.elapsedRealtime());
        c0 c0Var = this.f7765b;
        c0Var.d = true;
        c0Var.b();
        DisplayManager displayManager = (DisplayManager) c0Var.f7638b.getSystemService("display");
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
        c0Var.f7639c = zVar2;
        if (zVar2 != null) {
            zVar2.a();
        }
        c0Var.d(false);
    }

    public final void e(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    this.f7767e = Math.min(this.f7767e, 2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                this.f7767e = 0;
            }
        } else {
            this.f7767e = 1;
        }
        this.f7765b.b();
    }

    public final void f(float f10) {
        c0 c0Var = this.f7765b;
        c0Var.f7641f = f10;
        g gVar = c0Var.f7637a;
        gVar.f7687a.c();
        gVar.f7688b.c();
        gVar.f7689c = false;
        gVar.d = -9223372036854775807L;
        gVar.f7690e = 0;
        c0Var.c();
    }

    public final void g(Surface surface) {
        boolean z10;
        if (surface != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f7774m = z10;
        this.f7775n = false;
        c0 c0Var = this.f7765b;
        if (c0Var.f7640e != surface) {
            c0Var.a();
            c0Var.f7640e = surface;
            c0Var.d(true);
        }
        this.f7767e = Math.min(this.f7767e, 1);
    }

    public final void h(float f10) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        if (f10 == this.f7772k) {
            return;
        }
        this.f7772k = f10;
        c0 c0Var = this.f7765b;
        c0Var.f7643i = f10;
        c0Var.d(false);
    }
}
