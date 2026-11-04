package g9;

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
        int i3 = this.f12053b;
        if (i3 != 0) {
            if (i3 != 1) {
                t0 p10 = t0.p(i3, this.f12052a);
                this.f12053b = p10.size();
                this.f12054c = true;
                return p10;
            }
            Object obj = this.f12052a[0];
            Objects.requireNonNull(obj);
            int i10 = t0.f12149c;
            return new e2(obj);
        }
        int i11 = t0.f12149c;
        return z1.f12178s;
    }
}
