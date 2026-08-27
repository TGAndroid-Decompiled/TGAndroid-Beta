package h9;

import java.util.List;

public final class p0 extends o1 {

    public final String f8790a;

    public final String f8791b;

    public final List f8792c;
    public final o1 d;

    public final int f8793e;

    public p0(String str, String str2, List list, o1 o1Var, int i10) {
        this.f8790a = str;
        this.f8791b = str2;
        this.f8792c = list;
        this.d = o1Var;
        this.f8793e = i10;
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
            String str2 = p0Var.f8791b;
            if (this.f8790a.equals(p0Var.f8790a) && ((str = this.f8791b) != null ? str.equals(str2) : str2 == null) && this.f8792c.equals(p0Var.f8792c) && ((o1Var = this.d) != null ? o1Var.equals(o1Var2) : o1Var2 == null) && this.f8793e == p0Var.f8793e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f8790a.hashCode() ^ 1000003) * 1000003;
        String str = this.f8791b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f8792c.hashCode()) * 1000003;
        o1 o1Var = this.d;
        return ((iHashCode2 ^ (o1Var != null ? o1Var.hashCode() : 0)) * 1000003) ^ this.f8793e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f8790a);
        sb2.append(", reason=");
        sb2.append(this.f8791b);
        sb2.append(", frames=");
        sb2.append(this.f8792c);
        sb2.append(", causedBy=");
        sb2.append(this.d);
        sb2.append(", overflowCount=");
        return a9.p.k(this.f8793e, "}", sb2);
    }
}
