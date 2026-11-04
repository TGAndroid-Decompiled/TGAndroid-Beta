package g9;

import b8.yb;
public final class o1 {
    public final Object f12114a;
    public int f12115b;
    public final p1 f12116c;

    public o1(p1 p1Var, int i3) {
        this.f12116c = p1Var;
        this.f12114a = p1Var.f12120a[i3];
        this.f12115b = i3;
    }

    public final int a() {
        int i3 = this.f12115b;
        Object obj = this.f12114a;
        p1 p1Var = this.f12116c;
        if (i3 == -1 || i3 >= p1Var.f12122c || !yb.a(obj, p1Var.f12120a[i3])) {
            this.f12115b = p1Var.c(obj);
        }
        int i10 = this.f12115b;
        if (i10 == -1) {
            return 0;
        }
        return p1Var.f12121b[i10];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (a() == o1Var.a() && yb.a(this.f12114a, o1Var.f12114a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f12114a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f12114a);
        int a10 = a();
        if (a10 == 1) {
            return valueOf;
        }
        return valueOf + " x " + a10;
    }
}
