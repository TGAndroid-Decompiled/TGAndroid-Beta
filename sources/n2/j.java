package n2;

import ai.s1;
import e2.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.f0;
public final class j {
    public final int f16518a;
    public final f0 f16519b;
    public final CopyOnWriteArrayList f16520c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i10, f0 f0Var) {
        this.f16520c = copyOnWriteArrayList;
        this.f16518a = i10;
        this.f16519b = f0Var;
    }

    public final void a() {
        Iterator it = this.f16520c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.T(iVar.f16516a, new h(this, iVar.f16517b, 2));
        }
    }

    public final void b() {
        Iterator it = this.f16520c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.T(iVar.f16516a, new h(this, iVar.f16517b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f16520c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.T(iVar.f16516a, new s1(this, iVar.f16517b, i10, 16));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f16520c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.T(iVar.f16516a, new gg.t(this, iVar.f16517b, exc, 27));
        }
    }

    public final void e() {
        Iterator it = this.f16520c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.T(iVar.f16516a, new h(this, iVar.f16517b, 0));
        }
    }
}
