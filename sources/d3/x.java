package d3;

import a8.ja;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import h2.l0;
public final class x {
    public final l f7481a;
    public final c0 f7482b;
    public final long f7483c;
    public boolean d;
    public long f7486g;
    public boolean f7488j;
    public boolean f7491m;
    public boolean f7492n;
    public int f7484e = 0;
    public long f7485f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long f7487i = -9223372036854775807L;
    public float f7489k = 1.0f;
    public h2.g0 f7490l = h2.g0.f13448a;
    public final boolean f7493o = true;

    public x(Context context, l lVar, long j3) {
        this.f7481a = lVar;
        this.f7483c = j3;
        this.f7482b = new c0(context);
    }

    public final int a(long r31, long r33, long r35, long r37, boolean r39, boolean r40, d3.w r41) {
        throw new UnsupportedOperationException("Method not decompiled: d3.x.a(long, long, long, long, boolean, boolean, d3.w):int");
    }

    public final boolean b(boolean z10) {
        if (z10 && (this.f7484e == 3 || (this.f7492n && (!this.f7491m || !this.f7493o)))) {
            this.f7487i = -9223372036854775807L;
            return true;
        } else if (this.f7487i == -9223372036854775807L) {
            return false;
        } else {
            this.f7490l.getClass();
            if (SystemClock.elapsedRealtime() < this.f7487i) {
                return true;
            }
            this.f7487i = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z10) {
        long j3;
        this.f7488j = z10;
        long j10 = this.f7483c;
        if (j10 > 0) {
            this.f7490l.getClass();
            j3 = SystemClock.elapsedRealtime() + j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.f7487i = j3;
    }

    public final void d() {
        z zVar;
        this.d = true;
        this.f7490l.getClass();
        this.f7486g = l0.S(SystemClock.elapsedRealtime());
        c0 c0Var = this.f7482b;
        c0Var.d = true;
        c0Var.b();
        DisplayManager displayManager = (DisplayManager) c0Var.f7355b.getSystemService("display");
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
        c0Var.f7356c = zVar2;
        if (zVar2 != null) {
            zVar2.a();
        }
        c0Var.d(false);
    }

    public final void e(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    this.f7484e = Math.min(this.f7484e, 2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                this.f7484e = 0;
            }
        } else {
            this.f7484e = 1;
        }
        this.f7482b.b();
    }

    public final void f(float f10) {
        c0 c0Var = this.f7482b;
        c0Var.f7358f = f10;
        g gVar = c0Var.f7354a;
        gVar.f7404a.c();
        gVar.f7405b.c();
        gVar.f7406c = false;
        gVar.d = -9223372036854775807L;
        gVar.f7407e = 0;
        c0Var.c();
    }

    public final void g(Surface surface) {
        boolean z10;
        if (surface != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f7491m = z10;
        this.f7492n = false;
        c0 c0Var = this.f7482b;
        if (c0Var.f7357e != surface) {
            c0Var.a();
            c0Var.f7357e = surface;
            c0Var.d(true);
        }
        this.f7484e = Math.min(this.f7484e, 1);
    }

    public final void h(float f10) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        if (f10 == this.f7489k) {
            return;
        }
        this.f7489k = f10;
        c0 c0Var = this.f7482b;
        c0Var.f7360i = f10;
        c0Var.d(false);
    }
}
