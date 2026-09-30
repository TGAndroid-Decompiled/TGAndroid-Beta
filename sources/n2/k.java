package n2;

import ai.s1;
import e2.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.f0;
public final class k {
    public final int f15149a;
    public final f0 f15150b;
    public final CopyOnWriteArrayList f15151c;

    public k(CopyOnWriteArrayList copyOnWriteArrayList, int i10, f0 f0Var) {
        this.f15151c = copyOnWriteArrayList;
        this.f15149a = i10;
        this.f15150b = f0Var;
    }

    public final void a() {
        Iterator it = this.f15151c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f15147a, new i(this, jVar.f15148b, 2));
        }
    }

    public final void b() {
        Iterator it = this.f15151c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f15147a, new i(this, jVar.f15148b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f15151c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f15147a, new s1(this, jVar.f15148b, i10, 16));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f15151c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f15147a, new gg.t(this, jVar.f15148b, exc, 27));
        }
    }

    public final void e() {
        Iterator it = this.f15151c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f15147a, new i(this, jVar.f15148b, 0));
        }
    }
}
