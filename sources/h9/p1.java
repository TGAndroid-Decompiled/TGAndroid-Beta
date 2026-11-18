package h9;

import a8.ka;
public final class p1 {
    public final Object f14039a;
    public int f14040b;
    public final q1 f14041c;

    public p1(q1 q1Var, int i7) {
        this.f14041c = q1Var;
        this.f14039a = q1Var.f14045a[i7];
        this.f14040b = i7;
    }

    public final int a() {
        int i7 = this.f14040b;
        Object obj = this.f14039a;
        q1 q1Var = this.f14041c;
        if (i7 == -1 || i7 >= q1Var.f14047c || !ka.a(obj, q1Var.f14045a[i7])) {
            this.f14040b = q1Var.c(obj);
        }
        int i10 = this.f14040b;
        if (i10 == -1) {
            return 0;
        }
        return q1Var.f14046b[i10];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (a() == p1Var.a() && ka.a(this.f14039a, p1Var.f14039a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f14039a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14039a);
        int a10 = a();
        if (a10 == 1) {
            return valueOf;
        }
        return valueOf + " x " + a10;
    }
}
