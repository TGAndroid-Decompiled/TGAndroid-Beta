package le;

import android.graphics.RectF;
import w7.p;
public final class g implements Comparable {
    public final Object f13994a;
    public int f13995b;
    public final m f13996c;
    public final m d;
    public final n e;
    public final m f13997f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f13994a = obj;
        this.f13995b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f13996c = new m(i10);
        this.e = new n();
        this.f13997f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f13996c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f13997f.c(z10);
        Object obj = this.f13994a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.e;
        RectF rectF = nVar.e;
        rectF.set(nVar.f14011a.f14008a, nVar.f14012b.f14008a, nVar.f14013c.f14008a, nVar.d.f14008a);
        return rectF;
    }

    public final float c() {
        return p.a(this.d.f14008a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f13995b, ((g) obj).f13995b);
    }
}
