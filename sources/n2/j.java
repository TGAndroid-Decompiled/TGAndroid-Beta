package n2;

import bi.g3;
import e2.d0;
import gg.a0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.g0;
public final class j {
    public final int f13734a;
    public final g0 f13735b;
    public final CopyOnWriteArrayList f13736c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i10, g0 g0Var) {
        this.f13736c = copyOnWriteArrayList;
        this.f13734a = i10;
        this.f13735b = g0Var;
    }

    public final void a() {
        Iterator it = this.f13736c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f13732a, new h(this, iVar.f13733b, 2));
        }
    }

    public final void b() {
        Iterator it = this.f13736c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f13732a, new h(this, iVar.f13733b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f13736c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f13732a, new g3(this, iVar.f13733b, i10, 14));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f13736c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f13732a, new a0(this, iVar.f13733b, exc, 16));
        }
    }

    public final void e() {
        Iterator it = this.f13736c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.f13732a, new h(this, iVar.f13733b, 0));
        }
    }
}
