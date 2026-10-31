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
        int i10 = this.f6362b;
        if (i10 != 0) {
            if (i10 != 1) {
                y0 t10 = y0.t(i10, this.f6361a);
                this.f6362b = t10.size();
                this.f6363c = true;
                return t10;
            }
            Object obj = this.f6361a[0];
            Objects.requireNonNull(obj);
            int i11 = y0.f6452c;
            return new k2(obj);
        }
        int i12 = y0.f6452c;
        return e2.f6354s;
    }
}
