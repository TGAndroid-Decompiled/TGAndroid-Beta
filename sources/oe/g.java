package oe;

import a8.ee;
import android.graphics.RectF;
public final class g implements Comparable {
    public final Object f19337a;
    public int f19338b;
    public final m f19339c;
    public final m d;
    public final n e;
    public final m f19340f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f19337a = obj;
        this.f19338b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f19339c = new m(i10);
        this.e = new n();
        this.f19340f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f19339c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f19340f.c(z10);
        Object obj = this.f19337a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.e;
        RectF rectF = nVar.e;
        rectF.set(nVar.f19354a.f19351a, nVar.f19355b.f19351a, nVar.f19356c.f19351a, nVar.d.f19351a);
        return rectF;
    }

    public final float c() {
        return ee.a(this.d.f19351a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f19338b, ((g) obj).f19338b);
    }
}
