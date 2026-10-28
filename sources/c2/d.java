package c2;

import android.content.Context;
public final class d implements e9.t {
    public final int f5933a;
    public final Context f5934b;

    public d(Context context, int i10) {
        this.f5933a = i10;
        this.f5934b = context;
    }

    @Override
    public final Object get() {
        switch (this.f5933a) {
            case 0:
                return j.e(this.f5934b);
            case 1:
                return new i2.k(this.f5934b);
            case 2:
                return new u2.q(this.f5934b, new c3.m());
            case 3:
                return new x2.o(this.f5934b, new qb.a(26));
            default:
                return y2.f.c(this.f5934b);
        }
    }
}
