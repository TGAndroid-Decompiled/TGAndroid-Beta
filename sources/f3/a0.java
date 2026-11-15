package f3;

import a8.p0;
public final class a0 {
    public final c0 f10777a;
    public final c0 f10778b;

    public a0(c0 c0Var, c0 c0Var2) {
        this.f10777a = c0Var;
        this.f10778b = c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f10777a.equals(a0Var.f10777a) && this.f10778b.equals(a0Var.f10778b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10778b.hashCode() + (this.f10777a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        c0 c0Var = this.f10777a;
        sb2.append(c0Var);
        c0 c0Var2 = this.f10778b;
        if (c0Var.equals(c0Var2)) {
            str = "";
        } else {
            str = ", " + c0Var2;
        }
        return p0.s(sb2, str, "]");
    }
}
