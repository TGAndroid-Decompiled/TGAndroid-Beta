package k9;

import java.util.List;
public final class p0 extends o1 {
    public final String f10218a;
    public final String f10219b;
    public final List f10220c;
    public final o1 d;
    public final int e;

    public p0(String str, String str2, List list, o1 o1Var, int i10) {
        this.f10218a = str;
        this.f10219b = str2;
        this.f10220c = list;
        this.d = o1Var;
        this.e = i10;
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
            String str2 = p0Var.f10219b;
            if (this.f10218a.equals(p0Var.f10218a) && ((str = this.f10219b) != null ? str.equals(str2) : str2 == null) && this.f10220c.equals(p0Var.f10220c) && ((o1Var = this.d) != null ? o1Var.equals(o1Var2) : o1Var2 == null) && this.e == p0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f10218a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        String str = this.f10219b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f10220c.hashCode()) * 1000003;
        o1 o1Var = this.d;
        if (o1Var != null) {
            i10 = o1Var.hashCode();
        }
        return ((hashCode3 ^ i10) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f10218a);
        sb.append(", reason=");
        sb.append(this.f10219b);
        sb.append(", frames=");
        sb.append(this.f10220c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return android.support.v4.media.a.m(this.e, "}", sb);
    }
}
