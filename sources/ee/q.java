package ee;

import c8.u0;
import zd.b0;
public class q extends zd.a implements kd.d {
    public final id.c d;

    public q(id.c cVar, id.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override
    public final boolean B() {
        return true;
    }

    @Override
    public void g(Object obj) {
        a.h(u0.b(this.d), b0.s(obj));
    }

    @Override
    public final kd.d getCallerFrame() {
        id.c cVar = this.d;
        if (cVar instanceof kd.d) {
            return (kd.d) cVar;
        }
        return null;
    }

    @Override
    public void h(Object obj) {
        this.d.resumeWith(b0.s(obj));
    }
}
