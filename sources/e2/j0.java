package e2;

import c8.wc;
import java.util.HashSet;
public final class j0 {
    public int f10468a;
    public int f10469b;
    public Object f10470c;
    public Object d = null;
    public Object f10471e;
    public Object f10472f;
    public Object f10473g;

    public j0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f10470c = hashSet;
        this.f10471e = new HashSet();
        this.f10468a = 0;
        this.f10469b = 0;
        this.f10473g = new HashSet();
        hashSet.add(u9.q.a(cls));
        for (Class cls2 : clsArr) {
            wc.a(cls2, "Null interface");
            ((HashSet) this.f10470c).add(u9.q.a(cls2));
        }
    }

    public void a(u9.i iVar) {
        if (!((HashSet) this.f10470c).contains(iVar.f58588a)) {
            ((HashSet) this.f10471e).add(iVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public u9.a b() {
        boolean z10;
        if (((u9.d) this.f10472f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new u9.a((String) this.d, new HashSet((HashSet) this.f10470c), new HashSet((HashSet) this.f10471e), this.f10468a, this.f10469b, (u9.d) this.f10472f, (HashSet) this.f10473g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i7) {
        boolean z10;
        if (this.f10468a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f10468a = i7;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
