package le;

import android.graphics.RectF;
import w7.q;
public final class h implements Comparable {
    public final Object f14210a;
    public int f14211b;
    public final n f14212c;
    public final n d;
    public final o e;
    public final n f14213f;
    public boolean h = false;

    public h(int i10, Object obj, boolean z10) {
        float f7;
        this.f14210a = obj;
        this.f14211b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new n(f7);
        this.f14212c = new n(i10);
        this.e = new o();
        this.f14213f = new n(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f14212c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f14213f.c(z10);
        Object obj = this.f14210a;
        if (obj instanceof o) {
            ((o) obj).c(z10);
        }
    }

    public final RectF b() {
        o oVar = this.e;
        RectF rectF = oVar.e;
        rectF.set(oVar.f14227a.f14224a, oVar.f14228b.f14224a, oVar.f14229c.f14224a, oVar.d.f14224a);
        return rectF;
    }

    public final float c() {
        return q.a(this.d.f14224a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f14211b, ((h) obj).f14211b);
    }
}
