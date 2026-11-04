package c3;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
public final class d0 {
    public final g f3990a;
    public final Context f3991b;
    public a0 f3992c;
    public boolean d;
    public Surface f3993e;
    public float f3994f;
    public float f3995g;
    public float h;
    public float f3996i;
    public int f3997j;
    public long f3998k;
    public long f3999l;
    public long f4000m;
    public long f4001n;
    public long f4002o;
    public long f4003p;
    public long f4004q;
    public long f4005r;
    public long f4006s;

    public d0(Context context) {
        this.f3991b = context;
        ?? obj = new Object();
        obj.f4035a = new f();
        obj.f4036b = new f();
        obj.d = -9223372036854775807L;
        this.f3990a = obj;
        this.f3994f = -1.0f;
        this.f3996i = 1.0f;
        this.f3997j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f3993e) != null && this.f3997j != Integer.MIN_VALUE && this.h != 0.0f && surface.isValid()) {
            this.h = 0.0f;
            g0.f.v(this.f3993e, 0.0f);
        }
    }

    public final void b() {
        this.f4000m = 0L;
        this.f4004q = -1L;
        this.f4001n = -1L;
        this.f3998k = 0L;
        this.f3999l = 0L;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: c3.d0.c():void");
    }

    public final void d(boolean z10) {
        Surface surface;
        float f10;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f3993e) != null && this.f3997j != Integer.MIN_VALUE && surface.isValid()) {
            if (this.d) {
                float f11 = this.f3995g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f3996i;
                    if (!z10 || this.h != f10) {
                        this.h = f10;
                        g0.f.v(this.f3993e, f10);
                    }
                    return;
                }
            }
            f10 = 0.0f;
            if (!z10) {
            }
            this.h = f10;
            g0.f.v(this.f3993e, f10);
        }
    }
}
