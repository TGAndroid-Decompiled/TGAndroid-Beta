package c3;
public final class a0 {
    public final c0 f3708a;
    public final c0 f3709b;

    public a0(c0 c0Var, c0 c0Var2) {
        this.f3708a = c0Var;
        this.f3709b = c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f3708a.equals(a0Var.f3708a) && this.f3709b.equals(a0Var.f3709b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3709b.hashCode() + (this.f3708a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        c0 c0Var = this.f3708a;
        sb2.append(c0Var);
        c0 c0Var2 = this.f3709b;
        if (c0Var.equals(c0Var2)) {
            str = "";
        } else {
            str = ", " + c0Var2;
        }
        return a4.a.t(sb2, str, "]");
    }
}
