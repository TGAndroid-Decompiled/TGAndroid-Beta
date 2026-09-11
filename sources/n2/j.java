package n2;

import e2.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.f0;
public final class j {
    public final int f16400a;
    public final f0 f16401b;
    public final CopyOnWriteArrayList f16402c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i10, f0 f0Var) {
        this.f16402c = copyOnWriteArrayList;
        this.f16400a = i10;
        this.f16401b = f0Var;
    }

    public final void a() {
        Iterator it = this.f16402c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f16398a, new h(this, iVar.f16399b, 2));
        }
    }

    public final void b() {
        Iterator it = this.f16402c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f16398a, new h(this, iVar.f16399b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f16402c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f16398a, new ah.p(this, iVar.f16399b, i10, 17));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f16402c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f16398a, new hg.t(this, iVar.f16399b, exc, 24));
        }
    }

    public final void e() {
        Iterator it = this.f16402c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f16398a, new h(this, iVar.f16399b, 0));
        }
    }
}
