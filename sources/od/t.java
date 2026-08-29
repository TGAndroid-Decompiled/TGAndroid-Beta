package od;

import i7.v7;
import jd.e0;
public class t extends jd.a implements uc.d {
    public final sc.c d;

    public t(sc.c cVar, sc.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override
    public void f(Object obj) {
        a.g(e0.r(obj), v7.b(this.d));
    }

    @Override
    public void g(Object obj) {
        this.d.resumeWith(e0.r(obj));
    }

    @Override
    public final uc.d getCallerFrame() {
        sc.c cVar = this.d;
        if (cVar instanceof uc.d) {
            return (uc.d) cVar;
        }
        return null;
    }

    @Override
    public final boolean z() {
        return true;
    }
}
