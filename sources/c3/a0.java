package c3;
public final class a0 {
    public final c0 f4052a;
    public final c0 f4053b;

    public a0(c0 c0Var, c0 c0Var2) {
        this.f4052a = c0Var;
        this.f4053b = c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f4052a.equals(a0Var.f4052a) && this.f4053b.equals(a0Var.f4053b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4053b.hashCode() + (this.f4052a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        c0 c0Var = this.f4052a;
        sb2.append(c0Var);
        c0 c0Var2 = this.f4053b;
        if (c0Var.equals(c0Var2)) {
            str = "";
        } else {
            str = ", " + c0Var2;
        }
        return a1.g.t(sb2, str, "]");
    }
}
