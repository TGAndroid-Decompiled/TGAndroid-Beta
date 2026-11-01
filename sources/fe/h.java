package fe;

import android.graphics.RectF;
import w7.u;
public final class h implements Comparable {
    public final Object f7035a;
    public int f7036b;
    public final n f7037c;
    public final n d;
    public final o e;
    public final n f7038f;
    public boolean h = false;

    public h(int i10, Object obj, boolean z10) {
        float f7;
        this.f7035a = obj;
        this.f7036b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new n(f7);
        this.f7037c = new n(i10);
        this.e = new o();
        this.f7038f = new n(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f7037c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f7038f.c(z10);
        Object obj = this.f7035a;
        if (obj instanceof o) {
            ((o) obj).c(z10);
        }
    }

    public final RectF b() {
        o oVar = this.e;
        RectF rectF = oVar.e;
        rectF.set(oVar.f7052a.f7049a, oVar.f7053b.f7049a, oVar.f7054c.f7049a, oVar.d.f7049a);
        return rectF;
    }

    public final float c() {
        return u.a(this.d.f7049a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f7036b, ((h) obj).f7036b);
    }
}
