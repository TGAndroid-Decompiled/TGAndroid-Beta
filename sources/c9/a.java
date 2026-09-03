package c9;

import j7.j5;
import java.util.HashSet;
public final class a {
    public Object f2166a = null;
    public int f2167b;
    public int f2168c;
    public Object d;
    public Object e;
    public Object f2169f;
    public Object f2170g;

    public a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.f2167b = 0;
        this.f2168c = 0;
        this.f2169f = new HashSet();
        hashSet.add(u.a(cls));
        for (Class cls2 : clsArr) {
            j5.a(cls2, "Null interface");
            ((HashSet) this.d).add(u.a(cls2));
        }
    }

    public void a(m mVar) {
        if (!((HashSet) this.d).contains(mVar.f2194a)) {
            ((HashSet) this.e).add(mVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public b b() {
        boolean z4;
        if (((f) this.f2170g) != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return new b((String) this.f2166a, new HashSet((HashSet) this.d), new HashSet((HashSet) this.e), this.f2167b, this.f2168c, (f) this.f2170g, (HashSet) this.f2169f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z4;
        if (this.f2167b == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.f2167b = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
