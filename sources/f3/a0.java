package f3;

import a8.p0;
public final class a0 {
    public final c0 f11125a;
    public final c0 f11126b;

    public a0(c0 c0Var, c0 c0Var2) {
        this.f11125a = c0Var;
        this.f11126b = c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f11125a.equals(a0Var.f11125a) && this.f11126b.equals(a0Var.f11126b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11126b.hashCode() + (this.f11125a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        c0 c0Var = this.f11125a;
        sb2.append(c0Var);
        c0 c0Var2 = this.f11126b;
        if (c0Var.equals(c0Var2)) {
            str = "";
        } else {
            str = ", " + c0Var2;
        }
        return p0.s(sb2, str, "]");
    }
}
