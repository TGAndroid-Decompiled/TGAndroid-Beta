package n2;

import e2.m0;
import ig.d2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.h0;
public final class k {
    public final int f17120a;
    public final h0 f17121b;
    public final CopyOnWriteArrayList f17122c;

    public k(CopyOnWriteArrayList copyOnWriteArrayList, int i10, h0 h0Var) {
        this.f17122c = copyOnWriteArrayList;
        this.f17120a = i10;
        this.f17121b = h0Var;
    }

    public final void a(oa.d dVar) {
        Iterator it = this.f17122c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17118a, new d2(this, jVar.f17119b, dVar, 13));
        }
    }

    public final void b() {
        Iterator it = this.f17122c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17118a, new i(this, jVar.f17119b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f17122c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17118a, new ah.o(this, jVar.f17119b, i10, 21));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f17122c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17118a, new d2(this, jVar.f17119b, exc, 12));
        }
    }

    public final void e() {
        Iterator it = this.f17122c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.f17118a, new i(this, jVar.f17119b, 0));
        }
    }
}
