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
        int i10 = this.f8567b;
        if (i10 != 0) {
            if (i10 != 1) {
                y0 t10 = y0.t(i10, this.f8566a);
                this.f8567b = t10.size();
                this.f8568c = true;
                return t10;
            }
            Object obj = this.f8566a[0];
            Objects.requireNonNull(obj);
            int i11 = y0.f8657c;
            return new k2(obj);
        }
        int i12 = y0.f8657c;
        return e2.f8559s;
    }
}
