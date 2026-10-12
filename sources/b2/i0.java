package b2;

import java.util.HashSet;
import w7.q6;
public final class i0 {
    public int f3335a;
    public int f3336b;
    public Object f3337c;
    public Object d = null;
    public Object f3338e;
    public Object f3339f;
    public Object f3340g;

    public i0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f3337c = hashSet;
        this.f3338e = new HashSet();
        this.f3335a = 0;
        this.f3336b = 0;
        this.f3340g = new HashSet();
        hashSet.add(q9.r.a(cls));
        for (Class cls2 : clsArr) {
            q6.a(cls2, "Null interface");
            ((HashSet) this.f3337c).add(q9.r.a(cls2));
        }
    }

    public void a(q9.j jVar) {
        if (!((HashSet) this.f3337c).contains(jVar.f45964a)) {
            ((HashSet) this.f3338e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public q9.a b() {
        boolean z10;
        if (((q9.d) this.f3339f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new q9.a((String) this.d, new HashSet((HashSet) this.f3337c), new HashSet((HashSet) this.f3338e), this.f3335a, this.f3336b, (q9.d) this.f3339f, (HashSet) this.f3340g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z10;
        if (this.f3335a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f3335a = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
