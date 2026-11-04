package be;

import b8.jc;
import wd.b0;
public class q extends wd.a implements hd.d {
    public final fd.c d;

    public q(fd.c cVar, fd.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override
    public final boolean B() {
        return true;
    }

    @Override
    public void g(Object obj) {
        a.h(jc.b(this.d), b0.s(obj));
    }

    @Override
    public final hd.d getCallerFrame() {
        fd.c cVar = this.d;
        if (cVar instanceof hd.d) {
            return (hd.d) cVar;
        }
        return null;
    }

    @Override
    public void h(Object obj) {
        this.d.resumeWith(b0.s(obj));
    }
}
