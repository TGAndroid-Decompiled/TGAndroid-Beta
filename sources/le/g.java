package le;

import android.graphics.RectF;
import w7.q;
public final class g implements Comparable {
    public final Object f15447a;
    public int f15448b;
    public final m f15449c;
    public final m d;
    public final n f15450e;
    public final m f15451f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f15447a = obj;
        this.f15448b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f15449c = new m(i10);
        this.f15450e = new n();
        this.f15451f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f15449c.c(z10);
        this.d.c(z10);
        this.f15450e.c(z10);
        this.f15451f.c(z10);
        Object obj = this.f15447a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.f15450e;
        RectF rectF = nVar.f15470e;
        rectF.set(nVar.f15467a.f15464a, nVar.f15468b.f15464a, nVar.f15469c.f15464a, nVar.d.f15464a);
        return rectF;
    }

    public final float c() {
        return q.a(this.d.f15464a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f15448b, ((g) obj).f15448b);
    }
}
