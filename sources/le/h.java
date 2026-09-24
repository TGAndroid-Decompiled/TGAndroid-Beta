package le;

import android.graphics.RectF;
import w7.q;
public final class h implements Comparable {
    public final Object f14195a;
    public int f14196b;
    public final n f14197c;
    public final n d;
    public final o e;
    public final n f14198f;
    public boolean h = false;

    public h(int i10, Object obj, boolean z10) {
        float f7;
        this.f14195a = obj;
        this.f14196b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new n(f7);
        this.f14197c = new n(i10);
        this.e = new o();
        this.f14198f = new n(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f14197c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f14198f.c(z10);
        Object obj = this.f14195a;
        if (obj instanceof o) {
            ((o) obj).c(z10);
        }
    }

    public final RectF b() {
        o oVar = this.e;
        RectF rectF = oVar.e;
        rectF.set(oVar.f14212a.f14209a, oVar.f14213b.f14209a, oVar.f14214c.f14209a, oVar.d.f14209a);
        return rectF;
    }

    public final float c() {
        return q.a(this.d.f14209a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f14196b, ((h) obj).f14196b);
    }
}
