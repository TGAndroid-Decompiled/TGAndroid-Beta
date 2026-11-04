package f6;

import java.util.HashSet;
import java.util.Iterator;
public final class e0 {
    public final c f11479a;

    public e0(c cVar) {
        this.f11479a = cVar;
    }

    public final void a() {
        Iterator it = new HashSet(this.f11479a.d).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).a();
        }
    }

    public final void b(int i3) {
        c cVar = this.f11479a;
        c.g(cVar, i3);
        cVar.d(i3);
        Iterator it = new HashSet(cVar.d).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).b(i3);
        }
    }

    public final void c() {
        Iterator it = new HashSet(this.f11479a.d).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).c();
        }
    }

    public final void d() {
        Iterator it = new HashSet(this.f11479a.d).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).d();
        }
    }

    public final void e() {
        Iterator it = new HashSet(this.f11479a.d).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).e();
        }
    }

    public final void f() {
        Iterator it = new HashSet(this.f11479a.d).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).f();
        }
    }
}
