package h9;

import a8.la;
public final class o1 {
    public final Object f14026a;
    public int f14027b;
    public final p1 f14028c;

    public o1(p1 p1Var, int i7) {
        this.f14028c = p1Var;
        this.f14026a = p1Var.f14032a[i7];
        this.f14027b = i7;
    }

    public final int a() {
        int i7 = this.f14027b;
        Object obj = this.f14026a;
        p1 p1Var = this.f14028c;
        if (i7 == -1 || i7 >= p1Var.f14034c || !la.a(obj, p1Var.f14032a[i7])) {
            this.f14027b = p1Var.c(obj);
        }
        int i10 = this.f14027b;
        if (i10 == -1) {
            return 0;
        }
        return p1Var.f14033b[i10];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (a() == o1Var.a() && la.a(this.f14026a, o1Var.f14026a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f14026a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14026a);
        int a10 = a();
        if (a10 == 1) {
            return valueOf;
        }
        return valueOf + " x " + a10;
    }
}
