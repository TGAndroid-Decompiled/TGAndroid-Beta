package n2;

import ag.o0;
import e2.l0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.g0;
public final class j {
    public final int f13462a;
    public final g0 f13463b;
    public final CopyOnWriteArrayList f13464c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i10, g0 g0Var) {
        this.f13464c = copyOnWriteArrayList;
        this.f13462a = i10;
        this.f13463b = g0Var;
    }

    public final void a(oa.d dVar) {
        Iterator it = this.f13464c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f13460a, new li.s(this, iVar.f13461b, dVar, 10));
        }
    }

    public final void b() {
        Iterator it = this.f13464c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f13460a, new h(this, iVar.f13461b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f13464c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f13460a, new o0(this, iVar.f13461b, i10, 8));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f13464c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f13460a, new li.s(this, iVar.f13461b, exc, 9));
        }
    }

    public final void e() {
        Iterator it = this.f13464c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f13460a, new h(this, iVar.f13461b, 0));
        }
    }
}
