package le;

import android.graphics.RectF;
import w7.p;
public final class g implements Comparable {
    public final Object f13982a;
    public int f13983b;
    public final m f13984c;
    public final m d;
    public final n e;
    public final m f13985f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f13982a = obj;
        this.f13983b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f13984c = new m(i10);
        this.e = new n();
        this.f13985f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f13984c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f13985f.c(z10);
        Object obj = this.f13982a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.e;
        RectF rectF = nVar.e;
        rectF.set(nVar.f13999a.f13996a, nVar.f14000b.f13996a, nVar.f14001c.f13996a, nVar.d.f13996a);
        return rectF;
    }

    public final float c() {
        return p.a(this.d.f13996a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f13983b, ((g) obj).f13983b);
    }
}
