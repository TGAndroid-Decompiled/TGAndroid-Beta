package bc;

import qb.g;
public final class a implements q9.d {
    public static final a f2598b = new a(0);
    public static final a f2599c = new a(1);
    public final int f2600a;

    public a(int i10) {
        this.f2600a = i10;
    }

    @Override
    public final Object D(cf.c cVar) {
        switch (this.f2600a) {
            case 0:
                return new c((g) cVar.a(g.class));
            default:
                return new b((c) cVar.a(c.class), (qb.d) cVar.a(qb.d.class));
        }
    }
}
