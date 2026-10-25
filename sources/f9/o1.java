package f9;

import a8.xb;
public final class o1 {
    public final Object f10314a;
    public int f10315b;
    public final p1 f10316c;

    public o1(p1 p1Var, int i10) {
        this.f10316c = p1Var;
        this.f10314a = p1Var.f10320a[i10];
        this.f10315b = i10;
    }

    public final int a() {
        int i10 = this.f10315b;
        Object obj = this.f10314a;
        p1 p1Var = this.f10316c;
        if (i10 == -1 || i10 >= p1Var.f10322c || !xb.a(obj, p1Var.f10320a[i10])) {
            this.f10315b = p1Var.c(obj);
        }
        int i11 = this.f10315b;
        if (i11 == -1) {
            return 0;
        }
        return p1Var.f10321b[i11];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (a() == o1Var.a() && xb.a(this.f10314a, o1Var.f10314a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f10314a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10314a);
        int a2 = a();
        if (a2 == 1) {
            return valueOf;
        }
        return valueOf + " x " + a2;
    }
}
