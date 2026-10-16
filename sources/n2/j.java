package n2;

import e2.m0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.g0;
public final class j {
    public final int f15674a;
    public final g0 f15675b;
    public final CopyOnWriteArrayList f15676c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i10, g0 g0Var) {
        this.f15676c = copyOnWriteArrayList;
        this.f15674a = i10;
        this.f15675b = g0Var;
    }

    public final void a(oa.d dVar) {
        Iterator it = this.f15676c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f15672a, new hg.t(this, iVar.f15673b, dVar, 28));
        }
    }

    public final void b() {
        Iterator it = this.f15676c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f15672a, new h(this, iVar.f15673b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f15676c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f15672a, new ah.o(this, iVar.f15673b, i10, 17));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f15676c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f15672a, new hg.t(this, iVar.f15673b, exc, 27));
        }
    }

    public final void e() {
        Iterator it = this.f15676c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            m0.W(iVar.f15672a, new h(this, iVar.f15673b, 0));
        }
    }
}
