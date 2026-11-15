package d3;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
public final class c0 {
    public final g f7354a;
    public final Context f7355b;
    public z f7356c;
    public boolean d;
    public Surface f7357e;
    public float f7358f;
    public float f7359g;
    public float h;
    public float f7360i;
    public int f7361j;
    public long f7362k;
    public long f7363l;
    public long f7364m;
    public long f7365n;
    public long f7366o;
    public long f7367p;
    public long f7368q;
    public long f7369r;
    public long f7370s;

    public c0(Context context) {
        this.f7355b = context;
        ?? obj = new Object();
        obj.f7404a = new f();
        obj.f7405b = new f();
        obj.d = -9223372036854775807L;
        this.f7354a = obj;
        this.f7358f = -1.0f;
        this.f7360i = 1.0f;
        this.f7361j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7357e) != null && this.f7361j != Integer.MIN_VALUE && this.h != 0.0f && surface.isValid()) {
            this.h = 0.0f;
            g0.f.v(this.f7357e, 0.0f);
        }
    }

    public final void b() {
        this.f7364m = 0L;
        this.f7368q = -1L;
        this.f7365n = -1L;
        this.f7362k = 0L;
        this.f7363l = 0L;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: d3.c0.c():void");
    }

    public final void d(boolean z10) {
        Surface surface;
        float f10;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7357e) != null && this.f7361j != Integer.MIN_VALUE && surface.isValid()) {
            if (this.d) {
                float f11 = this.f7359g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f7360i;
                    if (!z10 || this.h != f10) {
                        this.h = f10;
                        g0.f.v(this.f7357e, f10);
                    }
                    return;
                }
            }
            f10 = 0.0f;
            if (!z10) {
            }
            this.h = f10;
            g0.f.v(this.f7357e, f10);
        }
    }
}
