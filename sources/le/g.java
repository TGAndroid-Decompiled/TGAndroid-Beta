package le;

import android.graphics.RectF;
import w7.q;
public final class g implements Comparable {
    public final Object f12879a;
    public int f12880b;
    public final m f12881c;
    public final m d;
    public final n e;
    public final m f12882f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f12879a = obj;
        this.f12880b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f12881c = new m(i10);
        this.e = new n();
        this.f12882f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f12881c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f12882f.c(z10);
        Object obj = this.f12879a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.e;
        RectF rectF = nVar.e;
        rectF.set(nVar.f12896a.f12893a, nVar.f12897b.f12893a, nVar.f12898c.f12893a, nVar.d.f12893a);
        return rectF;
    }

    public final float c() {
        return q.a(this.d.f12893a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f12880b, ((g) obj).f12880b);
    }
}
