package bc;

import ci.u5;
import qb.g;
public final class a implements q9.d {
    public static final a f3843b = new a(0);
    public static final a f3844c = new a(1);
    public final int f3845a;

    public a(int i10) {
        this.f3845a = i10;
    }

    @Override
    public final Object y0(u5 u5Var) {
        switch (this.f3845a) {
            case 0:
                return new c((g) u5Var.a(g.class));
            default:
                return new b((c) u5Var.a(c.class), (qb.d) u5Var.a(qb.d.class));
        }
    }
}
