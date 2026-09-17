package le;

import android.graphics.RectF;
import w7.p;
public final class g implements Comparable {
    public final Object f15406a;
    public int f15407b;
    public final m f15408c;
    public final m d;
    public final n f15409e;
    public final m f15410f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f15406a = obj;
        this.f15407b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f15408c = new m(i10);
        this.f15409e = new n();
        this.f15410f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f15408c.c(z10);
        this.d.c(z10);
        this.f15409e.c(z10);
        this.f15410f.c(z10);
        Object obj = this.f15406a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.f15409e;
        RectF rectF = nVar.f15429e;
        rectF.set(nVar.f15426a.f15423a, nVar.f15427b.f15423a, nVar.f15428c.f15423a, nVar.d.f15423a);
        return rectF;
    }

    public final float c() {
        return p.a(this.d.f15423a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f15407b, ((g) obj).f15407b);
    }
}
