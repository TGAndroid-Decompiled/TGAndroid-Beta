package c3;
public final class b0 {
    public final d0 f4589a;
    public final d0 f4590b;

    public b0(d0 d0Var, d0 d0Var2) {
        this.f4589a = d0Var;
        this.f4590b = d0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (this.f4589a.equals(b0Var.f4589a) && this.f4590b.equals(b0Var.f4590b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4590b.hashCode() + (this.f4589a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        d0 d0Var = this.f4589a;
        sb2.append(d0Var);
        d0 d0Var2 = this.f4590b;
        if (d0Var.equals(d0Var2)) {
            str = "";
        } else {
            str = ", " + d0Var2;
        }
        return a1.g.s(sb2, str, "]");
    }
}
