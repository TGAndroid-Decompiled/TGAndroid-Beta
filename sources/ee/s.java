package ee;

import v7.t8;
import zd.e0;
public class s extends zd.a implements kd.d {
    public final id.c d;

    public s(id.c cVar, id.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override
    public void f(Object obj) {
        a.g(e0.r(obj), t8.b(this.d));
    }

    @Override
    public void g(Object obj) {
        this.d.resumeWith(e0.r(obj));
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
    public final boolean z() {
        return true;
    }
}
