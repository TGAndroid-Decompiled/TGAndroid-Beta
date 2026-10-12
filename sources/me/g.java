package me;

import android.graphics.RectF;
public final class g implements Comparable {
    public final Object f16098a;
    public int f16099b;
    public final m f16100c;
    public final m d;
    public final n f16101e;
    public final m f16102f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f16098a = obj;
        this.f16099b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f16100c = new m(i10);
        this.f16101e = new n();
        this.f16102f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f16100c.c(z10);
        this.d.c(z10);
        this.f16101e.c(z10);
        this.f16102f.c(z10);
        Object obj = this.f16098a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.f16101e;
        RectF rectF = nVar.f16121e;
        rectF.set(nVar.f16118a.f16115a, nVar.f16119b.f16115a, nVar.f16120c.f16115a, nVar.d.f16115a);
        return rectF;
    }

    public final float c() {
        return w7.n.a(this.d.f16115a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f16099b, ((g) obj).f16099b);
    }
}
