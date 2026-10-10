package me;

import android.graphics.RectF;
import w7.o;
public final class g implements Comparable {
    public final Object f16352a;
    public int f16353b;
    public final m f16354c;
    public final m d;
    public final n f16355e;
    public final m f16356f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f16352a = obj;
        this.f16353b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f16354c = new m(i10);
        this.f16355e = new n();
        this.f16356f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f16354c.c(z10);
        this.d.c(z10);
        this.f16355e.c(z10);
        this.f16356f.c(z10);
        Object obj = this.f16352a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.f16355e;
        RectF rectF = nVar.f16375e;
        rectF.set(nVar.f16372a.f16369a, nVar.f16373b.f16369a, nVar.f16374c.f16369a, nVar.d.f16369a);
        return rectF;
    }

    public final float c() {
        return o.a(this.d.f16369a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f16353b, ((g) obj).f16353b);
    }
}
