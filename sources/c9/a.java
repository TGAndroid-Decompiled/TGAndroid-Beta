package c9;

import j7.j5;
import java.util.HashSet;
public final class a {
    public Object f2143a = null;
    public int f2144b;
    public int f2145c;
    public Object d;
    public Object e;
    public Object f2146f;
    public Object f2147g;

    public a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.f2144b = 0;
        this.f2145c = 0;
        this.f2146f = new HashSet();
        hashSet.add(t.a(cls));
        for (Class cls2 : clsArr) {
            j5.a(cls2, "Null interface");
            ((HashSet) this.d).add(t.a(cls2));
        }
    }

    public void a(l lVar) {
        if (!((HashSet) this.d).contains(lVar.f2170a)) {
            ((HashSet) this.e).add(lVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public b b() {
        boolean z4;
        if (((e) this.f2147g) != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return new b((String) this.f2143a, new HashSet((HashSet) this.d), new HashSet((HashSet) this.e), this.f2144b, this.f2145c, (e) this.f2147g, (HashSet) this.f2146f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z4;
        if (this.f2144b == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.f2144b = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
