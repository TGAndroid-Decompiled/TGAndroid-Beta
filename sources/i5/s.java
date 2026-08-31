package i5;

import android.view.Surface;
import h5.d0;
public final class s {
    public final e f7870a;
    public final p f7871b;
    public final r f7872c;
    public boolean d;
    public Surface f7873e;
    public float f7874f;
    public float f7875g;
    public float h;
    public float f7876i;
    public int f7877j;
    public long f7878k;
    public long f7879l;
    public long f7880m;
    public long f7881n;
    public long f7882o;
    public long f7883p;
    public long f7884q;

    public s(android.content.Context r6) {
        throw new UnsupportedOperationException("Method not decompiled: i5.s.<init>(android.content.Context):void");
    }

    public final void a() {
        Surface surface;
        if (d0.f7237a >= 30 && (surface = this.f7873e) != null && this.f7877j != Integer.MIN_VALUE && this.h != 0.0f) {
            this.h = 0.0f;
            o.a(surface, 0.0f);
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: i5.s.b():void");
    }

    public final void c(boolean z4) {
        Surface surface;
        float f10;
        if (d0.f7237a >= 30 && (surface = this.f7873e) != null && this.f7877j != Integer.MIN_VALUE) {
            if (this.d) {
                float f11 = this.f7875g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f7876i;
                    if (!z4 || this.h != f10) {
                        this.h = f10;
                        o.a(surface, f10);
                    }
                    return;
                }
            }
            f10 = 0.0f;
            if (!z4) {
            }
            this.h = f10;
            o.a(surface, f10);
        }
    }
}
