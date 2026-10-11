package n2;

import ai.s1;
import e2.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.f0;
public final class j {
    public final int f16600a;
    public final f0 f16601b;
    public final CopyOnWriteArrayList f16602c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i10, f0 f0Var) {
        this.f16602c = copyOnWriteArrayList;
        this.f16600a = i10;
        this.f16601b = f0Var;
    }

    public final void a() {
        Iterator it = this.f16602c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.T(iVar.f16598a, new h(this, iVar.f16599b, 2));
        }
    }

    public final void b() {
        Iterator it = this.f16602c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.T(iVar.f16598a, new h(this, iVar.f16599b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f16602c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.T(iVar.f16598a, new s1(this, iVar.f16599b, i10, 16));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f16602c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.T(iVar.f16598a, new gg.t(this, iVar.f16599b, exc, 28));
        }
    }

    public final void e() {
        Iterator it = this.f16602c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.T(iVar.f16598a, new h(this, iVar.f16599b, 0));
        }
    }
}
