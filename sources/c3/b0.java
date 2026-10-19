package c3;
public final class b0 {
    public final d0 f4587a;
    public final d0 f4588b;

    public b0(d0 d0Var, d0 d0Var2) {
        this.f4587a = d0Var;
        this.f4588b = d0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (this.f4587a.equals(b0Var.f4587a) && this.f4588b.equals(b0Var.f4588b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4588b.hashCode() + (this.f4587a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        d0 d0Var = this.f4587a;
        sb2.append(d0Var);
        d0 d0Var2 = this.f4588b;
        if (d0Var.equals(d0Var2)) {
            str = "";
        } else {
            str = ", " + d0Var2;
        }
        return a1.g.s(sb2, str, "]");
    }
}
