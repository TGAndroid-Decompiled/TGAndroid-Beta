package e9;

import v7.t6;
public final class t1 {
    public final Object f8506a;
    public int f8507b;
    public final u1 f8508c;

    public t1(u1 u1Var, int i10) {
        this.f8508c = u1Var;
        this.f8506a = u1Var.f8513a[i10];
        this.f8507b = i10;
    }

    public final int a() {
        int i10 = this.f8507b;
        Object obj = this.f8506a;
        u1 u1Var = this.f8508c;
        if (i10 == -1 || i10 >= u1Var.f8515c || !t6.a(obj, u1Var.f8513a[i10])) {
            this.f8507b = u1Var.c(obj);
        }
        int i11 = this.f8507b;
        if (i11 == -1) {
            return 0;
        }
        return u1Var.f8514b[i11];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t1) {
            t1 t1Var = (t1) obj;
            if (a() == t1Var.a() && t6.a(this.f8506a, t1Var.f8506a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f8506a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8506a);
        int a2 = a();
        if (a2 == 1) {
            return valueOf;
        }
        return valueOf + " x " + a2;
    }
}
