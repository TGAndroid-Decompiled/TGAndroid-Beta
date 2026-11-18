package e2;

import c8.wc;
import java.util.HashSet;
public final class j0 {
    public int f10439a;
    public int f10440b;
    public Object f10441c;
    public Object d = null;
    public Object f10442e;
    public Object f10443f;
    public Object f10444g;

    public j0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f10441c = hashSet;
        this.f10442e = new HashSet();
        this.f10439a = 0;
        this.f10440b = 0;
        this.f10444g = new HashSet();
        hashSet.add(u9.q.a(cls));
        for (Class cls2 : clsArr) {
            wc.a(cls2, "Null interface");
            ((HashSet) this.f10441c).add(u9.q.a(cls2));
        }
    }

    public void a(u9.i iVar) {
        if (!((HashSet) this.f10441c).contains(iVar.f58547a)) {
            ((HashSet) this.f10442e).add(iVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public u9.a b() {
        boolean z10;
        if (((u9.d) this.f10443f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new u9.a((String) this.d, new HashSet((HashSet) this.f10441c), new HashSet((HashSet) this.f10442e), this.f10439a, this.f10440b, (u9.d) this.f10443f, (HashSet) this.f10444g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i7) {
        boolean z10;
        if (this.f10439a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f10439a = i7;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
