package b2;

import java.util.HashSet;
import w7.f7;
public final class m0 {
    public int f3833a;
    public int f3834b;
    public Object f3835c;
    public Object d = null;
    public Object e;
    public Object f3836f;
    public Object f3837g;

    public m0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f3835c = hashSet;
        this.e = new HashSet();
        this.f3833a = 0;
        this.f3834b = 0;
        this.f3837g = new HashSet();
        hashSet.add(r9.r.a(cls));
        for (Class cls2 : clsArr) {
            f7.a(cls2, "Null interface");
            ((HashSet) this.f3835c).add(r9.r.a(cls2));
        }
    }

    public void a(r9.j jVar) {
        if (!((HashSet) this.f3835c).contains(jVar.f45182a)) {
            ((HashSet) this.e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public r9.a b() {
        boolean z10;
        if (((r9.d) this.f3836f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new r9.a((String) this.d, new HashSet((HashSet) this.f3835c), new HashSet((HashSet) this.e), this.f3833a, this.f3834b, (r9.d) this.f3836f, (HashSet) this.f3837g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        boolean z10;
        if (this.f3833a == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f3833a = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
