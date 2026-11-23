package e2;

import c8.wc;
import java.util.HashSet;
public final class j0 {
    public int f10471a;
    public int f10472b;
    public Object f10473c;
    public Object d = null;
    public Object f10474e;
    public Object f10475f;
    public Object f10476g;

    public j0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f10473c = hashSet;
        this.f10474e = new HashSet();
        this.f10471a = 0;
        this.f10472b = 0;
        this.f10476g = new HashSet();
        hashSet.add(u9.q.a(cls));
        for (Class cls2 : clsArr) {
            wc.a(cls2, "Null interface");
            ((HashSet) this.f10473c).add(u9.q.a(cls2));
        }
    }

    public void a(u9.i iVar) {
        if (!((HashSet) this.f10473c).contains(iVar.f58592a)) {
            ((HashSet) this.f10474e).add(iVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public u9.a b() {
        boolean z10;
        if (((u9.d) this.f10475f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new u9.a((String) this.d, new HashSet((HashSet) this.f10473c), new HashSet((HashSet) this.f10474e), this.f10471a, this.f10472b, (u9.d) this.f10475f, (HashSet) this.f10476g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i7) {
        boolean z10;
        if (this.f10471a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f10471a = i7;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
