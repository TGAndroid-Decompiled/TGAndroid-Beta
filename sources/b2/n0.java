package b2;

import java.util.HashSet;
import w7.f7;
public final class n0 {
    public int f2220a;
    public int f2221b;
    public Object f2222c;
    public Object d = null;
    public Object e;
    public Object f2223f;
    public Object f2224g;

    public n0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f2222c = hashSet;
        this.e = new HashSet();
        this.f2220a = 0;
        this.f2221b = 0;
        this.f2224g = new HashSet();
        hashSet.add(r9.r.a(cls));
        for (Class cls2 : clsArr) {
            f7.a(cls2, "Null interface");
            ((HashSet) this.f2222c).add(r9.r.a(cls2));
        }
    }

    public void a(r9.j jVar) {
        if (!((HashSet) this.f2222c).contains(jVar.f44047a)) {
            ((HashSet) this.e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public r9.a b() {
        boolean z10;
        if (((r9.d) this.f2223f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new r9.a((String) this.d, new HashSet((HashSet) this.f2222c), new HashSet((HashSet) this.e), this.f2220a, this.f2221b, (r9.d) this.f2223f, (HashSet) this.f2224g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z10;
        if (this.f2220a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f2220a = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
