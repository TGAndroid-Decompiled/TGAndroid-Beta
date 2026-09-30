package le;

import android.graphics.RectF;
import w7.q;
public final class h implements Comparable {
    public final Object f14226a;
    public int f14227b;
    public final n f14228c;
    public final n d;
    public final o e;
    public final n f14229f;
    public boolean h = false;

    public h(int i10, Object obj, boolean z10) {
        float f7;
        this.f14226a = obj;
        this.f14227b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new n(f7);
        this.f14228c = new n(i10);
        this.e = new o();
        this.f14229f = new n(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f14228c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f14229f.c(z10);
        Object obj = this.f14226a;
        if (obj instanceof o) {
            ((o) obj).c(z10);
        }
    }

    public final RectF b() {
        o oVar = this.e;
        RectF rectF = oVar.e;
        rectF.set(oVar.f14243a.f14240a, oVar.f14244b.f14240a, oVar.f14245c.f14240a, oVar.d.f14240a);
        return rectF;
    }

    public final float c() {
        return q.a(this.d.f14240a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f14227b, ((h) obj).f14227b);
    }
}
