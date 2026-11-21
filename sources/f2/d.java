package f2;

import android.content.Context;
public final class d implements g9.t {
    public final int f11055a;
    public final Context f11056b;

    public d(Context context, int i7) {
        this.f11055a = i7;
        this.f11056b = context;
    }

    @Override
    public final Object get() {
        switch (this.f11055a) {
            case 0:
                return i.d(this.f11056b);
            case 1:
                return new l2.j(this.f11056b);
            case 2:
                return new x2.q(this.f11056b, new f3.m());
            case 3:
                return new a3.s(this.f11056b, new nb.a(1));
            default:
                return b3.g.c(this.f11056b);
        }
    }
}
