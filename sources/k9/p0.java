package k9;

import java.util.List;
public final class p0 extends o1 {
    public final String f10974a;
    public final String f10975b;
    public final List f10976c;
    public final o1 d;
    public final int f10977e;

    public p0(String str, String str2, List list, o1 o1Var, int i10) {
        this.f10974a = str;
        this.f10975b = str2;
        this.f10976c = list;
        this.d = o1Var;
        this.f10977e = i10;
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
            String str2 = p0Var.f10975b;
            if (this.f10974a.equals(p0Var.f10974a) && ((str = this.f10975b) != null ? str.equals(str2) : str2 == null) && this.f10976c.equals(p0Var.f10976c) && ((o1Var = this.d) != null ? o1Var.equals(o1Var2) : o1Var2 == null) && this.f10977e == p0Var.f10977e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f10974a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        String str = this.f10975b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f10976c.hashCode()) * 1000003;
        o1 o1Var = this.d;
        if (o1Var != null) {
            i10 = o1Var.hashCode();
        }
        return ((hashCode3 ^ i10) * 1000003) ^ this.f10977e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f10974a);
        sb.append(", reason=");
        sb.append(this.f10975b);
        sb.append(", frames=");
        sb.append(this.f10976c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return android.support.v4.media.a.m(this.f10977e, "}", sb);
    }
}
