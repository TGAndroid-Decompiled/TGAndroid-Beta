package a3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;
public final class e0 {
    public final h f81a;
    public final c0 f82b;
    public final d0 f83c;
    public boolean d;
    public Surface e;
    public float f84f;
    public float f85g;
    public float h;
    public float f86i;
    public int f87j;
    public long f88k;
    public long f89l;
    public long f90m;
    public long f91n;
    public long f92o;
    public long f93p;
    public long f94q;

    public e0(Context context) {
        DisplayManager displayManager;
        c0 c0Var;
        ?? obj = new Object();
        obj.f117a = new g();
        obj.f118b = new g();
        obj.d = -9223372036854775807L;
        this.f81a = obj;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            c0Var = null;
        } else {
            c0Var = new c0(this, displayManager);
        }
        this.f82b = c0Var;
        this.f83c = c0Var != null ? d0.e : null;
        this.f88k = -9223372036854775807L;
        this.f89l = -9223372036854775807L;
        this.f84f = -1.0f;
        this.f86i = 1.0f;
        this.f87j = 0;
    }

    public static void a(e0 e0Var, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            e0Var.f88k = refreshRate;
            e0Var.f89l = (refreshRate * 80) / 100;
            return;
        }
        e2.a.n("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        e0Var.f88k = -9223372036854775807L;
        e0Var.f89l = -9223372036854775807L;
    }

    public final void b() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.e) != null && this.f87j != Integer.MIN_VALUE && this.h != 0.0f) {
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
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.e) != null && this.f87j != Integer.MIN_VALUE) {
            if (this.d) {
                float f10 = this.f85g;
                if (f10 != -1.0f) {
                    f7 = f10 * this.f86i;
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
