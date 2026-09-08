package b2;

import java.util.HashSet;
import w7.o6;
public final class i0 {
    public int f2091a;
    public int f2092b;
    public Object f2093c;
    public Object d = null;
    public Object f2094e;
    public Object f2095f;
    public Object f2096g;

    public i0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f2093c = hashSet;
        this.f2094e = new HashSet();
        this.f2091a = 0;
        this.f2092b = 0;
        this.f2096g = new HashSet();
        hashSet.add(q9.r.a(cls));
        for (Class cls2 : clsArr) {
            o6.a(cls2, "Null interface");
            ((HashSet) this.f2093c).add(q9.r.a(cls2));
        }
    }

    public void a(q9.j jVar) {
        if (!((HashSet) this.f2093c).contains(jVar.f44257a)) {
            ((HashSet) this.f2094e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public q9.a b() {
        boolean z10;
        if (((q9.d) this.f2095f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new q9.a((String) this.d, new HashSet((HashSet) this.f2093c), new HashSet((HashSet) this.f2094e), this.f2091a, this.f2092b, (q9.d) this.f2095f, (HashSet) this.f2096g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z10;
        if (this.f2091a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f2091a = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
