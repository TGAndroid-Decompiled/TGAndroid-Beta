package ne;

import android.graphics.RectF;
import w7.r;
public final class g implements Comparable {
    public final Object f17393a;
    public int f17394b;
    public final m f17395c;
    public final m d;
    public final n e;
    public final m f17396f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f17393a = obj;
        this.f17394b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f17395c = new m(i10);
        this.e = new n();
        this.f17396f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f17395c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f17396f.c(z10);
        Object obj = this.f17393a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.e;
        RectF rectF = nVar.e;
        rectF.set(nVar.f17410a.f17407a, nVar.f17411b.f17407a, nVar.f17412c.f17407a, nVar.d.f17407a);
        return rectF;
    }

    public final float c() {
        return r.a(this.d.f17407a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f17394b, ((g) obj).f17394b);
    }
}
