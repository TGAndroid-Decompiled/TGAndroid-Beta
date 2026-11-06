package d3;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
public final class d0 {
    public final g f7968a;
    public final Context f7969b;
    public a0 f7970c;
    public boolean d;
    public Surface f7971e;
    public float f7972f;
    public float f7973g;
    public float h;
    public float f7974i;
    public int f7975j;
    public long f7976k;
    public long f7977l;
    public long f7978m;
    public long f7979n;
    public long f7980o;
    public long f7981p;
    public long f7982q;
    public long f7983r;
    public long f7984s;

    public d0(Context context) {
        this.f7969b = context;
        ?? obj = new Object();
        obj.f8012a = new f();
        obj.f8013b = new f();
        obj.d = -9223372036854775807L;
        this.f7968a = obj;
        this.f7972f = -1.0f;
        this.f7974i = 1.0f;
        this.f7975j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7971e) != null && this.f7975j != Integer.MIN_VALUE && this.h != 0.0f && surface.isValid()) {
            this.h = 0.0f;
            g0.f.v(this.f7971e, 0.0f);
        }
    }

    public final void b() {
        this.f7978m = 0L;
        this.f7982q = -1L;
        this.f7979n = -1L;
        this.f7976k = 0L;
        this.f7977l = 0L;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: d3.d0.c():void");
    }

    public final void d(boolean z9) {
        Surface surface;
        float f10;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f7971e) != null && this.f7975j != Integer.MIN_VALUE && surface.isValid()) {
            if (this.d) {
                float f11 = this.f7973g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f7974i;
                    if (!z9 || this.h != f10) {
                        this.h = f10;
                        g0.f.v(this.f7971e, f10);
                    }
                    return;
                }
            }
            f10 = 0.0f;
            if (!z9) {
            }
            this.h = f10;
            g0.f.v(this.f7971e, f10);
        }
    }
}
