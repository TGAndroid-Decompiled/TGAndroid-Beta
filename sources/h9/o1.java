package h9;

import a8.ia;
public final class o1 {
    public final Object f13717a;
    public int f13718b;
    public final p1 f13719c;

    public o1(p1 p1Var, int i7) {
        this.f13719c = p1Var;
        this.f13717a = p1Var.f13723a[i7];
        this.f13718b = i7;
    }

    public final int a() {
        int i7 = this.f13718b;
        Object obj = this.f13717a;
        p1 p1Var = this.f13719c;
        if (i7 == -1 || i7 >= p1Var.f13725c || !ia.a(obj, p1Var.f13723a[i7])) {
            this.f13718b = p1Var.c(obj);
        }
        int i10 = this.f13718b;
        if (i10 == -1) {
            return 0;
        }
        return p1Var.f13724b[i10];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (a() == o1Var.a() && ia.a(this.f13717a, o1Var.f13717a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f13717a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f13717a);
        int a10 = a();
        if (a10 == 1) {
            return valueOf;
        }
        return valueOf + " x " + a10;
    }
}
