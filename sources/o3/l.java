package o3;

import h5.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import lh.p6;
public final class l {
    public final int f16269a;
    public final o4.v f16270b;
    public final CopyOnWriteArrayList f16271c;

    public l(CopyOnWriteArrayList copyOnWriteArrayList, int i10, o4.v vVar) {
        this.f16271c = copyOnWriteArrayList;
        this.f16269a = i10;
        this.f16270b = vVar;
    }

    public final void a() {
        Iterator it = this.f16271c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.f16267a, new j(this, kVar.f16268b, 2));
        }
    }

    public final void b() {
        Iterator it = this.f16271c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.f16267a, new j(this, kVar.f16268b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f16271c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.f16267a, new ah.a(this, kVar.f16268b, i10, 15));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f16271c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.f16267a, new p6(this, kVar.f16268b, exc, 10));
        }
    }

    public final void e() {
        Iterator it = this.f16271c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.f16267a, new j(this, kVar.f16268b, 0));
        }
    }
}
