package ne;

import android.graphics.RectF;
import w7.r;
public final class g implements Comparable {
    public final Object f16013a;
    public int f16014b;
    public final m f16015c;
    public final m d;
    public final n e;
    public final m f16016f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f16013a = obj;
        this.f16014b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f16015c = new m(i10);
        this.e = new n();
        this.f16016f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f16015c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f16016f.c(z10);
        Object obj = this.f16013a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.e;
        RectF rectF = nVar.e;
        rectF.set(nVar.f16030a.f16027a, nVar.f16031b.f16027a, nVar.f16032c.f16027a, nVar.d.f16027a);
        return rectF;
    }

    public final float c() {
        return r.a(this.d.f16027a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f16014b, ((g) obj).f16014b);
    }
}
