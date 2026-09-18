package a3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;
public final class e0 {
    public final h f83a;
    public final c0 f84b;
    public final d0 f85c;
    public boolean d;
    public Surface e;
    public float f86f;
    public float f87g;
    public float h;
    public float f88i;
    public int f89j;
    public long f90k;
    public long f91l;
    public long f92m;
    public long f93n;
    public long f94o;
    public long f95p;
    public long f96q;

    public e0(Context context) {
        DisplayManager displayManager;
        c0 c0Var;
        ?? obj = new Object();
        obj.f119a = new g();
        obj.f120b = new g();
        obj.d = -9223372036854775807L;
        this.f83a = obj;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            c0Var = null;
        } else {
            c0Var = new c0(this, displayManager);
        }
        this.f84b = c0Var;
        this.f85c = c0Var != null ? d0.e : null;
        this.f90k = -9223372036854775807L;
        this.f91l = -9223372036854775807L;
        this.f86f = -1.0f;
        this.f88i = 1.0f;
        this.f89j = 0;
    }

    public static void a(e0 e0Var, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            e0Var.f90k = refreshRate;
            e0Var.f91l = (refreshRate * 80) / 100;
            return;
        }
        e2.a.n("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        e0Var.f90k = -9223372036854775807L;
        e0Var.f91l = -9223372036854775807L;
    }

    public final void b() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.e) != null && this.f89j != Integer.MIN_VALUE && this.h != 0.0f) {
            this.h = 0.0f;
            g0.f.v(surface, 0.0f);
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: a3.e0.c():void");
    }

    public final void d(boolean z10) {
        Surface surface;
        float f7;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.e) != null && this.f89j != Integer.MIN_VALUE) {
            if (this.d) {
                float f10 = this.f87g;
                if (f10 != -1.0f) {
                    f7 = f10 * this.f88i;
                    if (!z10 || this.h != f7) {
                        this.h = f7;
                        g0.f.v(surface, f7);
                    }
                    return;
                }
            }
            f7 = 0.0f;
            if (!z10) {
            }
            this.h = f7;
            g0.f.v(surface, f7);
        }
    }
}
