package defpackage;
public final class vn7 {
    public final Object a;
    public int b;
    public final wn7 c;

    public vn7(wn7 wn7Var, int i) {
        this.c = wn7Var;
        this.a = wn7Var.a[i];
        this.b = i;
    }

    public final int a() {
        int i = this.b;
        Object obj = this.a;
        wn7 wn7Var = this.c;
        if (i == -1 || i >= wn7Var.c || !bqe.a(obj, wn7Var.a[i])) {
            this.b = wn7Var.c(obj);
        }
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return wn7Var.b[i2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vn7) {
            vn7 vn7Var = (vn7) obj;
            if (a() == vn7Var.a() && bqe.a(this.a, vn7Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int a = a();
        if (a == 1) {
            return valueOf;
        }
        return valueOf + " x " + a;
    }
}
