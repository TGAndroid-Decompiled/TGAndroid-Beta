package jb;

import a5.j;
import ab.h;
public final class g implements a9.e {
    public static final g f11434b = new g(0);
    public static final g f11435c = new g(1);
    public static final g d = new g(2);
    public final int f11436a;

    public g(int i10) {
        this.f11436a = i10;
    }

    @Override
    public final Object I0(j jVar) {
        switch (this.f11436a) {
            case 0:
                return new e((h) jVar.a(h.class));
            case 1:
                return new d((e) jVar.a(e.class), (ab.d) jVar.a(ab.d.class));
            default:
                return new gb.b(jVar.c(d.class));
        }
    }
}
