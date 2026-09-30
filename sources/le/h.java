package le;

import android.graphics.RectF;
import w7.q;
public final class h implements Comparable {
    public final Object f14211a;
    public int f14212b;
    public final n f14213c;
    public final n d;
    public final o e;
    public final n f14214f;
    public boolean h = false;

    public h(int i10, Object obj, boolean z10) {
        float f7;
        this.f14211a = obj;
        this.f14212b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new n(f7);
        this.f14213c = new n(i10);
        this.e = new o();
        this.f14214f = new n(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f14213c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f14214f.c(z10);
        Object obj = this.f14211a;
        if (obj instanceof o) {
            ((o) obj).c(z10);
        }
    }

    public final RectF b() {
        o oVar = this.e;
        RectF rectF = oVar.e;
        rectF.set(oVar.f14228a.f14225a, oVar.f14229b.f14225a, oVar.f14230c.f14225a, oVar.d.f14225a);
        return rectF;
    }

    public final float c() {
        return q.a(this.d.f14225a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f14212b, ((h) obj).f14212b);
    }
}
