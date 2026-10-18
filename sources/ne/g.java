package ne;

import android.graphics.RectF;
import w7.r;
public final class g implements Comparable {
    public final Object f17392a;
    public int f17393b;
    public final m f17394c;
    public final m d;
    public final n e;
    public final m f17395f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f17392a = obj;
        this.f17393b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f17394c = new m(i10);
        this.e = new n();
        this.f17395f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f17394c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f17395f.c(z10);
        Object obj = this.f17392a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.e;
        RectF rectF = nVar.e;
        rectF.set(nVar.f17409a.f17406a, nVar.f17410b.f17406a, nVar.f17411c.f17406a, nVar.d.f17406a);
        return rectF;
    }

    public final float c() {
        return r.a(this.d.f17406a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f17393b, ((g) obj).f17393b);
    }
}
