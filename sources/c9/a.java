package c9;

import j7.k5;
import java.util.HashSet;
public final class a {
    public Object f2330a = null;
    public int f2331b;
    public int f2332c;
    public Object d;
    public Object f2333e;
    public Object f2334f;
    public Object f2335g;

    public a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.f2333e = new HashSet();
        this.f2331b = 0;
        this.f2332c = 0;
        this.f2334f = new HashSet();
        hashSet.add(t.a(cls));
        for (Class cls2 : clsArr) {
            k5.a(cls2, "Null interface");
            ((HashSet) this.d).add(t.a(cls2));
        }
    }

    public void a(l lVar) {
        if (!((HashSet) this.d).contains(lVar.f2360a)) {
            ((HashSet) this.f2333e).add(lVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public b b() {
        boolean z4;
        if (((e) this.f2335g) != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return new b((String) this.f2330a, new HashSet((HashSet) this.d), new HashSet((HashSet) this.f2333e), this.f2331b, this.f2332c, (e) this.f2335g, (HashSet) this.f2334f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z4;
        if (this.f2331b == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.f2331b = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
