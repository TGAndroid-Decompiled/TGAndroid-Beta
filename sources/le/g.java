package le;

import android.graphics.RectF;
import w7.q;
public final class g implements Comparable {
    public final Object f15445a;
    public int f15446b;
    public final m f15447c;
    public final m d;
    public final n f15448e;
    public final m f15449f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f15445a = obj;
        this.f15446b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f15447c = new m(i10);
        this.f15448e = new n();
        this.f15449f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f15447c.c(z10);
        this.d.c(z10);
        this.f15448e.c(z10);
        this.f15449f.c(z10);
        Object obj = this.f15445a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.f15448e;
        RectF rectF = nVar.f15468e;
        rectF.set(nVar.f15465a.f15462a, nVar.f15466b.f15462a, nVar.f15467c.f15462a, nVar.d.f15462a);
        return rectF;
    }

    public final float c() {
        return q.a(this.d.f15462a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f15446b, ((g) obj).f15446b);
    }
}
