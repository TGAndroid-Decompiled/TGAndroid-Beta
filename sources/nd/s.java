package nd;

import h7.h7;
import id.f0;

public class s extends id.a implements tc.d {
    public final rc.c d;

    public s(rc.c cVar, rc.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override
    public void f(Object obj) {
        a.g(f0.r(obj), h7.b(this.d));
    }

    @Override
    public void g(Object obj) {
        this.d.resumeWith(f0.r(obj));
    }

    @Override
    public final tc.d getCallerFrame() {
        rc.c cVar = this.d;
        if (cVar instanceof tc.d) {
            return (tc.d) cVar;
        }
        return null;
    }

    @Override
    public final boolean z() {
        return true;
    }
}
