package b2;

import java.util.HashSet;
import w7.a7;
public final class m0 {
    public int f3831a;
    public int f3832b;
    public Object f3833c;
    public Object d = null;
    public Object e;
    public Object f3834f;
    public Object f3835g;

    public m0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f3833c = hashSet;
        this.e = new HashSet();
        this.f3831a = 0;
        this.f3832b = 0;
        this.f3835g = new HashSet();
        hashSet.add(r9.r.a(cls));
        for (Class cls2 : clsArr) {
            a7.a(cls2, "Null interface");
            ((HashSet) this.f3833c).add(r9.r.a(cls2));
        }
    }

    public void a(r9.j jVar) {
        if (!((HashSet) this.f3833c).contains(jVar.f45134a)) {
            ((HashSet) this.e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public r9.a b() {
        boolean z10;
        if (((r9.d) this.f3834f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new r9.a((String) this.d, new HashSet((HashSet) this.f3833c), new HashSet((HashSet) this.e), this.f3831a, this.f3832b, (r9.d) this.f3834f, (HashSet) this.f3835g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z10;
        if (this.f3831a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f3831a = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
