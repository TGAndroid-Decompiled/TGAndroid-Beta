package c3;
public final class a0 {
    public final c0 f4053a;
    public final c0 f4054b;

    public a0(c0 c0Var, c0 c0Var2) {
        this.f4053a = c0Var;
        this.f4054b = c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f4053a.equals(a0Var.f4053a) && this.f4054b.equals(a0Var.f4054b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4054b.hashCode() + (this.f4053a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        c0 c0Var = this.f4053a;
        sb2.append(c0Var);
        c0 c0Var2 = this.f4054b;
        if (c0Var.equals(c0Var2)) {
            str = "";
        } else {
            str = ", " + c0Var2;
        }
        return a1.g.t(sb2, str, "]");
    }
}
