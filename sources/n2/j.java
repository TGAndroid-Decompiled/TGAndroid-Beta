package n2;

import ai.s1;
import e2.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.f0;
public final class j {
    public final int f15142a;
    public final f0 f15143b;
    public final CopyOnWriteArrayList f15144c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i10, f0 f0Var) {
        this.f15144c = copyOnWriteArrayList;
        this.f15142a = i10;
        this.f15143b = f0Var;
    }

    public final void a() {
        Iterator it = this.f15144c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f15140a, new h(this, iVar.f15141b, 2));
        }
    }

    public final void b() {
        Iterator it = this.f15144c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f15140a, new h(this, iVar.f15141b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f15144c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f15140a, new s1(this, iVar.f15141b, i10, 16));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f15144c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f15140a, new gg.t(this, iVar.f15141b, exc, 27));
        }
    }

    public final void e() {
        Iterator it = this.f15144c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f15140a, new h(this, iVar.f15141b, 0));
        }
    }
}
