package c3;
public final class a0 {
    public final c0 f3595a;
    public final c0 f3596b;

    public a0(c0 c0Var, c0 c0Var2) {
        this.f3595a = c0Var;
        this.f3596b = c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f3595a.equals(a0Var.f3595a) && this.f3596b.equals(a0Var.f3596b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3596b.hashCode() + (this.f3595a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        c0 c0Var = this.f3595a;
        sb2.append(c0Var);
        c0 c0Var2 = this.f3596b;
        if (c0Var.equals(c0Var2)) {
            str = "";
        } else {
            str = ", " + c0Var2;
        }
        return a1.g.r(sb2, str, "]");
    }
}
