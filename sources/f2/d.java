package f2;

import android.content.Context;
public final class d implements g9.t {
    public final int f11019a;
    public final Context f11020b;

    public d(Context context, int i7) {
        this.f11019a = i7;
        this.f11020b = context;
    }

    @Override
    public final Object get() {
        switch (this.f11019a) {
            case 0:
                return i.d(this.f11020b);
            case 1:
                return new l2.k(this.f11020b);
            case 2:
                return new x2.q(this.f11020b, new f3.m());
            case 3:
                return new a3.s(this.f11020b, new nb.a(1));
            default:
                return b3.g.c(this.f11020b);
        }
    }
}
