package oa;
public final class q extends la.u {
    public static final p f19156b = new p(new q(la.t.f16730b), 0);
    public final la.t f19157a;

    public q(la.t tVar) {
        this.f19157a = tVar;
    }

    @Override
    public final Object read(ta.a aVar) {
        int x10 = aVar.x();
        int b10 = m1.j.b(x10);
        if (b10 != 5 && b10 != 6) {
            if (b10 == 8) {
                aVar.t();
                return null;
            }
            throw new RuntimeException("Expecting number, got: " + ta.b.k(x10) + "; at path " + aVar.h());
        }
        return this.f19157a.a(aVar);
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        cVar.q((Number) obj);
    }
}
