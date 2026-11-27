package defpackage;

import java.util.Collections;
import java.util.HashSet;
public final class eq2 {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public byte d;
    public boolean e;
    public tq2 f;
    public final HashSet g;

    public eq2(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = (byte) 0;
        this.e = false;
        this.g = new HashSet();
        hashSet.add(h09.a(cls));
        for (Class cls2 : clsArr) {
            bwe.a(cls2, "Null interface");
            this.b.add(h09.a(cls2));
        }
    }

    public final void a(qe3 qe3Var) {
        if (!this.b.contains(qe3Var.a)) {
            this.c.add(qe3Var);
        } else {
            lq5.j("Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    public final fq2 b() {
        boolean z;
        if (this.f != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String str = this.a;
            HashSet hashSet = new HashSet(this.b);
            HashSet hashSet2 = new HashSet(this.c);
            byte b = this.d;
            boolean z2 = this.e;
            return new fq2(str, hashSet, hashSet2, b, z2 ? 1 : 0, this.f, this.g);
        }
        grb.i("Missing required property: factory.");
        return null;
    }

    public final void c(int i) {
        boolean z;
        if (this.d == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.d = i;
        } else {
            grb.i("Instantiation type has already been set.");
        }
    }

    public eq2(h09 h09Var, h09... h09VarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = (byte) 0;
        this.e = false;
        this.g = new HashSet();
        hashSet.add(h09Var);
        for (h09 h09Var2 : h09VarArr) {
            bwe.a(h09Var2, "Null interface");
        }
        Collections.addAll(this.b, h09VarArr);
    }
}
