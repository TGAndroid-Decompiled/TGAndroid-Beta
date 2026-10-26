package b2;

import java.util.HashSet;
public final class n0 {
    public int f3287a;
    public int f3288b;
    public Object f3289c;
    public Object d = null;
    public Object e;
    public Object f3290f;
    public Object f3291g;

    public n0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f3289c = hashSet;
        this.e = new HashSet();
        this.f3287a = 0;
        this.f3288b = 0;
        this.f3291g = new HashSet();
        hashSet.add(s9.r.a(cls));
        for (Class cls2 : clsArr) {
            com.google.android.gms.internal.play_billing.s1.a(cls2, "Null interface");
            ((HashSet) this.f3289c).add(s9.r.a(cls2));
        }
    }

    public void a(s9.j jVar) {
        if (!((HashSet) this.f3289c).contains(jVar.f48001a)) {
            ((HashSet) this.e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public s9.a b() {
        boolean z10;
        if (((s9.d) this.f3290f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new s9.a((String) this.d, new HashSet((HashSet) this.f3289c), new HashSet((HashSet) this.e), this.f3287a, this.f3288b, (s9.d) this.f3290f, (HashSet) this.f3291g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z10;
        if (this.f3287a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f3287a = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
