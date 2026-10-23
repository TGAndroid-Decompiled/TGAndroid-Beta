package c3;
public final class d0 {
    public final f0 f4609a;
    public final f0 f4610b;

    public d0(f0 f0Var, f0 f0Var2) {
        this.f4609a = f0Var;
        this.f4610b = f0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class == obj.getClass()) {
            d0 d0Var = (d0) obj;
            if (this.f4609a.equals(d0Var.f4609a) && this.f4610b.equals(d0Var.f4610b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4610b.hashCode() + (this.f4609a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        f0 f0Var = this.f4609a;
        sb2.append(f0Var);
        f0 f0Var2 = this.f4610b;
        if (f0Var.equals(f0Var2)) {
            str = "";
        } else {
            str = ", " + f0Var2;
        }
        return a1.g.s(sb2, str, "]");
    }
}
