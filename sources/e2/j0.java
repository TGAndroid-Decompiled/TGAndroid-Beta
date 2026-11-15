package e2;

import c8.tc;
import java.util.HashSet;
public final class j0 {
    public int f10124a;
    public int f10125b;
    public Object f10126c;
    public Object d = null;
    public Object f10127e;
    public Object f10128f;
    public Object f10129g;

    public j0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f10126c = hashSet;
        this.f10127e = new HashSet();
        this.f10124a = 0;
        this.f10125b = 0;
        this.f10129g = new HashSet();
        hashSet.add(u9.q.a(cls));
        for (Class cls2 : clsArr) {
            tc.a(cls2, "Null interface");
            ((HashSet) this.f10126c).add(u9.q.a(cls2));
        }
    }

    public void a(u9.i iVar) {
        if (!((HashSet) this.f10126c).contains(iVar.f57981a)) {
            ((HashSet) this.f10127e).add(iVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public u9.a b() {
        boolean z10;
        if (((u9.d) this.f10128f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new u9.a((String) this.d, new HashSet((HashSet) this.f10126c), new HashSet((HashSet) this.f10127e), this.f10124a, this.f10125b, (u9.d) this.f10128f, (HashSet) this.f10129g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i7) {
        boolean z10;
        if (this.f10124a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f10124a = i7;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
