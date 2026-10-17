package n2;

import e2.m0;
import ig.c2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.g0;
public final class k {
    public final int f17053a;
    public final g0 f17054b;
    public final CopyOnWriteArrayList f17055c;

    public k(CopyOnWriteArrayList copyOnWriteArrayList, int i10, g0 g0Var) {
        this.f17055c = copyOnWriteArrayList;
        this.f17053a = i10;
        this.f17054b = g0Var;
    }

    public final void a(oa.d dVar) {
        Iterator it = this.f17055c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17051a, new c2(this, jVar.f17052b, dVar, 13));
        }
    }

    public final void b() {
        Iterator it = this.f17055c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17051a, new i(this, jVar.f17052b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f17055c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17051a, new ah.o(this, jVar.f17052b, i10, 21));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f17055c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17051a, new c2(this, jVar.f17052b, exc, 12));
        }
    }

    public final void e() {
        Iterator it = this.f17055c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17051a, new i(this, jVar.f17052b, 0));
        }
    }
}
