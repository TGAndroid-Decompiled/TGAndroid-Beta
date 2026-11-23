package d3;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
public final class c0 {
    public final g f7629a;
    public final Context f7630b;
    public z f7631c;
    public boolean d;
    public Surface f7632e;
    public float f7633f;
    public float f7634g;
    public float h;
    public float f7635i;
    public int f7636j;
    public long f7637k;
    public long f7638l;
    public long f7639m;
    public long f7640n;
    public long f7641o;
    public long f7642p;
    public long f7643q;
    public long f7644r;
    public long f7645s;

    public c0(Context context) {
        this.f7630b = context;
        ?? obj = new Object();
        obj.f7679a = new f();
        obj.f7680b = new f();
        obj.d = -9223372036854775807L;
        this.f7629a = obj;
        this.f7633f = -1.0f;
        this.f7635i = 1.0f;
        this.f7636j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7632e) != null && this.f7636j != Integer.MIN_VALUE && this.h != 0.0f && surface.isValid()) {
            this.h = 0.0f;
            g0.g.v(this.f7632e, 0.0f);
        }
    }

    public final void b() {
        this.f7639m = 0L;
        this.f7643q = -1L;
        this.f7640n = -1L;
        this.f7637k = 0L;
        this.f7638l = 0L;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: d3.c0.c():void");
    }

    public final void d(boolean z10) {
        Surface surface;
        float f10;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7632e) != null && this.f7636j != Integer.MIN_VALUE && surface.isValid()) {
            if (this.d) {
                float f11 = this.f7634g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f7635i;
                    if (!z10 || this.h != f10) {
                        this.h = f10;
                        g0.g.v(this.f7632e, f10);
                    }
                    return;
                }
            }
            f10 = 0.0f;
            if (!z10) {
            }
            this.h = f10;
            g0.g.v(this.f7632e, f10);
        }
    }
}
