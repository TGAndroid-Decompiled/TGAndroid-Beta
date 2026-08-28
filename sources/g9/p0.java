package g9;

import java.util.List;
public final class p0 extends o1 {
    public final String f7619a;
    public final String f7620b;
    public final List f7621c;
    public final o1 d;
    public final int f7622e;

    public p0(String str, String str2, List list, o1 o1Var, int i9) {
        this.f7619a = str;
        this.f7620b = str2;
        this.f7621c = list;
        this.d = o1Var;
        this.f7622e = i9;
    }

    public final boolean equals(Object obj) {
        String str;
        o1 o1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            p0 p0Var = (p0) ((o1) obj);
            o1 o1Var2 = p0Var.d;
            String str2 = p0Var.f7620b;
            if (this.f7619a.equals(p0Var.f7619a) && ((str = this.f7620b) != null ? str.equals(str2) : str2 == null) && this.f7621c.equals(p0Var.f7621c) && ((o1Var = this.d) != null ? o1Var.equals(o1Var2) : o1Var2 == null) && this.f7622e == p0Var.f7622e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f7619a.hashCode() ^ 1000003) * 1000003;
        int i9 = 0;
        String str = this.f7620b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f7621c.hashCode()) * 1000003;
        o1 o1Var = this.d;
        if (o1Var != null) {
            i9 = o1Var.hashCode();
        }
        return ((hashCode3 ^ i9) * 1000003) ^ this.f7622e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f7619a);
        sb2.append(", reason=");
        sb2.append(this.f7620b);
        sb2.append(", frames=");
        sb2.append(this.f7621c);
        sb2.append(", causedBy=");
        sb2.append(this.d);
        sb2.append(", overflowCount=");
        return aa.d.l(this.f7622e, "}", sb2);
    }
}
