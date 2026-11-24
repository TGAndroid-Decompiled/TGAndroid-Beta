package defpackage;

import android.graphics.RectF;
public final class u66 implements Comparable {
    public final Object a;
    public int b;
    public final bbc c;
    public final bbc d;
    public final cbc e;
    public final bbc f;
    public boolean h = false;

    public u66(int i, Object obj, boolean z) {
        float f;
        this.a = obj;
        this.b = i;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.d = new bbc(f);
        this.c = new bbc(i);
        this.e = new cbc();
        this.f = new bbc(0.0f);
        a(false);
    }

    public final void a(boolean z) {
        this.c.c(z);
        this.d.c(z);
        this.e.c(z);
        this.f.c(z);
        Object obj = this.a;
        if (obj instanceof cbc) {
            ((cbc) obj).c(z);
        }
    }

    public final RectF b() {
        cbc cbcVar = this.e;
        RectF rectF = cbcVar.e;
        rectF.set(cbcVar.a.a, cbcVar.b.a, cbcVar.c.a, cbcVar.d.a);
        return rectF;
    }

    public final float c() {
        return pqe.a(this.d.a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.b, ((u66) obj).b);
    }
}
