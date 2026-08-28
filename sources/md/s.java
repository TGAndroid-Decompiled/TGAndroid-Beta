package md;

import g7.g7;
import hd.f0;
public class s extends hd.a implements sc.d {
    public final qc.c d;

    public s(qc.c cVar, qc.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override
    public void f(Object obj) {
        a.g(f0.r(obj), g7.b(this.d));
    }

    @Override
    public void g(Object obj) {
        this.d.resumeWith(f0.r(obj));
    }

    @Override
    public final sc.d getCallerFrame() {
        qc.c cVar = this.d;
        if (cVar instanceof sc.d) {
            return (sc.d) cVar;
        }
        return null;
    }

    @Override
    public final boolean z() {
        return true;
    }
}
