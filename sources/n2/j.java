package n2;

import ag.o0;
import e2.l0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.g0;
public final class j {
    public final int f13461a;
    public final g0 f13462b;
    public final CopyOnWriteArrayList f13463c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i10, g0 g0Var) {
        this.f13463c = copyOnWriteArrayList;
        this.f13461a = i10;
        this.f13462b = g0Var;
    }

    public final void a(oa.d dVar) {
        Iterator it = this.f13463c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f13459a, new li.s(this, iVar.f13460b, dVar, 10));
        }
    }

    public final void b() {
        Iterator it = this.f13463c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f13459a, new h(this, iVar.f13460b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f13463c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f13459a, new o0(this, iVar.f13460b, i10, 8));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f13463c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f13459a, new li.s(this, iVar.f13460b, exc, 9));
        }
    }

    public final void e() {
        Iterator it = this.f13463c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.f13459a, new h(this, iVar.f13460b, 0));
        }
    }
}
