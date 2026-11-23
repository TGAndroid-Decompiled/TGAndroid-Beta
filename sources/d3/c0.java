package d3;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
public final class c0 {
    public final g f7666a;
    public final Context f7667b;
    public z f7668c;
    public boolean d;
    public Surface f7669e;
    public float f7670f;
    public float f7671g;
    public float h;
    public float f7672i;
    public int f7673j;
    public long f7674k;
    public long f7675l;
    public long f7676m;
    public long f7677n;
    public long f7678o;
    public long f7679p;
    public long f7680q;
    public long f7681r;
    public long f7682s;

    public c0(Context context) {
        this.f7667b = context;
        ?? obj = new Object();
        obj.f7716a = new f();
        obj.f7717b = new f();
        obj.d = -9223372036854775807L;
        this.f7666a = obj;
        this.f7670f = -1.0f;
        this.f7672i = 1.0f;
        this.f7673j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7669e) != null && this.f7673j != Integer.MIN_VALUE && this.h != 0.0f && surface.isValid()) {
            this.h = 0.0f;
            g0.f.v(this.f7669e, 0.0f);
        }
    }

    public final void b() {
        this.f7676m = 0L;
        this.f7680q = -1L;
        this.f7677n = -1L;
        this.f7674k = 0L;
        this.f7675l = 0L;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: d3.c0.c():void");
    }

    public final void d(boolean z10) {
        Surface surface;
        float f10;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7669e) != null && this.f7673j != Integer.MIN_VALUE && surface.isValid()) {
            if (this.d) {
                float f11 = this.f7671g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f7672i;
                    if (!z10 || this.h != f10) {
                        this.h = f10;
                        g0.f.v(this.f7669e, f10);
                    }
                    return;
                }
            }
            f10 = 0.0f;
            if (!z10) {
            }
            this.h = f10;
            g0.f.v(this.f7669e, f10);
        }
    }
}
