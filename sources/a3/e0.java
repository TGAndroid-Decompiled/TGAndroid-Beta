package a3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;
public final class e0 {
    public final h f87a;
    public final c0 f88b;
    public final d0 f89c;
    public boolean d;
    public Surface f90e;
    public float f91f;
    public float f92g;
    public float h;
    public float f93i;
    public int f94j;
    public long f95k;
    public long f96l;
    public long f97m;
    public long f98n;
    public long f99o;
    public long f100p;
    public long f101q;

    public e0(Context context) {
        DisplayManager displayManager;
        c0 c0Var;
        ?? obj = new Object();
        obj.f128a = new g();
        obj.f129b = new g();
        obj.d = -9223372036854775807L;
        this.f87a = obj;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            c0Var = null;
        } else {
            c0Var = new c0(this, displayManager);
        }
        this.f88b = c0Var;
        this.f89c = c0Var != null ? d0.f81e : null;
        this.f95k = -9223372036854775807L;
        this.f96l = -9223372036854775807L;
        this.f91f = -1.0f;
        this.f93i = 1.0f;
        this.f94j = 0;
    }

    public static void a(e0 e0Var, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            e0Var.f95k = refreshRate;
            e0Var.f96l = (refreshRate * 80) / 100;
            return;
        }
        e2.a.n("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        e0Var.f95k = -9223372036854775807L;
        e0Var.f96l = -9223372036854775807L;
    }

    public final void b() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f90e) != null && this.f94j != Integer.MIN_VALUE && this.h != 0.0f) {
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
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f90e) != null && this.f94j != Integer.MIN_VALUE) {
            if (this.d) {
                float f10 = this.f92g;
                if (f10 != -1.0f) {
                    f7 = f10 * this.f93i;
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
