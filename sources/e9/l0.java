package e9;

import j$.util.Objects;
public final class l0 extends com.google.android.gms.common.api.internal.w {
    @Override
    public final com.google.android.gms.common.api.internal.w c(Object obj) {
        obj.getClass();
        b(obj);
        return this;
    }

    public final m0 i() {
        int i10 = this.f6183a;
        if (i10 != 0) {
            if (i10 != 1) {
                m0 u10 = m0.u(i10, this.f6185c);
                this.f6183a = u10.size();
                this.f6184b = true;
                return u10;
            }
            Object obj = this.f6185c[0];
            Objects.requireNonNull(obj);
            int i11 = m0.f8099c;
            return new m1(obj);
        }
        int i12 = m0.f8099c;
        return g1.f8077s;
    }
}
