package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
public final class uac {
    public final vk6 a;
    public final zac b;
    public final short c;
    public boolean d;
    public long g;
    public boolean i;
    public boolean l;
    public boolean m;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public float j = 1.0f;
    public adb k = adb.a;

    public uac(Context context, vk6 vk6Var, long j) {
        this.a = vk6Var;
        this.c = (int) j;
        this.b = new zac(context);
    }

    public final int a(long r29, long r31, long r33, long r35, boolean r37, boolean r38, long r39, long r41, defpackage.jy0 r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uac.a(long, long, long, long, boolean, boolean, long, long, jy0):int");
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (this.m && !this.l))) {
            this.h = -9223372036854775807L;
            return true;
        } else if (this.h == -9223372036854775807L) {
            return false;
        } else {
            this.k.getClass();
            if (SystemClock.elapsedRealtime() < this.h) {
                return true;
            }
            this.h = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z) {
        long j;
        this.i = z;
        long j2 = this.c;
        if (j2 > 0) {
            this.k.getClass();
            j = SystemClock.elapsedRealtime() + j2;
        } else {
            j = -9223372036854775807L;
        }
        this.h = j;
    }

    public final void d() {
        wac wacVar;
        this.d = true;
        this.k.getClass();
        this.g = g8c.T(SystemClock.elapsedRealtime());
        zac zacVar = this.b;
        zacVar.d = true;
        zacVar.b();
        if (!zacVar.b) {
            DisplayManager displayManager = (DisplayManager) zacVar.a.getSystemService("display");
            wac wacVar2 = null;
            if (displayManager != null) {
                try {
                    Choreographer choreographer = Choreographer.getInstance();
                    if (Build.VERSION.SDK_INT >= 33) {
                        wacVar = new yac(choreographer, displayManager);
                    } else {
                        wacVar = new wac(choreographer, displayManager);
                    }
                    wacVar2 = wacVar;
                } catch (RuntimeException e) {
                    lad.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
                }
            }
            zacVar.c = wacVar2;
            zacVar.b = true;
        }
        wac wacVar3 = zacVar.c;
        if (wacVar3 != null) {
            wacVar3.a();
        }
        zacVar.c(false);
    }

    public final void e(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.e = Math.min(this.e, 2);
                } else {
                    sdb.a();
                    return;
                }
            } else {
                this.e = 0;
            }
        } else {
            this.e = 1;
        }
        this.b.b();
    }

    public final void f(Surface surface) {
        boolean z;
        if (surface != null) {
            z = true;
        } else {
            z = false;
        }
        this.l = z;
        this.m = false;
        zac zacVar = this.b;
        if (zacVar.e != surface) {
            zacVar.a();
            zacVar.e = surface;
            zacVar.c(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void g(float f) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        if (f == this.j) {
            return;
        }
        this.j = f;
        zac zacVar = this.b;
        zacVar.h = f;
        zacVar.c(false);
    }
}
