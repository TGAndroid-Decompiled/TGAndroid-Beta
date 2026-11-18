package d3;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
public final class c0 {
    public final g f7634a;
    public final Context f7635b;
    public z f7636c;
    public boolean d;
    public Surface f7637e;
    public float f7638f;
    public float f7639g;
    public float h;
    public float f7640i;
    public int f7641j;
    public long f7642k;
    public long f7643l;
    public long f7644m;
    public long f7645n;
    public long f7646o;
    public long f7647p;
    public long f7648q;
    public long f7649r;
    public long f7650s;

    public c0(Context context) {
        this.f7635b = context;
        ?? obj = new Object();
        obj.f7684a = new f();
        obj.f7685b = new f();
        obj.d = -9223372036854775807L;
        this.f7634a = obj;
        this.f7638f = -1.0f;
        this.f7640i = 1.0f;
        this.f7641j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7637e) != null && this.f7641j != Integer.MIN_VALUE && this.h != 0.0f && surface.isValid()) {
            this.h = 0.0f;
            g0.f.v(this.f7637e, 0.0f);
        }
    }

    public final void b() {
        this.f7644m = 0L;
        this.f7648q = -1L;
        this.f7645n = -1L;
        this.f7642k = 0L;
        this.f7643l = 0L;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: d3.c0.c():void");
    }

    public final void d(boolean z10) {
        Surface surface;
        float f10;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7637e) != null && this.f7641j != Integer.MIN_VALUE && surface.isValid()) {
            if (this.d) {
                float f11 = this.f7639g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f7640i;
                    if (!z10 || this.h != f10) {
                        this.h = f10;
                        g0.f.v(this.f7637e, f10);
                    }
                    return;
                }
            }
            f10 = 0.0f;
            if (!z10) {
            }
            this.h = f10;
            g0.f.v(this.f7637e, f10);
        }
    }
}
