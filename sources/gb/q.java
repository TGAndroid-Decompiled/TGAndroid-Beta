package gb;
public final class q extends db.u {
    public static final p f10575b = new p(new q(db.t.f6713b), 0);
    public final db.t f10576a;

    public q(db.t tVar) {
        this.f10576a = tVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        int x10 = aVar.x();
        int c10 = m1.j.c(x10);
        if (c10 != 5 && c10 != 6) {
            if (c10 == 8) {
                aVar.t();
                return null;
            }
            throw new RuntimeException("Expecting number, got: " + i2.g.E(x10) + "; at path " + aVar.h());
        }
        return this.f10576a.a(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
