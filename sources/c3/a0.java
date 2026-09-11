package c3;
public final class a0 {
    public final c0 f4198a;
    public final c0 f4199b;

    public a0(c0 c0Var, c0 c0Var2) {
        this.f4198a = c0Var;
        this.f4199b = c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f4198a.equals(a0Var.f4198a) && this.f4199b.equals(a0Var.f4199b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4199b.hashCode() + (this.f4198a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        c0 c0Var = this.f4198a;
        sb2.append(c0Var);
        c0 c0Var2 = this.f4199b;
        if (c0Var.equals(c0Var2)) {
            str = "";
        } else {
            str = ", " + c0Var2;
        }
        return a4.a.s(sb2, str, "]");
    }
}
