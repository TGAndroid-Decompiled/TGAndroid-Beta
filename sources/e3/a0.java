package e3;
public final class a0 {
    public final c0 f9406a;
    public final c0 f9407b;

    public a0(c0 c0Var, c0 c0Var2) {
        this.f9406a = c0Var;
        this.f9407b = c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f9406a.equals(a0Var.f9406a) && this.f9407b.equals(a0Var.f9407b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9407b.hashCode() + (this.f9406a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        c0 c0Var = this.f9406a;
        sb2.append(c0Var);
        c0 c0Var2 = this.f9407b;
        if (c0Var.equals(c0Var2)) {
            str = "";
        } else {
            str = ", " + c0Var2;
        }
        return a1.g.s(sb2, str, "]");
    }
}
