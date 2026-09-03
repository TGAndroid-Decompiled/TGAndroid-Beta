package o3;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import lh.p6;
public final class m {
    public final int f16254a;
    public final o4.v f16255b;
    public final CopyOnWriteArrayList f16256c;

    public m(CopyOnWriteArrayList copyOnWriteArrayList, int i10, o4.v vVar) {
        this.f16256c = copyOnWriteArrayList;
        this.f16254a = i10;
        this.f16255b = vVar;
    }

    public final void a() {
        Iterator it = this.f16256c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            h5.d0.K(lVar.f16252a, new k(this, lVar.f16253b, 2));
        }
    }

    public final void b() {
        Iterator it = this.f16256c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            h5.d0.K(lVar.f16252a, new k(this, lVar.f16253b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f16256c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            h5.d0.K(lVar.f16252a, new ah.a(this, lVar.f16253b, i10, 15));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f16256c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            h5.d0.K(lVar.f16252a, new p6(this, lVar.f16253b, exc, 10));
        }
    }

    public final void e() {
        Iterator it = this.f16256c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            h5.d0.K(lVar.f16252a, new k(this, lVar.f16253b, 0));
        }
    }
}
