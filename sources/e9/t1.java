package e9;

import v7.t6;
public final class t1 {
    public final Object f8505a;
    public int f8506b;
    public final u1 f8507c;

    public t1(u1 u1Var, int i10) {
        this.f8507c = u1Var;
        this.f8505a = u1Var.f8512a[i10];
        this.f8506b = i10;
    }

    public final int a() {
        int i10 = this.f8506b;
        Object obj = this.f8505a;
        u1 u1Var = this.f8507c;
        if (i10 == -1 || i10 >= u1Var.f8514c || !t6.a(obj, u1Var.f8512a[i10])) {
            this.f8506b = u1Var.c(obj);
        }
        int i11 = this.f8506b;
        if (i11 == -1) {
            return 0;
        }
        return u1Var.f8513b[i11];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t1) {
            t1 t1Var = (t1) obj;
            if (a() == t1Var.a() && t6.a(this.f8505a, t1Var.f8505a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f8505a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8505a);
        int a2 = a();
        if (a2 == 1) {
            return valueOf;
        }
        return valueOf + " x " + a2;
    }
}
