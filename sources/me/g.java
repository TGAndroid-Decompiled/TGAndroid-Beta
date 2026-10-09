package me;

import android.graphics.RectF;
import w7.o;
public final class g implements Comparable {
    public final Object f16348a;
    public int f16349b;
    public final m f16350c;
    public final m d;
    public final n f16351e;
    public final m f16352f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f16348a = obj;
        this.f16349b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f16350c = new m(i10);
        this.f16351e = new n();
        this.f16352f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f16350c.c(z10);
        this.d.c(z10);
        this.f16351e.c(z10);
        this.f16352f.c(z10);
        Object obj = this.f16348a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.f16351e;
        RectF rectF = nVar.f16371e;
        rectF.set(nVar.f16368a.f16365a, nVar.f16369b.f16365a, nVar.f16370c.f16365a, nVar.d.f16365a);
        return rectF;
    }

    public final float c() {
        return o.a(this.d.f16365a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f16349b, ((g) obj).f16349b);
    }
}
