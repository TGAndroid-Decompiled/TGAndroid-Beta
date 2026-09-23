package bc;

import qb.g;
public final class a implements q9.d {
    public static final a f3482b = new a(0);
    public static final a f3483c = new a(1);
    public final int f3484a;

    public a(int i10) {
        this.f3484a = i10;
    }

    @Override
    public final Object G(cf.c cVar) {
        switch (this.f3484a) {
            case 0:
                return new c((g) cVar.a(g.class));
            default:
                return new b((c) cVar.a(c.class), (qb.d) cVar.a(qb.d.class));
        }
    }
}
