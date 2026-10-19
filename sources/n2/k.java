package n2;

import e2.m0;
import ig.e2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.g0;
public final class k {
    public final int f17059a;
    public final g0 f17060b;
    public final CopyOnWriteArrayList f17061c;

    public k(CopyOnWriteArrayList copyOnWriteArrayList, int i10, g0 g0Var) {
        this.f17061c = copyOnWriteArrayList;
        this.f17059a = i10;
        this.f17060b = g0Var;
    }

    public final void a(oa.d dVar) {
        Iterator it = this.f17061c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17057a, new e2(this, jVar.f17058b, dVar, 13));
        }
    }

    public final void b() {
        Iterator it = this.f17061c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17057a, new i(this, jVar.f17058b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f17061c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17057a, new ah.o(this, jVar.f17058b, i10, 21));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f17061c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17057a, new e2(this, jVar.f17058b, exc, 12));
        }
    }

    public final void e() {
        Iterator it = this.f17061c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17057a, new i(this, jVar.f17058b, 0));
        }
    }
}
