package h9;

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
        int i7 = this.f14300b;
        if (i7 != 0) {
            if (i7 != 1) {
                t0 p10 = t0.p(i7, this.f14299a);
                this.f14300b = p10.size();
                this.f14301c = true;
                return p10;
            }
            Object obj = this.f14299a[0];
            Objects.requireNonNull(obj);
            int i10 = t0.f14397c;
            return new f2(obj);
        }
        int i11 = t0.f14397c;
        return a2.f14290s;
    }
}
