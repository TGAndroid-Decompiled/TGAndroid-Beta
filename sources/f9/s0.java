package f9;

import j$.util.Objects;
public final class s0 extends b0 {
    @Override
    public final c0 a(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        c(obj);
    }

    public final t0 g() {
        int i10 = this.f10258b;
        if (i10 != 0) {
            if (i10 != 1) {
                t0 t10 = t0.t(i10, this.f10257a);
                this.f10258b = t10.size();
                this.f10259c = true;
                return t10;
            }
            Object obj = this.f10257a[0];
            Objects.requireNonNull(obj);
            int i11 = t0.f10343c;
            return new e2(obj);
        }
        int i12 = t0.f10343c;
        return z1.f10366s;
    }
}
