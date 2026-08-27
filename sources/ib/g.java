package ib;

import af.h;

public final class g implements z8.d {

    public static final g f11108b = new g(0);

    public static final g f11109c = new g(1);
    public static final g d = new g(2);

    public final int f11110a;

    public g(int i10) {
        this.f11110a = i10;
    }

    @Override
    public final Object u0(h hVar) {
        switch (this.f11110a) {
            case 0:
                return new e((za.g) hVar.a(za.g.class));
            case 1:
                return new d((e) hVar.a(e.class), (za.d) hVar.a(za.d.class));
            default:
                return new fb.b(hVar.e(d.class));
        }
    }
}
