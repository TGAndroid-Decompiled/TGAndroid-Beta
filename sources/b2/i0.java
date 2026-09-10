package b2;

import java.util.HashSet;
import w7.r6;
public final class i0 {
    public int f1713a;
    public int f1714b;
    public Object f1715c;
    public Object d = null;
    public Object e;
    public Object f1716f;
    public Object f1717g;

    public i0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f1715c = hashSet;
        this.e = new HashSet();
        this.f1713a = 0;
        this.f1714b = 0;
        this.f1717g = new HashSet();
        hashSet.add(q9.r.a(cls));
        for (Class cls2 : clsArr) {
            r6.a(cls2, "Null interface");
            ((HashSet) this.f1715c).add(q9.r.a(cls2));
        }
    }

    public void a(q9.j jVar) {
        if (!((HashSet) this.f1715c).contains(jVar.f40569a)) {
            ((HashSet) this.e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public q9.a b() {
        boolean z10;
        if (((q9.d) this.f1716f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new q9.a((String) this.d, new HashSet((HashSet) this.f1715c), new HashSet((HashSet) this.e), this.f1713a, this.f1714b, (q9.d) this.f1716f, (HashSet) this.f1717g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z10;
        if (this.f1713a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f1713a = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
