package c2;

import android.content.Context;
import t7.u;
public final class c implements d9.t {
    public final int f3527a;
    public final Context f3528b;

    public c(Context context, int i10) {
        this.f3527a = i10;
        this.f3528b = context;
    }

    @Override
    public final Object get() {
        switch (this.f3527a) {
            case 0:
                return h.e(this.f3528b);
            case 1:
                return new i2.j(this.f3528b);
            case 2:
                return new u2.q(this.f3528b, new c3.m());
            case 3:
                return new x2.o(this.f3528b, new u(25));
            default:
                return y2.f.c(this.f3528b);
        }
    }
}
