package h9;

import a8.ha;
public final class p1 {
    public final Object f14367a;
    public int f14368b;
    public final q1 f14369c;

    public p1(q1 q1Var, int i7) {
        this.f14369c = q1Var;
        this.f14367a = q1Var.f14373a[i7];
        this.f14368b = i7;
    }

    public final int a() {
        int i7 = this.f14368b;
        Object obj = this.f14367a;
        q1 q1Var = this.f14369c;
        if (i7 == -1 || i7 >= q1Var.f14375c || !ha.a(obj, q1Var.f14373a[i7])) {
            this.f14368b = q1Var.c(obj);
        }
        int i10 = this.f14368b;
        if (i10 == -1) {
            return 0;
        }
        return q1Var.f14374b[i10];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (a() == p1Var.a() && ha.a(this.f14367a, p1Var.f14367a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f14367a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14367a);
        int a10 = a();
        if (a10 == 1) {
            return valueOf;
        }
        return valueOf + " x " + a10;
    }
}
