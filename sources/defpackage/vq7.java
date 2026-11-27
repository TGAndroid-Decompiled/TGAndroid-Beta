package defpackage;
public final class vq7 {
    public final Object a;
    public int b;
    public final wq7 c;

    public vq7(wq7 wq7Var, int i) {
        this.c = wq7Var;
        this.a = wq7Var.a[i];
        this.b = i;
    }

    public final int a() {
        int i = this.b;
        Object obj = this.a;
        wq7 wq7Var = this.c;
        if (i == -1 || i >= wq7Var.c || !tue.a(obj, wq7Var.a[i])) {
            this.b = wq7Var.c(obj);
        }
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return wq7Var.b[i2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vq7) {
            vq7 vq7Var = (vq7) obj;
            if (a() == vq7Var.a() && tue.a(this.a, vq7Var.a)) {
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
