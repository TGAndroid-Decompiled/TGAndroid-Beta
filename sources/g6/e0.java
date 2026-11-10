package g6;

import java.util.HashSet;
import java.util.Iterator;
public final class e0 {
    public final c f13558a;

    public e0(c cVar) {
        this.f13558a = cVar;
    }

    public final void a() {
        Iterator it = new HashSet(this.f13558a.d).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).a();
        }
    }

    public final void b(int i7) {
        c cVar = this.f13558a;
        c.g(cVar, i7);
        cVar.d(i7);
        Iterator it = new HashSet(cVar.d).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).b(i7);
        }
    }

    public final void c() {
        Iterator it = new HashSet(this.f13558a.d).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).c();
        }
    }

    public final void d() {
        Iterator it = new HashSet(this.f13558a.d).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).d();
        }
    }

    public final void e() {
        Iterator it = new HashSet(this.f13558a.d).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).e();
        }
    }

    public final void f() {
        Iterator it = new HashSet(this.f13558a.d).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).f();
        }
    }
}
