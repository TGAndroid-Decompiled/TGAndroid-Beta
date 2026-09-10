package gb;
public final class q extends db.u {
    public static final p f8709b = new p(new q(db.t.f6384b), 0);
    public final db.t f8710a;

    public q(db.t tVar) {
        this.f8710a = tVar;
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
            throw new RuntimeException("Expecting number, got: " + hc.b.E(x10) + "; at path " + aVar.h());
        }
        return this.f8710a.a(aVar);
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
