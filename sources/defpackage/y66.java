package defpackage;

import android.graphics.RectF;
public final class y66 implements Comparable {
    public final Object a;
    public int b;
    public final adc c;
    public final adc d;
    public final bdc e;
    public final adc f;
    public boolean h = false;

    public y66(int i, Object obj, boolean z) {
        float f;
        this.a = obj;
        this.b = i;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.d = new adc(f);
        this.c = new adc(i);
        this.e = new bdc();
        this.f = new adc(0.0f);
        a(false);
    }

    public final void a(boolean z) {
        this.c.c(z);
        this.d.c(z);
        this.e.c(z);
        this.f.c(z);
        Object obj = this.a;
        if (obj instanceof bdc) {
            ((bdc) obj).c(z);
        }
    }

    public final RectF b() {
        bdc bdcVar = this.e;
        RectF rectF = bdcVar.e;
        rectF.set(bdcVar.a.a, bdcVar.b.a, bdcVar.c.a, bdcVar.d.a);
        return rectF;
    }

    public final float c() {
        return ete.a(this.d.a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.b, ((y66) obj).b);
    }
}
