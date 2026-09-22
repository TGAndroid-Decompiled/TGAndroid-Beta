package b2;

import java.util.HashSet;
import w7.s6;
public final class i0 {
    public int f3019a;
    public int f3020b;
    public Object f3021c;
    public Object d = null;
    public Object e;
    public Object f3022f;
    public Object f3023g;

    public i0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f3021c = hashSet;
        this.e = new HashSet();
        this.f3019a = 0;
        this.f3020b = 0;
        this.f3023g = new HashSet();
        hashSet.add(q9.s.a(cls));
        for (Class cls2 : clsArr) {
            s6.a(cls2, "Null interface");
            ((HashSet) this.f3021c).add(q9.s.a(cls2));
        }
    }

    public void a(q9.j jVar) {
        if (!((HashSet) this.f3021c).contains(jVar.f41515a)) {
            ((HashSet) this.e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public q9.a b() {
        boolean z10;
        if (((q9.d) this.f3022f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new q9.a((String) this.d, new HashSet((HashSet) this.f3021c), new HashSet((HashSet) this.e), this.f3019a, this.f3020b, (q9.d) this.f3022f, (HashSet) this.f3023g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z10;
        if (this.f3019a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f3019a = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
