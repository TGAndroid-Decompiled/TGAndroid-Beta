package defpackage;

import java.util.Collections;
import java.util.HashSet;
public final class wq2 {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public byte d;
    public boolean e;
    public lr2 f;
    public final HashSet g;

    public wq2(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = (byte) 0;
        this.e = false;
        this.g = new HashSet();
        hashSet.add(yy8.a(cls));
        for (Class cls2 : clsArr) {
            kte.a(cls2, "Null interface");
            this.b.add(yy8.a(cls2));
        }
    }

    public final void a(if3 if3Var) {
        if (!this.b.contains(if3Var.a)) {
            this.c.add(if3Var);
        } else {
            u36.j("Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    public final xq2 b() {
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
            return new xq2(str, hashSet, hashSet2, b, z2 ? 1 : 0, this.f, this.g);
        }
        dq9.m("Missing required property: factory.");
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
            dq9.m("Instantiation type has already been set.");
        }
    }

    public wq2(yy8 yy8Var, yy8... yy8VarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = (byte) 0;
        this.e = false;
        this.g = new HashSet();
        hashSet.add(yy8Var);
        for (yy8 yy8Var2 : yy8VarArr) {
            kte.a(yy8Var2, "Null interface");
        }
        Collections.addAll(this.b, yy8VarArr);
    }
}
