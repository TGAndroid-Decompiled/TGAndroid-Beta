package o3;

import h5.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import mh.p6;
public final class l {
    public final int f16412a;
    public final o4.v f16413b;
    public final CopyOnWriteArrayList f16414c;

    public l(CopyOnWriteArrayList copyOnWriteArrayList, int i10, o4.v vVar) {
        this.f16414c = copyOnWriteArrayList;
        this.f16412a = i10;
        this.f16413b = vVar;
    }

    public final void a() {
        Iterator it = this.f16414c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.f16410a, new j(this, kVar.f16411b, 2));
        }
    }

    public final void b() {
        Iterator it = this.f16414c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.f16410a, new j(this, kVar.f16411b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f16414c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.f16410a, new bh.a(this, kVar.f16411b, i10, 12));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f16414c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.f16410a, new p6(this, kVar.f16411b, exc, 2));
        }
    }

    public final void e() {
        Iterator it = this.f16414c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.f16410a, new j(this, kVar.f16411b, 0));
        }
    }
}
