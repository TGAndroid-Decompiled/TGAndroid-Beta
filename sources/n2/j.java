package n2;

import ai.s1;
import e2.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.f0;
public final class j {
    public final int f14915a;
    public final f0 f14916b;
    public final CopyOnWriteArrayList f14917c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i10, f0 f0Var) {
        this.f14917c = copyOnWriteArrayList;
        this.f14915a = i10;
        this.f14916b = f0Var;
    }

    public final void a() {
        Iterator it = this.f14917c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f14913a, new h(this, iVar.f14914b, 2));
        }
    }

    public final void b() {
        Iterator it = this.f14917c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f14913a, new h(this, iVar.f14914b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f14917c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f14913a, new s1(this, iVar.f14914b, i10, 16));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f14917c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f14913a, new gg.t(this, iVar.f14914b, exc, 24));
        }
    }

    public final void e() {
        Iterator it = this.f14917c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f14913a, new h(this, iVar.f14914b, 0));
        }
    }
}
