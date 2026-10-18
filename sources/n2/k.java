package n2;

import e2.m0;
import ig.e2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.f0;
public final class k {
    public final int f17060a;
    public final f0 f17061b;
    public final CopyOnWriteArrayList f17062c;

    public k(CopyOnWriteArrayList copyOnWriteArrayList, int i10, f0 f0Var) {
        this.f17062c = copyOnWriteArrayList;
        this.f17060a = i10;
        this.f17061b = f0Var;
    }

    public final void a(oa.d dVar) {
        Iterator it = this.f17062c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17058a, new e2(this, jVar.f17059b, dVar, 13));
        }
    }

    public final void b() {
        Iterator it = this.f17062c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17058a, new i(this, jVar.f17059b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f17062c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17058a, new ah.o(this, jVar.f17059b, i10, 21));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f17062c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17058a, new e2(this, jVar.f17059b, exc, 12));
        }
    }

    public final void e() {
        Iterator it = this.f17062c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17058a, new i(this, jVar.f17059b, 0));
        }
    }
}
