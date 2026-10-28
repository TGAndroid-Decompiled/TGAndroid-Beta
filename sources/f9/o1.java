package f9;

import a8.xb;
public final class o1 {
    public final Object f10313a;
    public int f10314b;
    public final p1 f10315c;

    public o1(p1 p1Var, int i10) {
        this.f10315c = p1Var;
        this.f10313a = p1Var.f10319a[i10];
        this.f10314b = i10;
    }

    public final int a() {
        int i10 = this.f10314b;
        Object obj = this.f10313a;
        p1 p1Var = this.f10315c;
        if (i10 == -1 || i10 >= p1Var.f10321c || !xb.a(obj, p1Var.f10319a[i10])) {
            this.f10314b = p1Var.c(obj);
        }
        int i11 = this.f10314b;
        if (i11 == -1) {
            return 0;
        }
        return p1Var.f10320b[i11];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (a() == o1Var.a() && xb.a(this.f10313a, o1Var.f10313a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f10313a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10313a);
        int a2 = a();
        if (a2 == 1) {
            return valueOf;
        }
        return valueOf + " x " + a2;
    }
}
