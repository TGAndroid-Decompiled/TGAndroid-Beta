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
        int i10 = this.f8448b;
        if (i10 != 0) {
            if (i10 != 1) {
                y0 t10 = y0.t(i10, this.f8447a);
                this.f8448b = t10.size();
                this.f8449c = true;
                return t10;
            }
            Object obj = this.f8447a[0];
            Objects.requireNonNull(obj);
            int i11 = y0.f8538c;
            return new k2(obj);
        }
        int i12 = y0.f8538c;
        return e2.f8440s;
    }
}
