package defpackage;
public final class yp7 {
    public final Object a;
    public int b;
    public final zp7 c;

    public yp7(zp7 zp7Var, int i) {
        this.c = zp7Var;
        this.a = zp7Var.a[i];
        this.b = i;
    }

    public final int a() {
        int i = this.b;
        Object obj = this.a;
        zp7 zp7Var = this.c;
        if (i == -1 || i >= zp7Var.c || !ese.a(obj, zp7Var.a[i])) {
            this.b = zp7Var.c(obj);
        }
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return zp7Var.b[i2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yp7) {
            yp7 yp7Var = (yp7) obj;
            if (a() == yp7Var.a() && ese.a(this.a, yp7Var.a)) {
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
