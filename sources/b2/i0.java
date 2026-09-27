package b2;

import java.util.HashSet;
import w7.s6;
public final class i0 {
    public int f3014a;
    public int f3015b;
    public Object f3016c;
    public Object d = null;
    public Object e;
    public Object f3017f;
    public Object f3018g;

    public i0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f3016c = hashSet;
        this.e = new HashSet();
        this.f3014a = 0;
        this.f3015b = 0;
        this.f3018g = new HashSet();
        hashSet.add(q9.r.a(cls));
        for (Class cls2 : clsArr) {
            s6.a(cls2, "Null interface");
            ((HashSet) this.f3016c).add(q9.r.a(cls2));
        }
    }

    public void a(q9.j jVar) {
        if (!((HashSet) this.f3016c).contains(jVar.f41511a)) {
            ((HashSet) this.e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public q9.a b() {
        boolean z10;
        if (((q9.d) this.f3017f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new q9.a((String) this.d, new HashSet((HashSet) this.f3016c), new HashSet((HashSet) this.e), this.f3014a, this.f3015b, (q9.d) this.f3017f, (HashSet) this.f3018g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z10;
        if (this.f3014a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f3014a = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
