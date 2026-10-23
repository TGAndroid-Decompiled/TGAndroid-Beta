package e9;

import v7.t6;
public final class t1 {
    public final Object f8511a;
    public int f8512b;
    public final u1 f8513c;

    public t1(u1 u1Var, int i10) {
        this.f8513c = u1Var;
        this.f8511a = u1Var.f8518a[i10];
        this.f8512b = i10;
    }

    public final int a() {
        int i10 = this.f8512b;
        Object obj = this.f8511a;
        u1 u1Var = this.f8513c;
        if (i10 == -1 || i10 >= u1Var.f8520c || !t6.a(obj, u1Var.f8518a[i10])) {
            this.f8512b = u1Var.c(obj);
        }
        int i11 = this.f8512b;
        if (i11 == -1) {
            return 0;
        }
        return u1Var.f8519b[i11];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t1) {
            t1 t1Var = (t1) obj;
            if (a() == t1Var.a() && t6.a(this.f8511a, t1Var.f8511a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f8511a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8511a);
        int a2 = a();
        if (a2 == 1) {
            return valueOf;
        }
        return valueOf + " x " + a2;
    }
}
