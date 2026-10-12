package e9;

import j$.util.Objects;
public final class x0 extends g0 {
    @Override
    public final h0 a(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        c(obj);
    }

    public final y0 g() {
        int i10 = this.f8564b;
        if (i10 != 0) {
            if (i10 != 1) {
                y0 t10 = y0.t(i10, this.f8563a);
                this.f8564b = t10.size();
                this.f8565c = true;
                return t10;
            }
            Object obj = this.f8563a[0];
            Objects.requireNonNull(obj);
            int i11 = y0.f8654c;
            return new k2(obj);
        }
        int i12 = y0.f8654c;
        return e2.f8556s;
    }
}
