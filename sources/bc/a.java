package bc;

import qb.g;
public final class a implements q9.d {
    public static final a f3764b = new a(0);
    public static final a f3765c = new a(1);
    public final int f3766a;

    public a(int i10) {
        this.f3766a = i10;
    }

    @Override
    public final Object E(cf.c cVar) {
        switch (this.f3766a) {
            case 0:
                return new c((g) cVar.a(g.class));
            default:
                return new b((c) cVar.a(c.class), (qb.d) cVar.a(qb.d.class));
        }
    }
}
