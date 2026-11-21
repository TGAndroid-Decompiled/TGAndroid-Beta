package h9;

import a8.ka;
public final class p1 {
    public final Object f14068a;
    public int f14069b;
    public final q1 f14070c;

    public p1(q1 q1Var, int i7) {
        this.f14070c = q1Var;
        this.f14068a = q1Var.f14074a[i7];
        this.f14069b = i7;
    }

    public final int a() {
        int i7 = this.f14069b;
        Object obj = this.f14068a;
        q1 q1Var = this.f14070c;
        if (i7 == -1 || i7 >= q1Var.f14076c || !ka.a(obj, q1Var.f14074a[i7])) {
            this.f14069b = q1Var.c(obj);
        }
        int i10 = this.f14069b;
        if (i10 == -1) {
            return 0;
        }
        return q1Var.f14075b[i10];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (a() == p1Var.a() && ka.a(this.f14068a, p1Var.f14068a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f14068a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14068a);
        int a10 = a();
        if (a10 == 1) {
            return valueOf;
        }
        return valueOf + " x " + a10;
    }
}
