package e9;

import v7.s6;
public final class t1 {
    public final Object f6420a;
    public int f6421b;
    public final u1 f6422c;

    public t1(u1 u1Var, int i10) {
        this.f6422c = u1Var;
        this.f6420a = u1Var.f6427a[i10];
        this.f6421b = i10;
    }

    public final int a() {
        int i10 = this.f6421b;
        Object obj = this.f6420a;
        u1 u1Var = this.f6422c;
        if (i10 == -1 || i10 >= u1Var.f6429c || !s6.a(obj, u1Var.f6427a[i10])) {
            this.f6421b = u1Var.c(obj);
        }
        int i11 = this.f6421b;
        if (i11 == -1) {
            return 0;
        }
        return u1Var.f6428b[i11];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t1) {
            t1 t1Var = (t1) obj;
            if (a() == t1Var.a() && s6.a(this.f6420a, t1Var.f6420a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f6420a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6420a);
        int a2 = a();
        if (a2 == 1) {
            return valueOf;
        }
        return valueOf + " x " + a2;
    }
}
