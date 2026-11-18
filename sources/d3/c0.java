package d3;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
public final class c0 {
    public final g f7637a;
    public final Context f7638b;
    public z f7639c;
    public boolean d;
    public Surface f7640e;
    public float f7641f;
    public float f7642g;
    public float h;
    public float f7643i;
    public int f7644j;
    public long f7645k;
    public long f7646l;
    public long f7647m;
    public long f7648n;
    public long f7649o;
    public long f7650p;
    public long f7651q;
    public long f7652r;
    public long f7653s;

    public c0(Context context) {
        this.f7638b = context;
        ?? obj = new Object();
        obj.f7687a = new f();
        obj.f7688b = new f();
        obj.d = -9223372036854775807L;
        this.f7637a = obj;
        this.f7641f = -1.0f;
        this.f7643i = 1.0f;
        this.f7644j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7640e) != null && this.f7644j != Integer.MIN_VALUE && this.h != 0.0f && surface.isValid()) {
            this.h = 0.0f;
            g0.f.v(this.f7640e, 0.0f);
        }
    }

    public final void b() {
        this.f7647m = 0L;
        this.f7651q = -1L;
        this.f7648n = -1L;
        this.f7645k = 0L;
        this.f7646l = 0L;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: d3.c0.c():void");
    }

    public final void d(boolean z10) {
        Surface surface;
        float f10;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7640e) != null && this.f7644j != Integer.MIN_VALUE && surface.isValid()) {
            if (this.d) {
                float f11 = this.f7642g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f7643i;
                    if (!z10 || this.h != f10) {
                        this.h = f10;
                        g0.f.v(this.f7640e, f10);
                    }
                    return;
                }
            }
            f10 = 0.0f;
            if (!z10) {
            }
            this.h = f10;
            g0.f.v(this.f7640e, f10);
        }
    }
}
