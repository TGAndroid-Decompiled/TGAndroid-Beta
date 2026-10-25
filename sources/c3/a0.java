package c3;
public final class a0 {
    public final c0 f6002a;
    public final c0 f6003b;

    public a0(c0 c0Var, c0 c0Var2) {
        this.f6002a = c0Var;
        this.f6003b = c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f6002a.equals(a0Var.f6002a) && this.f6003b.equals(a0Var.f6003b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6003b.hashCode() + (this.f6002a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        c0 c0Var = this.f6002a;
        sb2.append(c0Var);
        c0 c0Var2 = this.f6003b;
        if (c0Var.equals(c0Var2)) {
            str = "";
        } else {
            str = ", " + c0Var2;
        }
        return a1.g.s(sb2, str, "]");
    }
}
