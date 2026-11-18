package f2;

import android.content.Context;
public final class d implements g9.t {
    public final int f11026a;
    public final Context f11027b;

    public d(Context context, int i7) {
        this.f11026a = i7;
        this.f11027b = context;
    }

    @Override
    public final Object get() {
        switch (this.f11026a) {
            case 0:
                return i.d(this.f11027b);
            case 1:
                return new l2.j(this.f11027b);
            case 2:
                return new x2.q(this.f11027b, new f3.m());
            case 3:
                return new a3.s(this.f11027b, new nb.a(1));
            default:
                return b3.g.c(this.f11027b);
        }
    }
}
