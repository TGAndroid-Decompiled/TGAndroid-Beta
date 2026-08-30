package i5;

import android.view.Surface;
import h5.d0;
public final class s {
    public final e f7316a;
    public final p f7317b;
    public final r f7318c;
    public boolean d;
    public Surface e;
    public float f7319f;
    public float f7320g;
    public float h;
    public float f7321i;
    public int f7322j;
    public long f7323k;
    public long f7324l;
    public long f7325m;
    public long f7326n;
    public long f7327o;
    public long f7328p;
    public long f7329q;

    public s(android.content.Context r6) {
        throw new UnsupportedOperationException("Method not decompiled: i5.s.<init>(android.content.Context):void");
    }

    public final void a() {
        Surface surface;
        if (d0.f6937a >= 30 && (surface = this.e) != null && this.f7322j != Integer.MIN_VALUE && this.h != 0.0f) {
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
        if (d0.f6937a >= 30 && (surface = this.e) != null && this.f7322j != Integer.MIN_VALUE) {
            if (this.d) {
                float f11 = this.f7320g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f7321i;
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
