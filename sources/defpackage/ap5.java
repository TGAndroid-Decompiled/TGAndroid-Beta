package defpackage;

import j$.util.Objects;
public final class ap5 extends ho5 {
    @Override
    public final io5 a(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        c(obj);
    }

    public final bp5 g() {
        int i = this.b;
        if (i != 0) {
            Object[] objArr = this.a;
            if (i != 1) {
                bp5 p = bp5.p(i, objArr);
                this.b = p.size();
                this.c = true;
                return p;
            }
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            int i2 = bp5.c;
            return new oma(obj);
        }
        int i3 = bp5.c;
        return q99.s;
    }
}
