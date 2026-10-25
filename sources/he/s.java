package he;

import a8.pe;
import ce.f0;
public class s extends ce.a implements nd.d {
    public final ld.c d;

    public s(ld.c cVar, ld.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override
    public void b(Object obj) {
        a.g(f0.r(obj), pe.b(this.d));
    }

    @Override
    public void g(Object obj) {
        this.d.resumeWith(f0.r(obj));
    }

    @Override
    public final nd.d getCallerFrame() {
        ld.c cVar = this.d;
        if (cVar instanceof nd.d) {
            return (nd.d) cVar;
        }
        return null;
    }

    @Override
    public final boolean z() {
        return true;
    }
}
