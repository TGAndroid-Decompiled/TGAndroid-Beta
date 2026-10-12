package n2;

import e2.m0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.g0;
public final class k {
    public final int f15963a;
    public final g0 f15964b;
    public final CopyOnWriteArrayList f15965c;

    public k(CopyOnWriteArrayList copyOnWriteArrayList, int i10, g0 g0Var) {
        this.f15965c = copyOnWriteArrayList;
        this.f15963a = i10;
        this.f15964b = g0Var;
    }

    public final void a(oa.d dVar) {
        Iterator it = this.f15965c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f15961a, new h(this, jVar.f15962b, dVar, 1));
        }
    }

    public final void b() {
        Iterator it = this.f15965c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f15961a, new i(this, jVar.f15962b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f15965c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f15961a, new ah.o(this, jVar.f15962b, i10, 17));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f15965c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f15961a, new h(this, jVar.f15962b, exc, 0));
        }
    }

    public final void e() {
        Iterator it = this.f15965c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f15961a, new i(this, jVar.f15962b, 0));
        }
    }
}
