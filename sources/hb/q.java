package hb;
public final class q extends eb.u {
    public static final p f11752b = new p(new q(eb.t.f8577b), 0);
    public final eb.t f11753a;

    public q(eb.t tVar) {
        this.f11753a = tVar;
    }

    @Override
    public final Object read(mb.a aVar) {
        int x10 = aVar.x();
        int c10 = m1.j.c(x10);
        if (c10 != 5 && c10 != 6) {
            if (c10 == 8) {
                aVar.t();
                return null;
            }
            throw new RuntimeException("Expecting number, got: " + i2.e.E(x10) + "; at path " + aVar.h());
        }
        return this.f11753a.a(aVar);
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
