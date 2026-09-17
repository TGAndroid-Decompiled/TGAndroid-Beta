package d6;

import java.util.HashSet;
import java.util.Iterator;
public final class d0 {
    public final c f6636a;

    public d0(c cVar) {
        this.f6636a = cVar;
    }

    public final void a() {
        Iterator it = new HashSet(this.f6636a.d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).a();
        }
    }

    public final void b(int i10) {
        c cVar = this.f6636a;
        c.g(cVar, i10);
        cVar.d(i10);
        Iterator it = new HashSet(cVar.d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).b(i10);
        }
    }

    public final void c() {
        Iterator it = new HashSet(this.f6636a.d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).c();
        }
    }

    public final void d() {
        Iterator it = new HashSet(this.f6636a.d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).d();
        }
    }

    public final void e() {
        Iterator it = new HashSet(this.f6636a.d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).e();
        }
    }

    public final void f() {
        Iterator it = new HashSet(this.f6636a.d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).f();
        }
    }
}
