package ne;

import android.graphics.RectF;
import w7.r;
public final class g implements Comparable {
    public final Object f17389a;
    public int f17390b;
    public final m f17391c;
    public final m d;
    public final n e;
    public final m f17392f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f17389a = obj;
        this.f17390b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f17391c = new m(i10);
        this.e = new n();
        this.f17392f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f17391c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f17392f.c(z10);
        Object obj = this.f17389a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.e;
        RectF rectF = nVar.e;
        rectF.set(nVar.f17406a.f17403a, nVar.f17407b.f17403a, nVar.f17408c.f17403a, nVar.d.f17403a);
        return rectF;
    }

    public final float c() {
        return r.a(this.d.f17403a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f17390b, ((g) obj).f17390b);
    }
}
