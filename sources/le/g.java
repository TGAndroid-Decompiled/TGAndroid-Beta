package le;

import android.graphics.RectF;
import w7.p;
public final class g implements Comparable {
    public final Object f13984a;
    public int f13985b;
    public final m f13986c;
    public final m d;
    public final n e;
    public final m f13987f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f13984a = obj;
        this.f13985b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f13986c = new m(i10);
        this.e = new n();
        this.f13987f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f13986c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f13987f.c(z10);
        Object obj = this.f13984a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.e;
        RectF rectF = nVar.e;
        rectF.set(nVar.f14001a.f13998a, nVar.f14002b.f13998a, nVar.f14003c.f13998a, nVar.d.f13998a);
        return rectF;
    }

    public final float c() {
        return p.a(this.d.f13998a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f13985b, ((g) obj).f13985b);
    }
}
