package i5;

import android.view.Surface;
import h5.d0;
public final class s {
    public final e f7298a;
    public final p f7299b;
    public final r f7300c;
    public boolean d;
    public Surface e;
    public float f7301f;
    public float f7302g;
    public float h;
    public float f7303i;
    public int f7304j;
    public long f7305k;
    public long f7306l;
    public long f7307m;
    public long f7308n;
    public long f7309o;
    public long f7310p;
    public long f7311q;

    public s(android.content.Context r6) {
        throw new UnsupportedOperationException("Method not decompiled: i5.s.<init>(android.content.Context):void");
    }

    public final void a() {
        Surface surface;
        if (d0.f6924a >= 30 && (surface = this.e) != null && this.f7304j != Integer.MIN_VALUE && this.h != 0.0f) {
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
        if (d0.f6924a >= 30 && (surface = this.e) != null && this.f7304j != Integer.MIN_VALUE) {
            if (this.d) {
                float f11 = this.f7302g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f7303i;
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
