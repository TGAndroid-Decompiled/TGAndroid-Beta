package oe;

import a8.ee;
import android.graphics.RectF;
public final class g implements Comparable {
    public final Object f19336a;
    public int f19337b;
    public final m f19338c;
    public final m d;
    public final n e;
    public final m f19339f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f19336a = obj;
        this.f19337b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f19338c = new m(i10);
        this.e = new n();
        this.f19339f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f19338c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f19339f.c(z10);
        Object obj = this.f19336a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.e;
        RectF rectF = nVar.e;
        rectF.set(nVar.f19353a.f19350a, nVar.f19354b.f19350a, nVar.f19355c.f19350a, nVar.d.f19350a);
        return rectF;
    }

    public final float c() {
        return ee.a(this.d.f19350a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f19337b, ((g) obj).f19337b);
    }
}
