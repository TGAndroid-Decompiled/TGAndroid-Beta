package le;

import android.graphics.RectF;
import w7.p;
public final class g implements Comparable {
    public final Object f15379a;
    public int f15380b;
    public final m f15381c;
    public final m d;
    public final n f15382e;
    public final m f15383f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f15379a = obj;
        this.f15380b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f15381c = new m(i10);
        this.f15382e = new n();
        this.f15383f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f15381c.c(z10);
        this.d.c(z10);
        this.f15382e.c(z10);
        this.f15383f.c(z10);
        Object obj = this.f15379a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.f15382e;
        RectF rectF = nVar.f15402e;
        rectF.set(nVar.f15399a.f15396a, nVar.f15400b.f15396a, nVar.f15401c.f15396a, nVar.d.f15396a);
        return rectF;
    }

    public final float c() {
        return p.a(this.d.f15396a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f15380b, ((g) obj).f15380b);
    }
}
