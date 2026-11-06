package f2;

import android.content.Context;
import g9.u;
public final class c implements u {
    public final int f10891a;
    public final Context f10892b;

    public c(Context context, int i7) {
        this.f10891a = i7;
        this.f10892b = context;
    }

    @Override
    public final Object get() {
        switch (this.f10891a) {
            case 0:
                return i.d(this.f10892b);
            case 1:
                return new l2.j(this.f10892b);
            case 2:
                return new x2.q(this.f10892b, new f3.m());
            case 3:
                return new a3.s(this.f10892b, new nb.a(1));
            default:
                return b3.g.c(this.f10892b);
        }
    }
}
