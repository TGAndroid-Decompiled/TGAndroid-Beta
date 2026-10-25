package ib;
public final class q extends fb.u {
    public static final p f13953b = new p(new q(fb.t.f10400b), 0);
    public final fb.t f13954a;

    public q(fb.t tVar) {
        this.f13954a = tVar;
    }

    @Override
    public final Object read(nb.a aVar) {
        int x9 = aVar.x();
        int c10 = m1.j.c(x9);
        if (c10 != 5 && c10 != 6) {
            if (c10 == 8) {
                aVar.t();
                return null;
            }
            throw new RuntimeException("Expecting number, got: " + ic.a.C(x9) + "; at path " + aVar.h());
        }
        return this.f13954a.a(aVar);
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
