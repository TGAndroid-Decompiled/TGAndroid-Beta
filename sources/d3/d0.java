package d3;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
public final class d0 {
    public final g f7966a;
    public final Context f7967b;
    public a0 f7968c;
    public boolean d;
    public Surface f7969e;
    public float f7970f;
    public float f7971g;
    public float h;
    public float f7972i;
    public int f7973j;
    public long f7974k;
    public long f7975l;
    public long f7976m;
    public long f7977n;
    public long f7978o;
    public long f7979p;
    public long f7980q;
    public long f7981r;
    public long f7982s;

    public d0(Context context) {
        this.f7967b = context;
        ?? obj = new Object();
        obj.f8010a = new f();
        obj.f8011b = new f();
        obj.d = -9223372036854775807L;
        this.f7966a = obj;
        this.f7970f = -1.0f;
        this.f7972i = 1.0f;
        this.f7973j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7969e) != null && this.f7973j != Integer.MIN_VALUE && this.h != 0.0f && surface.isValid()) {
            this.h = 0.0f;
            g0.f.v(this.f7969e, 0.0f);
        }
    }

    public final void b() {
        this.f7976m = 0L;
        this.f7980q = -1L;
        this.f7977n = -1L;
        this.f7974k = 0L;
        this.f7975l = 0L;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: d3.d0.c():void");
    }

    public final void d(boolean z9) {
        Surface surface;
        float f10;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7969e) != null && this.f7973j != Integer.MIN_VALUE && surface.isValid()) {
            if (this.d) {
                float f11 = this.f7971g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f7972i;
                    if (!z9 || this.h != f10) {
                        this.h = f10;
                        g0.f.v(this.f7969e, f10);
                    }
                    return;
                }
            }
            f10 = 0.0f;
            if (!z9) {
            }
            this.h = f10;
            g0.f.v(this.f7969e, f10);
        }
    }
}
