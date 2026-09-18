package c3;
public final class a0 {
    public final c0 f3711a;
    public final c0 f3712b;

    public a0(c0 c0Var, c0 c0Var2) {
        this.f3711a = c0Var;
        this.f3712b = c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f3711a.equals(a0Var.f3711a) && this.f3712b.equals(a0Var.f3712b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3712b.hashCode() + (this.f3711a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        c0 c0Var = this.f3711a;
        sb2.append(c0Var);
        c0 c0Var2 = this.f3712b;
        if (c0Var.equals(c0Var2)) {
            str = "";
        } else {
            str = ", " + c0Var2;
        }
        return a4.a.s(sb2, str, "]");
    }
}
