package aa;

import java.util.List;
public final class r0 extends q1 {
    public final String f1186a;
    public final String f1187b;
    public final List f1188c;
    public final q1 d;
    public final int e;

    public r0(String str, String str2, List list, q1 q1Var, int i10) {
        this.f1186a = str;
        this.f1187b = str2;
        this.f1188c = list;
        this.d = q1Var;
        this.e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        q1 q1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            r0 r0Var = (r0) ((q1) obj);
            q1 q1Var2 = r0Var.d;
            String str2 = r0Var.f1187b;
            if (this.f1186a.equals(r0Var.f1186a) && ((str = this.f1187b) != null ? str.equals(str2) : str2 == null) && this.f1188c.equals(r0Var.f1188c) && ((q1Var = this.d) != null ? q1Var.equals(q1Var2) : q1Var2 == null) && this.e == r0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f1186a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        String str = this.f1187b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f1188c.hashCode()) * 1000003;
        q1 q1Var = this.d;
        if (q1Var != null) {
            i10 = q1Var.hashCode();
        }
        return ((hashCode3 ^ i10) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f1186a);
        sb2.append(", reason=");
        sb2.append(this.f1187b);
        sb2.append(", frames=");
        sb2.append(this.f1188c);
        sb2.append(", causedBy=");
        sb2.append(this.d);
        sb2.append(", overflowCount=");
        return a1.g.n(this.e, "}", sb2);
    }
}
