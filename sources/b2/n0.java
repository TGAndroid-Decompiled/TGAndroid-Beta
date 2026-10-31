package b2;

import java.util.HashSet;
import w7.g7;
public final class n0 {
    public int f2123a;
    public int f2124b;
    public Object f2125c;
    public Object d = null;
    public Object e;
    public Object f2126f;
    public Object f2127g;

    public n0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f2125c = hashSet;
        this.e = new HashSet();
        this.f2123a = 0;
        this.f2124b = 0;
        this.f2127g = new HashSet();
        hashSet.add(r9.r.a(cls));
        for (Class cls2 : clsArr) {
            g7.a(cls2, "Null interface");
            ((HashSet) this.f2125c).add(r9.r.a(cls2));
        }
    }

    public void a(r9.j jVar) {
        if (!((HashSet) this.f2125c).contains(jVar.f46439a)) {
            ((HashSet) this.e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public r9.a b() {
        boolean z10;
        if (((r9.d) this.f2126f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new r9.a((String) this.d, new HashSet((HashSet) this.f2125c), new HashSet((HashSet) this.e), this.f2123a, this.f2124b, (r9.d) this.f2126f, (HashSet) this.f2127g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z10;
        if (this.f2123a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f2123a = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
