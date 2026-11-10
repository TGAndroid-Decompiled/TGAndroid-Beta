package e2;

import c8.tc;
import java.util.HashSet;
public final class j0 {
    public int f10293a;
    public int f10294b;
    public Object f10295c;
    public Object d = null;
    public Object f10296e;
    public Object f10297f;
    public Object f10298g;

    public j0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f10295c = hashSet;
        this.f10296e = new HashSet();
        this.f10293a = 0;
        this.f10294b = 0;
        this.f10298g = new HashSet();
        hashSet.add(u9.r.a(cls));
        for (Class cls2 : clsArr) {
            tc.a(cls2, "Null interface");
            ((HashSet) this.f10295c).add(u9.r.a(cls2));
        }
    }

    public void a(u9.j jVar) {
        if (!((HashSet) this.f10295c).contains(jVar.f56485a)) {
            ((HashSet) this.f10296e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public u9.a b() {
        boolean z9;
        if (((u9.d) this.f10297f) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return new u9.a((String) this.d, new HashSet((HashSet) this.f10295c), new HashSet((HashSet) this.f10296e), this.f10293a, this.f10294b, (u9.d) this.f10297f, (HashSet) this.f10298g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i7) {
        boolean z9;
        if (this.f10293a == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.f10293a = i7;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
