package c3;
public final class a0 {
    public final c0 f4190a;
    public final c0 f4191b;

    public a0(c0 c0Var, c0 c0Var2) {
        this.f4190a = c0Var;
        this.f4191b = c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f4190a.equals(a0Var.f4190a) && this.f4191b.equals(a0Var.f4191b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4191b.hashCode() + (this.f4190a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        c0 c0Var = this.f4190a;
        sb2.append(c0Var);
        c0 c0Var2 = this.f4191b;
        if (c0Var.equals(c0Var2)) {
            str = "";
        } else {
            str = ", " + c0Var2;
        }
        return a1.g.s(sb2, str, "]");
    }
}
