package n2;

import ai.s1;
import e2.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.f0;
public final class j {
    public final int f16564a;
    public final f0 f16565b;
    public final CopyOnWriteArrayList f16566c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i10, f0 f0Var) {
        this.f16566c = copyOnWriteArrayList;
        this.f16564a = i10;
        this.f16565b = f0Var;
    }

    public final void a() {
        Iterator it = this.f16566c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.T(iVar.f16562a, new h(this, iVar.f16563b, 2));
        }
    }

    public final void b() {
        Iterator it = this.f16566c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.T(iVar.f16562a, new h(this, iVar.f16563b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f16566c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.T(iVar.f16562a, new s1(this, iVar.f16563b, i10, 16));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f16566c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.T(iVar.f16562a, new gg.t(this, iVar.f16563b, exc, 28));
        }
    }

    public final void e() {
        Iterator it = this.f16566c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.T(iVar.f16562a, new h(this, iVar.f16563b, 0));
        }
    }
}
