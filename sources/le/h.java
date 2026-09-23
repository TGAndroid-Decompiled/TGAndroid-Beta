package le;

import android.graphics.RectF;
import w7.p;
public final class h implements Comparable {
    public final Object f13972a;
    public int f13973b;
    public final n f13974c;
    public final n d;
    public final o e;
    public final n f13975f;
    public boolean h = false;

    public h(int i10, Object obj, boolean z10) {
        float f7;
        this.f13972a = obj;
        this.f13973b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new n(f7);
        this.f13974c = new n(i10);
        this.e = new o();
        this.f13975f = new n(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f13974c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f13975f.c(z10);
        Object obj = this.f13972a;
        if (obj instanceof o) {
            ((o) obj).c(z10);
        }
    }

    public final RectF b() {
        o oVar = this.e;
        RectF rectF = oVar.e;
        rectF.set(oVar.f13989a.f13986a, oVar.f13990b.f13986a, oVar.f13991c.f13986a, oVar.d.f13986a);
        return rectF;
    }

    public final float c() {
        return p.a(this.d.f13986a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f13973b, ((h) obj).f13973b);
    }
}
