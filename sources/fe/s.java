package fe;

import ae.g0;
public class s extends ae.a implements ld.d {
    public final jd.c d;

    public s(jd.c cVar, jd.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override
    public void f(Object obj) {
        a.g(g0.r(obj), w7.h.b(this.d));
    }

    @Override
    public void g(Object obj) {
        this.d.resumeWith(g0.r(obj));
    }

    @Override
    public final ld.d getCallerFrame() {
        jd.c cVar = this.d;
        if (cVar instanceof ld.d) {
            return (ld.d) cVar;
        }
        return null;
    }

    @Override
    public final boolean z() {
        return true;
    }
}
