package h9;

import a8.ka;
public final class p1 {
    public final Object f14071a;
    public int f14072b;
    public final q1 f14073c;

    public p1(q1 q1Var, int i7) {
        this.f14073c = q1Var;
        this.f14071a = q1Var.f14077a[i7];
        this.f14072b = i7;
    }

    public final int a() {
        int i7 = this.f14072b;
        Object obj = this.f14071a;
        q1 q1Var = this.f14073c;
        if (i7 == -1 || i7 >= q1Var.f14079c || !ka.a(obj, q1Var.f14077a[i7])) {
            this.f14072b = q1Var.c(obj);
        }
        int i10 = this.f14072b;
        if (i10 == -1) {
            return 0;
        }
        return q1Var.f14078b[i10];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (a() == p1Var.a() && ka.a(this.f14071a, p1Var.f14071a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f14071a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14071a);
        int a10 = a();
        if (a10 == 1) {
            return valueOf;
        }
        return valueOf + " x " + a10;
    }
}
