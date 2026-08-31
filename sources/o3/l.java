package o3;

import h5.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import mh.p6;
public final class l {
    public final int f16410a;
    public final o4.v f16411b;
    public final CopyOnWriteArrayList f16412c;

    public l(CopyOnWriteArrayList copyOnWriteArrayList, int i10, o4.v vVar) {
        this.f16412c = copyOnWriteArrayList;
        this.f16410a = i10;
        this.f16411b = vVar;
    }

    public final void a() {
        Iterator it = this.f16412c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.f16408a, new j(this, kVar.f16409b, 2));
        }
    }

    public final void b() {
        Iterator it = this.f16412c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.f16408a, new j(this, kVar.f16409b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f16412c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.f16408a, new bh.a(this, kVar.f16409b, i10, 12));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f16412c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.f16408a, new p6(this, kVar.f16409b, exc, 2));
        }
    }

    public final void e() {
        Iterator it = this.f16412c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.f16408a, new j(this, kVar.f16409b, 0));
        }
    }
}
