package n2;

import ai.s1;
import e2.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.f0;
public final class j {
    public final int f15168a;
    public final f0 f15169b;
    public final CopyOnWriteArrayList f15170c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i10, f0 f0Var) {
        this.f15170c = copyOnWriteArrayList;
        this.f15168a = i10;
        this.f15169b = f0Var;
    }

    public final void a() {
        Iterator it = this.f15170c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f15166a, new h(this, iVar.f15167b, 2));
        }
    }

    public final void b() {
        Iterator it = this.f15170c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f15166a, new h(this, iVar.f15167b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f15170c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f15166a, new s1(this, iVar.f15167b, i10, 16));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f15170c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f15166a, new gg.t(this, iVar.f15167b, exc, 27));
        }
    }

    public final void e() {
        Iterator it = this.f15170c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f15166a, new h(this, iVar.f15167b, 0));
        }
    }
}
