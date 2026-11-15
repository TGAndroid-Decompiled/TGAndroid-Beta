package f2;

import android.content.Context;
import g9.t;
public final class c implements t {
    public final int f10707a;
    public final Context f10708b;

    public c(Context context, int i7) {
        this.f10707a = i7;
        this.f10708b = context;
    }

    @Override
    public final Object get() {
        switch (this.f10707a) {
            case 0:
                return h.d(this.f10708b);
            case 1:
                return new l2.j(this.f10708b);
            case 2:
                return new x2.p(this.f10708b, new f3.m());
            case 3:
                return new a3.s(this.f10708b, new nb.a(1));
            default:
                return b3.g.c(this.f10708b);
        }
    }
}
