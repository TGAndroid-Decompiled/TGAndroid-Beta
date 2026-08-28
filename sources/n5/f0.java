package n5;

import java.util.HashSet;
import java.util.Iterator;
public final class f0 {
    public final c f18491a;

    public f0(c cVar) {
        this.f18491a = cVar;
    }

    public final void a() {
        Iterator it = new HashSet(this.f18491a.d).iterator();
        while (it.hasNext()) {
            ((f0) it.next()).a();
        }
    }

    public final void b(int i9) {
        c cVar = this.f18491a;
        c.g(cVar, i9);
        cVar.d(i9);
        Iterator it = new HashSet(cVar.d).iterator();
        while (it.hasNext()) {
            ((f0) it.next()).b(i9);
        }
    }

    public final void c() {
        Iterator it = new HashSet(this.f18491a.d).iterator();
        while (it.hasNext()) {
            ((f0) it.next()).c();
        }
    }

    public final void d() {
        Iterator it = new HashSet(this.f18491a.d).iterator();
        while (it.hasNext()) {
            ((f0) it.next()).d();
        }
    }

    public final void e() {
        Iterator it = new HashSet(this.f18491a.d).iterator();
        while (it.hasNext()) {
            ((f0) it.next()).e();
        }
    }

    public final void f() {
        Iterator it = new HashSet(this.f18491a.d).iterator();
        while (it.hasNext()) {
            ((f0) it.next()).f();
        }
    }
}
