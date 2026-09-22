package b2;

import java.util.HashSet;
import w7.r6;
public final class i0 {
    public int f3017a;
    public int f3018b;
    public Object f3019c;
    public Object d = null;
    public Object e;
    public Object f3020f;
    public Object f3021g;

    public i0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f3019c = hashSet;
        this.e = new HashSet();
        this.f3017a = 0;
        this.f3018b = 0;
        this.f3021g = new HashSet();
        hashSet.add(q9.r.a(cls));
        for (Class cls2 : clsArr) {
            r6.a(cls2, "Null interface");
            ((HashSet) this.f3019c).add(q9.r.a(cls2));
        }
    }

    public void a(q9.j jVar) {
        if (!((HashSet) this.f3019c).contains(jVar.f41188a)) {
            ((HashSet) this.e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public q9.a b() {
        boolean z10;
        if (((q9.d) this.f3020f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new q9.a((String) this.d, new HashSet((HashSet) this.f3019c), new HashSet((HashSet) this.e), this.f3017a, this.f3018b, (q9.d) this.f3020f, (HashSet) this.f3021g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z10;
        if (this.f3017a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f3017a = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
