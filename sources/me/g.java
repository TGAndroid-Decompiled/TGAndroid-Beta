package me;

import android.graphics.RectF;
import w7.o;
public final class g implements Comparable {
    public final Object f16376a;
    public int f16377b;
    public final m f16378c;
    public final m d;
    public final n f16379e;
    public final m f16380f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f16376a = obj;
        this.f16377b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f16378c = new m(i10);
        this.f16379e = new n();
        this.f16380f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f16378c.c(z10);
        this.d.c(z10);
        this.f16379e.c(z10);
        this.f16380f.c(z10);
        Object obj = this.f16376a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.f16379e;
        RectF rectF = nVar.f16399e;
        rectF.set(nVar.f16396a.f16393a, nVar.f16397b.f16393a, nVar.f16398c.f16393a, nVar.d.f16393a);
        return rectF;
    }

    public final float c() {
        return o.a(this.d.f16393a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f16377b, ((g) obj).f16377b);
    }
}
