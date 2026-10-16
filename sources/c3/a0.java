package c3;
public final class a0 {
    public final c0 f4194a;
    public final c0 f4195b;

    public a0(c0 c0Var, c0 c0Var2) {
        this.f4194a = c0Var;
        this.f4195b = c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f4194a.equals(a0Var.f4194a) && this.f4195b.equals(a0Var.f4195b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4195b.hashCode() + (this.f4194a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        c0 c0Var = this.f4194a;
        sb2.append(c0Var);
        c0 c0Var2 = this.f4195b;
        if (c0Var.equals(c0Var2)) {
            str = "";
        } else {
            str = ", " + c0Var2;
        }
        return a1.g.s(sb2, str, "]");
    }
}
