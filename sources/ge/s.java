package ge;

import be.f0;
public class s extends be.a implements md.d {
    public final kd.c d;

    public s(kd.c cVar, kd.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override
    public void b(Object obj) {
        a.g(f0.r(obj), w7.n.b(this.d));
    }

    @Override
    public void g(Object obj) {
        this.d.resumeWith(f0.r(obj));
    }

    @Override
    public final md.d getCallerFrame() {
        kd.c cVar = this.d;
        if (cVar instanceof md.d) {
            return (md.d) cVar;
        }
        return null;
    }

    @Override
    public final boolean z() {
        return true;
    }
}
