package g5;

import android.view.Surface;
import f5.d0;
public final class s {
    public final e f7077a;
    public final p f7078b;
    public final r f7079c;
    public boolean d;
    public Surface f7080e;
    public float f7081f;
    public float f7082g;
    public float h;
    public float f7083i;
    public int f7084j;
    public long f7085k;
    public long f7086l;
    public long f7087m;
    public long f7088n;
    public long f7089o;
    public long f7090p;
    public long f7091q;

    public s(android.content.Context r6) {
        throw new UnsupportedOperationException("Method not decompiled: g5.s.<init>(android.content.Context):void");
    }

    public final void a() {
        Surface surface;
        if (d0.f6579a >= 30 && (surface = this.f7080e) != null && this.f7084j != Integer.MIN_VALUE && this.h != 0.0f) {
            this.h = 0.0f;
            o.a(surface, 0.0f);
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: g5.s.b():void");
    }

    public final void c(boolean z10) {
        Surface surface;
        float f9;
        if (d0.f6579a >= 30 && (surface = this.f7080e) != null && this.f7084j != Integer.MIN_VALUE) {
            if (this.d) {
                float f10 = this.f7082g;
                if (f10 != -1.0f) {
                    f9 = f10 * this.f7083i;
                    if (!z10 || this.h != f9) {
                        this.h = f9;
                        o.a(surface, f9);
                    }
                    return;
                }
            }
            f9 = 0.0f;
            if (!z10) {
            }
            this.h = f9;
            o.a(surface, f9);
        }
    }
}
