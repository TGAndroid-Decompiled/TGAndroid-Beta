package d3;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
public final class c0 {
    public final g f7351a;
    public final Context f7352b;
    public z f7353c;
    public boolean d;
    public Surface f7354e;
    public float f7355f;
    public float f7356g;
    public float h;
    public float f7357i;
    public int f7358j;
    public long f7359k;
    public long f7360l;
    public long f7361m;
    public long f7362n;
    public long f7363o;
    public long f7364p;
    public long f7365q;
    public long f7366r;
    public long f7367s;

    public c0(Context context) {
        this.f7352b = context;
        ?? obj = new Object();
        obj.f7401a = new f();
        obj.f7402b = new f();
        obj.d = -9223372036854775807L;
        this.f7351a = obj;
        this.f7355f = -1.0f;
        this.f7357i = 1.0f;
        this.f7358j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7354e) != null && this.f7358j != Integer.MIN_VALUE && this.h != 0.0f && surface.isValid()) {
            this.h = 0.0f;
            g0.f.v(this.f7354e, 0.0f);
        }
    }

    public final void b() {
        this.f7361m = 0L;
        this.f7365q = -1L;
        this.f7362n = -1L;
        this.f7359k = 0L;
        this.f7360l = 0L;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: d3.c0.c():void");
    }

    public final void d(boolean z10) {
        Surface surface;
        float f10;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7354e) != null && this.f7358j != Integer.MIN_VALUE && surface.isValid()) {
            if (this.d) {
                float f11 = this.f7356g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f7357i;
                    if (!z10 || this.h != f10) {
                        this.h = f10;
                        g0.f.v(this.f7354e, f10);
                    }
                    return;
                }
            }
            f10 = 0.0f;
            if (!z10) {
            }
            this.h = f10;
            g0.f.v(this.f7354e, f10);
        }
    }
}
