package b2;

import java.util.HashSet;
import w7.c7;
public final class n0 {
    public int f2224a;
    public int f2225b;
    public Object f2226c;
    public Object d = null;
    public Object e;
    public Object f2227f;
    public Object f2228g;

    public n0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f2226c = hashSet;
        this.e = new HashSet();
        this.f2224a = 0;
        this.f2225b = 0;
        this.f2228g = new HashSet();
        hashSet.add(r9.r.a(cls));
        for (Class cls2 : clsArr) {
            c7.a(cls2, "Null interface");
            ((HashSet) this.f2226c).add(r9.r.a(cls2));
        }
    }

    public void a(r9.j jVar) {
        if (!((HashSet) this.f2226c).contains(jVar.f43806a)) {
            ((HashSet) this.e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public r9.a b() {
        boolean z10;
        if (((r9.d) this.f2227f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new r9.a((String) this.d, new HashSet((HashSet) this.f2226c), new HashSet((HashSet) this.e), this.f2224a, this.f2225b, (r9.d) this.f2227f, (HashSet) this.f2228g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z10;
        if (this.f2224a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f2224a = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
