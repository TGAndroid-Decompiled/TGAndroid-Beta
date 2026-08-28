package e5;

import android.view.Surface;
import d5.f0;
public final class s {
    public final e f4922a;
    public final p f4923b;
    public final r f4924c;
    public boolean d;
    public Surface f4925e;
    public float f4926f;
    public float f4927g;
    public float h;
    public float f4928i;
    public int f4929j;
    public long f4930k;
    public long f4931l;
    public long f4932m;
    public long f4933n;
    public long f4934o;
    public long f4935p;
    public long f4936q;

    public s(android.content.Context r6) {
        throw new UnsupportedOperationException("Method not decompiled: e5.s.<init>(android.content.Context):void");
    }

    public final void a() {
        Surface surface;
        if (f0.f4349a >= 30 && (surface = this.f4925e) != null && this.f4929j != Integer.MIN_VALUE && this.h != 0.0f) {
            this.h = 0.0f;
            o.a(surface, 0.0f);
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: e5.s.b():void");
    }

    public final void c(boolean z10) {
        Surface surface;
        float f10;
        if (f0.f4349a >= 30 && (surface = this.f4925e) != null && this.f4929j != Integer.MIN_VALUE) {
            if (this.d) {
                float f11 = this.f4927g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f4928i;
                    if (!z10 || this.h != f10) {
                        this.h = f10;
                        o.a(surface, f10);
                    }
                    return;
                }
            }
            f10 = 0.0f;
            if (!z10) {
            }
            this.h = f10;
            o.a(surface, f10);
        }
    }
}
