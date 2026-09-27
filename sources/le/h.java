package le;

import android.graphics.RectF;
import w7.q;
public final class h implements Comparable {
    public final Object f14212a;
    public int f14213b;
    public final n f14214c;
    public final n d;
    public final o e;
    public final n f14215f;
    public boolean h = false;

    public h(int i10, Object obj, boolean z10) {
        float f7;
        this.f14212a = obj;
        this.f14213b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new n(f7);
        this.f14214c = new n(i10);
        this.e = new o();
        this.f14215f = new n(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f14214c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f14215f.c(z10);
        Object obj = this.f14212a;
        if (obj instanceof o) {
            ((o) obj).c(z10);
        }
    }

    public final RectF b() {
        o oVar = this.e;
        RectF rectF = oVar.e;
        rectF.set(oVar.f14229a.f14226a, oVar.f14230b.f14226a, oVar.f14231c.f14226a, oVar.d.f14226a);
        return rectF;
    }

    public final float c() {
        return q.a(this.d.f14226a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f14213b, ((h) obj).f14213b);
    }
}
