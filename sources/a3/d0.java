package a3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;
public final class d0 {
    public final g f63a;
    public final b0 f64b;
    public final c0 f65c;
    public boolean d;
    public Surface f66e;
    public float f67f;
    public float f68g;
    public float h;
    public float f69i;
    public int f70j;
    public long f71k;
    public long f72l;
    public long f73m;
    public long f74n;
    public long f75o;
    public long f76p;
    public long f77q;

    public d0(Context context) {
        DisplayManager displayManager;
        b0 b0Var;
        ?? obj = new Object();
        obj.f104a = new f();
        obj.f105b = new f();
        obj.d = -9223372036854775807L;
        this.f63a = obj;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            b0Var = null;
        } else {
            b0Var = new b0(this, displayManager);
        }
        this.f64b = b0Var;
        this.f65c = b0Var != null ? c0.f57e : null;
        this.f71k = -9223372036854775807L;
        this.f72l = -9223372036854775807L;
        this.f67f = -1.0f;
        this.f69i = 1.0f;
        this.f70j = 0;
    }

    public static void a(d0 d0Var, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            d0Var.f71k = refreshRate;
            d0Var.f72l = (refreshRate * 80) / 100;
            return;
        }
        e2.a.n("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        d0Var.f71k = -9223372036854775807L;
        d0Var.f72l = -9223372036854775807L;
    }

    public final void b() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f66e) != null && this.f70j != Integer.MIN_VALUE && this.h != 0.0f) {
            this.h = 0.0f;
            g0.f.v(surface, 0.0f);
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: a3.d0.c():void");
    }

    public final void d(boolean z10) {
        Surface surface;
        float f7;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f66e) != null && this.f70j != Integer.MIN_VALUE) {
            if (this.d) {
                float f10 = this.f68g;
                if (f10 != -1.0f) {
                    f7 = f10 * this.f69i;
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
