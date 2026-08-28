package g9;

import java.util.List;
public final class n0 extends s1 {
    public final List f7606a;
    public final o1 f7607b;
    public final g1 f7608c;
    public final p1 d;
    public final List f7609e;

    public n0(List list, p0 p0Var, g1 g1Var, q0 q0Var, List list2) {
        this.f7606a = list;
        this.f7607b = p0Var;
        this.f7608c = g1Var;
        this.d = q0Var;
        this.f7609e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s1) {
            s1 s1Var = (s1) obj;
            List list = this.f7606a;
            if (list != null ? list.equals(((n0) s1Var).f7606a) : ((n0) s1Var).f7606a == null) {
                o1 o1Var = this.f7607b;
                if (o1Var != null ? o1Var.equals(((n0) s1Var).f7607b) : ((n0) s1Var).f7607b == null) {
                    g1 g1Var = this.f7608c;
                    if (g1Var != null ? g1Var.equals(((n0) s1Var).f7608c) : ((n0) s1Var).f7608c == null) {
                        n0 n0Var = (n0) s1Var;
                        if (this.d.equals(n0Var.d) && this.f7609e.equals(n0Var.f7609e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i9 = 0;
        List list = this.f7606a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        o1 o1Var = this.f7607b;
        if (o1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = o1Var.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        g1 g1Var = this.f7608c;
        if (g1Var != null) {
            i9 = g1Var.hashCode();
        }
        return ((((i9 ^ i11) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f7609e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f7606a + ", exception=" + this.f7607b + ", appExitInfo=" + this.f7608c + ", signal=" + this.d + ", binaries=" + this.f7609e + "}";
    }
}
