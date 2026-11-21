package d3;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
public final class c0 {
    public final g f7663a;
    public final Context f7664b;
    public z f7665c;
    public boolean d;
    public Surface f7666e;
    public float f7667f;
    public float f7668g;
    public float h;
    public float f7669i;
    public int f7670j;
    public long f7671k;
    public long f7672l;
    public long f7673m;
    public long f7674n;
    public long f7675o;
    public long f7676p;
    public long f7677q;
    public long f7678r;
    public long f7679s;

    public c0(Context context) {
        this.f7664b = context;
        ?? obj = new Object();
        obj.f7713a = new f();
        obj.f7714b = new f();
        obj.d = -9223372036854775807L;
        this.f7663a = obj;
        this.f7667f = -1.0f;
        this.f7669i = 1.0f;
        this.f7670j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7666e) != null && this.f7670j != Integer.MIN_VALUE && this.h != 0.0f && surface.isValid()) {
            this.h = 0.0f;
            g0.f.v(this.f7666e, 0.0f);
        }
    }

    public final void b() {
        this.f7673m = 0L;
        this.f7677q = -1L;
        this.f7674n = -1L;
        this.f7671k = 0L;
        this.f7672l = 0L;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: d3.c0.c():void");
    }

    public final void d(boolean z10) {
        Surface surface;
        float f10;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7666e) != null && this.f7670j != Integer.MIN_VALUE && surface.isValid()) {
            if (this.d) {
                float f11 = this.f7668g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f7669i;
                    if (!z10 || this.h != f10) {
                        this.h = f10;
                        g0.f.v(this.f7666e, f10);
                    }
                    return;
                }
            }
            f10 = 0.0f;
            if (!z10) {
            }
            this.h = f10;
            g0.f.v(this.f7666e, f10);
        }
    }
}
