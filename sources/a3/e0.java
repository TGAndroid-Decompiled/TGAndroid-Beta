package a3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;
public final class e0 {
    public final h f89a;
    public final c0 f90b;
    public final d0 f91c;
    public boolean d;
    public Surface f92e;
    public float f93f;
    public float f94g;
    public float h;
    public float f95i;
    public int f96j;
    public long f97k;
    public long f98l;
    public long f99m;
    public long f100n;
    public long f101o;
    public long f102p;
    public long f103q;

    public e0(Context context) {
        DisplayManager displayManager;
        c0 c0Var;
        ?? obj = new Object();
        obj.f130a = new g();
        obj.f131b = new g();
        obj.d = -9223372036854775807L;
        this.f89a = obj;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            c0Var = null;
        } else {
            c0Var = new c0(this, displayManager);
        }
        this.f90b = c0Var;
        this.f91c = c0Var != null ? d0.f83e : null;
        this.f97k = -9223372036854775807L;
        this.f98l = -9223372036854775807L;
        this.f93f = -1.0f;
        this.f95i = 1.0f;
        this.f96j = 0;
    }

    public static void a(e0 e0Var, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            e0Var.f97k = refreshRate;
            e0Var.f98l = (refreshRate * 80) / 100;
            return;
        }
        e2.a.n("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        e0Var.f97k = -9223372036854775807L;
        e0Var.f98l = -9223372036854775807L;
    }

    public final void b() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f92e) != null && this.f96j != Integer.MIN_VALUE && this.h != 0.0f) {
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
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f92e) != null && this.f96j != Integer.MIN_VALUE) {
            if (this.d) {
                float f10 = this.f94g;
                if (f10 != -1.0f) {
                    f7 = f10 * this.f95i;
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
