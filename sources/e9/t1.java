package e9;

import v7.t6;
public final class t1 {
    public final Object f8625a;
    public int f8626b;
    public final u1 f8627c;

    public t1(u1 u1Var, int i10) {
        this.f8627c = u1Var;
        this.f8625a = u1Var.f8632a[i10];
        this.f8626b = i10;
    }

    public final int a() {
        int i10 = this.f8626b;
        Object obj = this.f8625a;
        u1 u1Var = this.f8627c;
        if (i10 == -1 || i10 >= u1Var.f8634c || !t6.a(obj, u1Var.f8632a[i10])) {
            this.f8626b = u1Var.c(obj);
        }
        int i11 = this.f8626b;
        if (i11 == -1) {
            return 0;
        }
        return u1Var.f8633b[i11];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t1) {
            t1 t1Var = (t1) obj;
            if (a() == t1Var.a() && t6.a(this.f8625a, t1Var.f8625a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f8625a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8625a);
        int a2 = a();
        if (a2 == 1) {
            return valueOf;
        }
        return valueOf + " x " + a2;
    }
}
