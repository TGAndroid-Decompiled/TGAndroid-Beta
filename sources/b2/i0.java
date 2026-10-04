package b2;

import java.util.HashSet;
import w7.t6;
public final class i0 {
    public int f3258a;
    public int f3259b;
    public Object f3260c;
    public Object d = null;
    public Object f3261e;
    public Object f3262f;
    public Object f3263g;

    public i0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f3260c = hashSet;
        this.f3261e = new HashSet();
        this.f3258a = 0;
        this.f3259b = 0;
        this.f3263g = new HashSet();
        hashSet.add(q9.r.a(cls));
        for (Class cls2 : clsArr) {
            t6.a(cls2, "Null interface");
            ((HashSet) this.f3260c).add(q9.r.a(cls2));
        }
    }

    public void a(q9.j jVar) {
        if (!((HashSet) this.f3260c).contains(jVar.f44864a)) {
            ((HashSet) this.f3261e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public q9.a b() {
        boolean z10;
        if (((q9.d) this.f3262f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new q9.a((String) this.d, new HashSet((HashSet) this.f3260c), new HashSet((HashSet) this.f3261e), this.f3258a, this.f3259b, (q9.d) this.f3262f, (HashSet) this.f3263g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z10;
        if (this.f3258a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f3258a = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
