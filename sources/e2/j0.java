package e2;

import c8.tc;
import java.util.HashSet;
public final class j0 {
    public int f10288a;
    public int f10289b;
    public Object f10290c;
    public Object d = null;
    public Object f10291e;
    public Object f10292f;
    public Object f10293g;

    public j0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f10290c = hashSet;
        this.f10291e = new HashSet();
        this.f10288a = 0;
        this.f10289b = 0;
        this.f10293g = new HashSet();
        hashSet.add(u9.q.a(cls));
        for (Class cls2 : clsArr) {
            tc.a(cls2, "Null interface");
            ((HashSet) this.f10290c).add(u9.q.a(cls2));
        }
    }

    public void a(u9.i iVar) {
        if (!((HashSet) this.f10290c).contains(iVar.f56381a)) {
            ((HashSet) this.f10291e).add(iVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public u9.a b() {
        boolean z9;
        if (((u9.d) this.f10292f) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return new u9.a((String) this.d, new HashSet((HashSet) this.f10290c), new HashSet((HashSet) this.f10291e), this.f10288a, this.f10289b, (u9.d) this.f10292f, (HashSet) this.f10293g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i7) {
        boolean z9;
        if (this.f10288a == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.f10288a = i7;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
