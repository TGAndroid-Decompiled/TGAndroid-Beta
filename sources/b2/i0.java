package b2;

import java.util.HashSet;
import w7.o6;
public final class i0 {
    public int f2064a;
    public int f2065b;
    public Object f2066c;
    public Object d = null;
    public Object f2067e;
    public Object f2068f;
    public Object f2069g;

    public i0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f2066c = hashSet;
        this.f2067e = new HashSet();
        this.f2064a = 0;
        this.f2065b = 0;
        this.f2069g = new HashSet();
        hashSet.add(q9.r.a(cls));
        for (Class cls2 : clsArr) {
            o6.a(cls2, "Null interface");
            ((HashSet) this.f2066c).add(q9.r.a(cls2));
        }
    }

    public void a(q9.j jVar) {
        if (!((HashSet) this.f2066c).contains(jVar.f44229a)) {
            ((HashSet) this.f2067e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public q9.a b() {
        boolean z10;
        if (((q9.d) this.f2068f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new q9.a((String) this.d, new HashSet((HashSet) this.f2066c), new HashSet((HashSet) this.f2067e), this.f2064a, this.f2065b, (q9.d) this.f2068f, (HashSet) this.f2069g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z10;
        if (this.f2064a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f2064a = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
