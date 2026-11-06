package h9;

import a8.ha;
public final class p1 {
    public final Object f14365a;
    public int f14366b;
    public final q1 f14367c;

    public p1(q1 q1Var, int i7) {
        this.f14367c = q1Var;
        this.f14365a = q1Var.f14371a[i7];
        this.f14366b = i7;
    }

    public final int a() {
        int i7 = this.f14366b;
        Object obj = this.f14365a;
        q1 q1Var = this.f14367c;
        if (i7 == -1 || i7 >= q1Var.f14373c || !ha.a(obj, q1Var.f14371a[i7])) {
            this.f14366b = q1Var.c(obj);
        }
        int i10 = this.f14366b;
        if (i10 == -1) {
            return 0;
        }
        return q1Var.f14372b[i10];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (a() == p1Var.a() && ha.a(this.f14365a, p1Var.f14365a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f14365a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14365a);
        int a10 = a();
        if (a10 == 1) {
            return valueOf;
        }
        return valueOf + " x " + a10;
    }
}
