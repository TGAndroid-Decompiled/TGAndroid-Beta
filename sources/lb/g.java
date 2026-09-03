package lb;

import c5.j;
import cb.h;
public final class g implements c9.f {
    public static final g f11959b = new g(0);
    public static final g f11960c = new g(1);
    public static final g d = new g(2);
    public final int f11961a;

    public g(int i10) {
        this.f11961a = i10;
    }

    @Override
    public final Object d0(j jVar) {
        switch (this.f11961a) {
            case 0:
                return new e((h) jVar.a(h.class));
            case 1:
                return new d((e) jVar.a(e.class), (cb.d) jVar.a(cb.d.class));
            default:
                return new ib.b(jVar.c(d.class));
        }
    }
}
