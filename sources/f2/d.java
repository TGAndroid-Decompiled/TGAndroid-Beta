package f2;

import android.content.Context;
public final class d implements g9.t {
    public final int f11058a;
    public final Context f11059b;

    public d(Context context, int i7) {
        this.f11058a = i7;
        this.f11059b = context;
    }

    @Override
    public final Object get() {
        switch (this.f11058a) {
            case 0:
                return i.d(this.f11059b);
            case 1:
                return new l2.j(this.f11059b);
            case 2:
                return new x2.q(this.f11059b, new f3.m());
            case 3:
                return new a3.s(this.f11059b, new nb.a(1));
            default:
                return b3.g.c(this.f11059b);
        }
    }
}
