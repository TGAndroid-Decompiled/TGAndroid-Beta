package ne;

import android.graphics.RectF;
import w7.r;
public final class g implements Comparable {
    public final Object f17456a;
    public int f17457b;
    public final m f17458c;
    public final m d;
    public final n e;
    public final m f17459f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f17456a = obj;
        this.f17457b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f17458c = new m(i10);
        this.e = new n();
        this.f17459f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f17458c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f17459f.c(z10);
        Object obj = this.f17456a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.e;
        RectF rectF = nVar.e;
        rectF.set(nVar.f17473a.f17470a, nVar.f17474b.f17470a, nVar.f17475c.f17470a, nVar.d.f17470a);
        return rectF;
    }

    public final float c() {
        return r.a(this.d.f17470a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f17457b, ((g) obj).f17457b);
    }
}
