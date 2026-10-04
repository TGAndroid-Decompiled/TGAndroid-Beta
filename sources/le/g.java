package le;

import android.graphics.RectF;
import w7.q;
public final class g implements Comparable {
    public final Object f15446a;
    public int f15447b;
    public final m f15448c;
    public final m d;
    public final n f15449e;
    public final m f15450f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f15446a = obj;
        this.f15447b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f15448c = new m(i10);
        this.f15449e = new n();
        this.f15450f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f15448c.c(z10);
        this.d.c(z10);
        this.f15449e.c(z10);
        this.f15450f.c(z10);
        Object obj = this.f15446a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.f15449e;
        RectF rectF = nVar.f15469e;
        rectF.set(nVar.f15466a.f15463a, nVar.f15467b.f15463a, nVar.f15468c.f15463a, nVar.d.f15463a);
        return rectF;
    }

    public final float c() {
        return q.a(this.d.f15463a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f15447b, ((g) obj).f15447b);
    }
}
