package defpackage;

import java.util.Collections;
import java.util.HashSet;
public final class lp2 {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public byte d;
    public boolean e;
    public aq2 f;
    public final HashSet g;

    public lp2(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = (byte) 0;
        this.e = false;
        this.g = new HashSet();
        hashSet.add(xw8.a(cls));
        for (Class cls2 : clsArr) {
            hre.a(cls2, "Null interface");
            this.b.add(xw8.a(cls2));
        }
    }

    public final void a(wd3 wd3Var) {
        if (!this.b.contains(wd3Var.a)) {
            this.c.add(wd3Var);
        } else {
            w26.j("Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    public final mp2 b() {
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
            return new mp2(str, hashSet, hashSet2, b, z2 ? 1 : 0, this.f, this.g);
        }
        sc8.j("Missing required property: factory.");
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
            sc8.j("Instantiation type has already been set.");
        }
    }

    public lp2(xw8 xw8Var, xw8... xw8VarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = (byte) 0;
        this.e = false;
        this.g = new HashSet();
        hashSet.add(xw8Var);
        for (xw8 xw8Var2 : xw8VarArr) {
            hre.a(xw8Var2, "Null interface");
        }
        Collections.addAll(this.b, xw8VarArr);
    }
}
