package h9;

import java.util.List;

public final class n0 extends s1 {

    public final List f8777a;

    public final o1 f8778b;

    public final g1 f8779c;
    public final p1 d;

    public final List f8780e;

    public n0(List list, p0 p0Var, g1 g1Var, q0 q0Var, List list2) {
        this.f8777a = list;
        this.f8778b = p0Var;
        this.f8779c = g1Var;
        this.d = q0Var;
        this.f8780e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s1) {
            s1 s1Var = (s1) obj;
            List list = this.f8777a;
            if (list != null ? list.equals(((n0) s1Var).f8777a) : ((n0) s1Var).f8777a == null) {
                o1 o1Var = this.f8778b;
                if (o1Var != null ? o1Var.equals(((n0) s1Var).f8778b) : ((n0) s1Var).f8778b == null) {
                    g1 g1Var = this.f8779c;
                    if (g1Var != null ? g1Var.equals(((n0) s1Var).f8779c) : ((n0) s1Var).f8779c == null) {
                        n0 n0Var = (n0) s1Var;
                        if (this.d.equals(n0Var.d) && this.f8780e.equals(n0Var.f8780e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f8777a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        o1 o1Var = this.f8778b;
        int iHashCode2 = (iHashCode ^ (o1Var == null ? 0 : o1Var.hashCode())) * 1000003;
        g1 g1Var = this.f8779c;
        return (((((g1Var != null ? g1Var.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f8780e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f8777a + ", exception=" + this.f8778b + ", appExitInfo=" + this.f8779c + ", signal=" + this.d + ", binaries=" + this.f8780e + "}";
    }
}
