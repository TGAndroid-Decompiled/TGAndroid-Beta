package hb;

import i2.o1;
public final class q extends eb.u {
    public static final p f11779b = new p(new q(eb.t.f8584b), 0);
    public final eb.t f11780a;

    public q(eb.t tVar) {
        this.f11780a = tVar;
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
            throw new RuntimeException("Expecting number, got: " + o1.E(x10) + "; at path " + aVar.h());
        }
        return this.f11780a.a(aVar);
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
