package defpackage;

import j$.util.Objects;
public final class xo5 extends eo5 {
    @Override
    public final fo5 a(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        c(obj);
    }

    public final yo5 g() {
        int i = this.b;
        if (i != 0) {
            Object[] objArr = this.a;
            if (i != 1) {
                yo5 p = yo5.p(i, objArr);
                this.b = p.size();
                this.c = true;
                return p;
            }
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            int i2 = yo5.c;
            return new vka(obj);
        }
        int i3 = yo5.c;
        return f89.s;
    }
}
