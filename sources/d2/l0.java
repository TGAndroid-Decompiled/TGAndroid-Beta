package d2;

import java.util.HashSet;
public final class l0 {
    public int f8173a;
    public int f8174b;
    public Object f8175c;
    public Object d = null;
    public Object f8176e;
    public Object f8177f;
    public Object f8178g;

    public l0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f8175c = hashSet;
        this.f8176e = new HashSet();
        this.f8173a = 0;
        this.f8174b = 0;
        this.f8178g = new HashSet();
        hashSet.add(t9.r.a(cls));
        for (Class cls2 : clsArr) {
            x7.b0.a(cls2, "Null interface");
            ((HashSet) this.f8175c).add(t9.r.a(cls2));
        }
    }

    public void a(t9.j jVar) {
        if (!((HashSet) this.f8175c).contains(jVar.f55061a)) {
            ((HashSet) this.f8176e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public t9.a b() {
        boolean z10;
        if (((t9.d) this.f8177f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new t9.a((String) this.d, new HashSet((HashSet) this.f8175c), new HashSet((HashSet) this.f8176e), this.f8173a, this.f8174b, (t9.d) this.f8177f, (HashSet) this.f8178g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i3) {
        boolean z10;
        if (this.f8173a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f8173a = i3;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
