package ne;

import android.graphics.RectF;
import w7.s;
public final class g implements Comparable {
    public final Object f16302a;
    public int f16303b;
    public final m f16304c;
    public final m d;
    public final n e;
    public final m f16305f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f16302a = obj;
        this.f16303b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f16304c = new m(i10);
        this.e = new n();
        this.f16305f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f16304c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f16305f.c(z10);
        Object obj = this.f16302a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.e;
        RectF rectF = nVar.e;
        rectF.set(nVar.f16319a.f16316a, nVar.f16320b.f16316a, nVar.f16321c.f16316a, nVar.d.f16316a);
        return rectF;
    }

    public final float c() {
        return s.a(this.d.f16316a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f16303b, ((g) obj).f16303b);
    }
}
