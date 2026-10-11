package me;

import android.graphics.RectF;
import w7.o;
public final class g implements Comparable {
    public final Object f16412a;
    public int f16413b;
    public final m f16414c;
    public final m d;
    public final n f16415e;
    public final m f16416f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f16412a = obj;
        this.f16413b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f16414c = new m(i10);
        this.f16415e = new n();
        this.f16416f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f16414c.c(z10);
        this.d.c(z10);
        this.f16415e.c(z10);
        this.f16416f.c(z10);
        Object obj = this.f16412a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.f16415e;
        RectF rectF = nVar.f16435e;
        rectF.set(nVar.f16432a.f16429a, nVar.f16433b.f16429a, nVar.f16434c.f16429a, nVar.d.f16429a);
        return rectF;
    }

    public final float c() {
        return o.a(this.d.f16429a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f16413b, ((g) obj).f16413b);
    }
}
