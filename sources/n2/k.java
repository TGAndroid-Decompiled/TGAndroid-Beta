package n2;

import e2.m0;
import ig.e2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.g0;
public final class k {
    public final int f17057a;
    public final g0 f17058b;
    public final CopyOnWriteArrayList f17059c;

    public k(CopyOnWriteArrayList copyOnWriteArrayList, int i10, g0 g0Var) {
        this.f17059c = copyOnWriteArrayList;
        this.f17057a = i10;
        this.f17058b = g0Var;
    }

    public final void a(oa.d dVar) {
        Iterator it = this.f17059c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17055a, new e2(this, jVar.f17056b, dVar, 13));
        }
    }

    public final void b() {
        Iterator it = this.f17059c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17055a, new i(this, jVar.f17056b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f17059c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17055a, new ah.o(this, jVar.f17056b, i10, 21));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f17059c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17055a, new e2(this, jVar.f17056b, exc, 12));
        }
    }

    public final void e() {
        Iterator it = this.f17059c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17055a, new i(this, jVar.f17056b, 0));
        }
    }
}
