package f2;

import android.content.Context;
public final class d implements g9.t {
    public final int f11021a;
    public final Context f11022b;

    public d(Context context, int i7) {
        this.f11021a = i7;
        this.f11022b = context;
    }

    @Override
    public final Object get() {
        switch (this.f11021a) {
            case 0:
                return i.d(this.f11022b);
            case 1:
                return new l2.j(this.f11022b);
            case 2:
                return new x2.q(this.f11022b, new f3.m());
            case 3:
                return new a3.s(this.f11022b, new nb.a(1));
            default:
                return b3.g.c(this.f11022b);
        }
    }
}
