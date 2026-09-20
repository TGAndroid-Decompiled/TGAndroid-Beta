package le;

import android.graphics.RectF;
import w7.q;
public final class g implements Comparable {
    public final Object f14179a;
    public int f14180b;
    public final m f14181c;
    public final m d;
    public final n e;
    public final m f14182f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f14179a = obj;
        this.f14180b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f14181c = new m(i10);
        this.e = new n();
        this.f14182f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f14181c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f14182f.c(z10);
        Object obj = this.f14179a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.e;
        RectF rectF = nVar.e;
        rectF.set(nVar.f14196a.f14193a, nVar.f14197b.f14193a, nVar.f14198c.f14193a, nVar.d.f14193a);
        return rectF;
    }

    public final float c() {
        return q.a(this.d.f14193a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f14180b, ((g) obj).f14180b);
    }
}
