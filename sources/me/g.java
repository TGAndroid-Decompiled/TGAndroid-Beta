package me;

import android.graphics.RectF;
public final class g implements Comparable {
    public final Object f16099a;
    public int f16100b;
    public final m f16101c;
    public final m d;
    public final n f16102e;
    public final m f16103f;
    public boolean h = false;

    public g(int i10, Object obj, boolean z10) {
        float f7;
        this.f16099a = obj;
        this.f16100b = i10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d = new m(f7);
        this.f16101c = new m(i10);
        this.f16102e = new n();
        this.f16103f = new m(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f16101c.c(z10);
        this.d.c(z10);
        this.f16102e.c(z10);
        this.f16103f.c(z10);
        Object obj = this.f16099a;
        if (obj instanceof n) {
            ((n) obj).c(z10);
        }
    }

    public final RectF b() {
        n nVar = this.f16102e;
        RectF rectF = nVar.f16122e;
        rectF.set(nVar.f16119a.f16116a, nVar.f16120b.f16116a, nVar.f16121c.f16116a, nVar.d.f16116a);
        return rectF;
    }

    public final float c() {
        return w7.n.a(this.d.f16116a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f16100b, ((g) obj).f16100b);
    }
}
