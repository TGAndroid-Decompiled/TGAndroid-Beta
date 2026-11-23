package d3;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
public final class c0 {
    public final g f7628a;
    public final Context f7629b;
    public z f7630c;
    public boolean d;
    public Surface f7631e;
    public float f7632f;
    public float f7633g;
    public float h;
    public float f7634i;
    public int f7635j;
    public long f7636k;
    public long f7637l;
    public long f7638m;
    public long f7639n;
    public long f7640o;
    public long f7641p;
    public long f7642q;
    public long f7643r;
    public long f7644s;

    public c0(Context context) {
        this.f7629b = context;
        ?? obj = new Object();
        obj.f7678a = new f();
        obj.f7679b = new f();
        obj.d = -9223372036854775807L;
        this.f7628a = obj;
        this.f7632f = -1.0f;
        this.f7634i = 1.0f;
        this.f7635j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7631e) != null && this.f7635j != Integer.MIN_VALUE && this.h != 0.0f && surface.isValid()) {
            this.h = 0.0f;
            g0.g.v(this.f7631e, 0.0f);
        }
    }

    public final void b() {
        this.f7638m = 0L;
        this.f7642q = -1L;
        this.f7639n = -1L;
        this.f7636k = 0L;
        this.f7637l = 0L;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: d3.c0.c():void");
    }

    public final void d(boolean z10) {
        Surface surface;
        float f10;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7631e) != null && this.f7635j != Integer.MIN_VALUE && surface.isValid()) {
            if (this.d) {
                float f11 = this.f7633g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f7634i;
                    if (!z10 || this.h != f10) {
                        this.h = f10;
                        g0.g.v(this.f7631e, f10);
                    }
                    return;
                }
            }
            f10 = 0.0f;
            if (!z10) {
            }
            this.h = f10;
            g0.g.v(this.f7631e, f10);
        }
    }
}
