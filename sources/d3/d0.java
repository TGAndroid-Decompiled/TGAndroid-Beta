package d3;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
public final class d0 {
    public final g f7971a;
    public final Context f7972b;
    public a0 f7973c;
    public boolean d;
    public Surface f7974e;
    public float f7975f;
    public float f7976g;
    public float h;
    public float f7977i;
    public int f7978j;
    public long f7979k;
    public long f7980l;
    public long f7981m;
    public long f7982n;
    public long f7983o;
    public long f7984p;
    public long f7985q;
    public long f7986r;
    public long f7987s;

    public d0(Context context) {
        this.f7972b = context;
        ?? obj = new Object();
        obj.f8015a = new f();
        obj.f8016b = new f();
        obj.d = -9223372036854775807L;
        this.f7971a = obj;
        this.f7975f = -1.0f;
        this.f7977i = 1.0f;
        this.f7978j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7974e) != null && this.f7978j != Integer.MIN_VALUE && this.h != 0.0f && surface.isValid()) {
            this.h = 0.0f;
            g0.f.v(this.f7974e, 0.0f);
        }
    }

    public final void b() {
        this.f7981m = 0L;
        this.f7985q = -1L;
        this.f7982n = -1L;
        this.f7979k = 0L;
        this.f7980l = 0L;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: d3.d0.c():void");
    }

    public final void d(boolean z9) {
        Surface surface;
        float f10;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7974e) != null && this.f7978j != Integer.MIN_VALUE && surface.isValid()) {
            if (this.d) {
                float f11 = this.f7976g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f7977i;
                    if (!z9 || this.h != f10) {
                        this.h = f10;
                        g0.f.v(this.f7974e, f10);
                    }
                    return;
                }
            }
            f10 = 0.0f;
            if (!z9) {
            }
            this.h = f10;
            g0.f.v(this.f7974e, f10);
        }
    }
}
