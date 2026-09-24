package b2;

import java.util.HashSet;
import w7.s6;
public final class i0 {
    public int f3012a;
    public int f3013b;
    public Object f3014c;
    public Object d = null;
    public Object e;
    public Object f3015f;
    public Object f3016g;

    public i0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f3014c = hashSet;
        this.e = new HashSet();
        this.f3012a = 0;
        this.f3013b = 0;
        this.f3016g = new HashSet();
        hashSet.add(q9.r.a(cls));
        for (Class cls2 : clsArr) {
            s6.a(cls2, "Null interface");
            ((HashSet) this.f3014c).add(q9.r.a(cls2));
        }
    }

    public void a(q9.j jVar) {
        if (!((HashSet) this.f3014c).contains(jVar.f41467a)) {
            ((HashSet) this.e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public q9.a b() {
        boolean z10;
        if (((q9.d) this.f3015f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new q9.a((String) this.d, new HashSet((HashSet) this.f3014c), new HashSet((HashSet) this.e), this.f3012a, this.f3013b, (q9.d) this.f3015f, (HashSet) this.f3016g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z10;
        if (this.f3012a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f3012a = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
