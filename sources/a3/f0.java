package a3;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
public final class f0 {
    public final h f86a;
    public final Context f87b;
    public c0 f88c;
    public boolean d;
    public Surface e;
    public float f89f;
    public float f90g;
    public float h;
    public float f91i;
    public int f92j;
    public long f93k;
    public long f94l;
    public long f95m;
    public long f96n;
    public long f97o;
    public long f98p;
    public long f99q;
    public long f100r;
    public long f101s;

    public f0(Context context) {
        this.f87b = context;
        ?? obj = new Object();
        obj.f116a = new g();
        obj.f117b = new g();
        obj.d = -9223372036854775807L;
        this.f86a = obj;
        this.f89f = -1.0f;
        this.f91i = 1.0f;
        this.f92j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.e) != null && this.f92j != Integer.MIN_VALUE && this.h != 0.0f && surface.isValid()) {
            this.h = 0.0f;
            g0.f.v(this.e, 0.0f);
        }
    }

    public final void b() {
        this.f95m = 0L;
        this.f99q = -1L;
        this.f96n = -1L;
        this.f93k = 0L;
        this.f94l = 0L;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: a3.f0.c():void");
    }

    public final void d(boolean z10) {
        Surface surface;
        float f7;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.e) != null && this.f92j != Integer.MIN_VALUE && surface.isValid()) {
            if (this.d) {
                float f10 = this.f90g;
                if (f10 != -1.0f) {
                    f7 = f10 * this.f91i;
                    if (!z10 || this.h != f7) {
                        this.h = f7;
                        g0.f.v(this.e, f7);
                    }
                    return;
                }
            }
            f7 = 0.0f;
            if (!z10) {
            }
            this.h = f7;
            g0.f.v(this.e, f7);
        }
    }
}
