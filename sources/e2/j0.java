package e2;

import c8.xc;
import java.util.HashSet;
public final class j0 {
    public int f10434a;
    public int f10435b;
    public Object f10436c;
    public Object d = null;
    public Object f10437e;
    public Object f10438f;
    public Object f10439g;

    public j0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f10436c = hashSet;
        this.f10437e = new HashSet();
        this.f10434a = 0;
        this.f10435b = 0;
        this.f10439g = new HashSet();
        hashSet.add(u9.q.a(cls));
        for (Class cls2 : clsArr) {
            xc.a(cls2, "Null interface");
            ((HashSet) this.f10436c).add(u9.q.a(cls2));
        }
    }

    public void a(u9.i iVar) {
        if (!((HashSet) this.f10436c).contains(iVar.f58557a)) {
            ((HashSet) this.f10437e).add(iVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public u9.a b() {
        boolean z10;
        if (((u9.d) this.f10438f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new u9.a((String) this.d, new HashSet((HashSet) this.f10436c), new HashSet((HashSet) this.f10437e), this.f10434a, this.f10435b, (u9.d) this.f10438f, (HashSet) this.f10439g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i7) {
        boolean z10;
        if (this.f10434a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f10434a = i7;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
