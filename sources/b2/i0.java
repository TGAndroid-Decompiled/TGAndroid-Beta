package b2;

import java.util.HashSet;
import w7.r6;
public final class i0 {
    public int f3337a;
    public int f3338b;
    public Object f3339c;
    public Object d = null;
    public Object f3340e;
    public Object f3341f;
    public Object f3342g;

    public i0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f3339c = hashSet;
        this.f3340e = new HashSet();
        this.f3337a = 0;
        this.f3338b = 0;
        this.f3342g = new HashSet();
        hashSet.add(q9.r.a(cls));
        for (Class cls2 : clsArr) {
            r6.a(cls2, "Null interface");
            ((HashSet) this.f3339c).add(q9.r.a(cls2));
        }
    }

    public void a(q9.j jVar) {
        if (!((HashSet) this.f3339c).contains(jVar.f46071a)) {
            ((HashSet) this.f3340e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public q9.a b() {
        boolean z10;
        if (((q9.d) this.f3341f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new q9.a((String) this.d, new HashSet((HashSet) this.f3339c), new HashSet((HashSet) this.f3340e), this.f3337a, this.f3338b, (q9.d) this.f3341f, (HashSet) this.f3342g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z10;
        if (this.f3337a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f3337a = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
