package defpackage;
public final class hx9 {
    public final kx9 a;
    public final kx9 b;

    public hx9(kx9 kx9Var, kx9 kx9Var2) {
        this.a = kx9Var;
        this.b = kx9Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && hx9.class == obj.getClass()) {
                hx9 hx9Var = (hx9) obj;
                if (this.a.equals(hx9Var.a) && this.b.equals(hx9Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        kx9 kx9Var = this.a;
        sb.append(kx9Var);
        kx9 kx9Var2 = this.b;
        if (kx9Var.equals(kx9Var2)) {
            str = "";
        } else {
            str = ", " + kx9Var2;
        }
        return b10.j(sb, str, "]");
    }
}
