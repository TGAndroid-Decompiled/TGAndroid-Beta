package f3;

import a8.p0;
public final class b0 {
    public final d0 f11117a;
    public final d0 f11118b;

    public b0(d0 d0Var, d0 d0Var2) {
        this.f11117a = d0Var;
        this.f11118b = d0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (this.f11117a.equals(b0Var.f11117a) && this.f11118b.equals(b0Var.f11118b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11118b.hashCode() + (this.f11117a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        d0 d0Var = this.f11117a;
        sb2.append(d0Var);
        d0 d0Var2 = this.f11118b;
        if (d0Var.equals(d0Var2)) {
            str = "";
        } else {
            str = ", " + d0Var2;
        }
        return p0.s(sb2, str, "]");
    }
}
