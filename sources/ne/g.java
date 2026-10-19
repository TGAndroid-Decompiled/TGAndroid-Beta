package ne;

import android.graphics.RectF;
import w7.r;
public final class g implements Comparable {
    public final Object f17395a;
    public int f17396b;
    public final m f17397c;
    public final m d;
    public final n e;
    public final m f17398f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f17395a = obj;
        this.f17396b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f17397c = new m(i10);
        this.e = new n();
        this.f17398f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f17397c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f17398f.c(z10);
        Object obj = this.f17395a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.e;
        RectF rectF = nVar.e;
        rectF.set(nVar.f17412a.f17409a, nVar.f17413b.f17409a, nVar.f17414c.f17409a, nVar.d.f17409a);
        return rectF;
    }

    public final float c() {
        return r.a(this.d.f17409a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f17396b, ((g) obj).f17396b);
    }
}
