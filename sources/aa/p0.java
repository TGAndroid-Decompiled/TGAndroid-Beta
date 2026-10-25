package aa;

import java.util.List;
public final class p0 extends u1 {
    public final List f1173a;
    public final q1 f1174b;
    public final i1 f1175c;
    public final r1 d;
    public final List e;

    public p0(List list, r0 r0Var, i1 i1Var, s0 s0Var, List list2) {
        this.f1173a = list;
        this.f1174b = r0Var;
        this.f1175c = i1Var;
        this.d = s0Var;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            List list = this.f1173a;
            if (list != null ? list.equals(((p0) u1Var).f1173a) : ((p0) u1Var).f1173a == null) {
                q1 q1Var = this.f1174b;
                if (q1Var != null ? q1Var.equals(((p0) u1Var).f1174b) : ((p0) u1Var).f1174b == null) {
                    i1 i1Var = this.f1175c;
                    if (i1Var != null ? i1Var.equals(((p0) u1Var).f1175c) : ((p0) u1Var).f1175c == null) {
                        p0 p0Var = (p0) u1Var;
                        if (this.d.equals(p0Var.d) && this.e.equals(p0Var.e)) {
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
        int i10 = 0;
        List list = this.f1173a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        q1 q1Var = this.f1174b;
        if (q1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = q1Var.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        i1 i1Var = this.f1175c;
        if (i1Var != null) {
            i10 = i1Var.hashCode();
        }
        return ((((i10 ^ i12) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f1173a + ", exception=" + this.f1174b + ", appExitInfo=" + this.f1175c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }
}
