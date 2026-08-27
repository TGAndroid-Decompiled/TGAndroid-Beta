package kb;

import af.h;
import za.g;

public final class a implements z8.d {

    public static final a f15139b = new a(0);

    public static final a f15140c = new a(1);

    public final int f15141a;

    public a(int i10) {
        this.f15141a = i10;
    }

    @Override
    public final Object u0(h hVar) {
        switch (this.f15141a) {
            case 0:
                return new c((g) hVar.a(g.class));
            default:
                return new b((c) hVar.a(c.class), (za.d) hVar.a(za.d.class));
        }
    }
}
