package n2;

import ai.s1;
import e2.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.f0;
public final class k {
    public final int f15090a;
    public final f0 f15091b;
    public final CopyOnWriteArrayList f15092c;

    public k(CopyOnWriteArrayList copyOnWriteArrayList, int i10, f0 f0Var) {
        this.f15092c = copyOnWriteArrayList;
        this.f15090a = i10;
        this.f15091b = f0Var;
    }

    public final void a() {
        Iterator it = this.f15092c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f15088a, new i(this, jVar.f15089b, 2));
        }
    }

    public final void b() {
        Iterator it = this.f15092c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f15088a, new i(this, jVar.f15089b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f15092c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f15088a, new s1(this, jVar.f15089b, i10, 16));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f15092c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f15088a, new gg.t(this, jVar.f15089b, exc, 27));
        }
    }

    public final void e() {
        Iterator it = this.f15092c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f15088a, new i(this, jVar.f15089b, 0));
        }
    }
}
