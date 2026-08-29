package i9;

import java.util.List;
public final class p0 extends o1 {
    public final String f8754a;
    public final String f8755b;
    public final List f8756c;
    public final o1 d;
    public final int f8757e;

    public p0(String str, String str2, List list, o1 o1Var, int i10) {
        this.f8754a = str;
        this.f8755b = str2;
        this.f8756c = list;
        this.d = o1Var;
        this.f8757e = i10;
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
            String str2 = p0Var.f8755b;
            if (this.f8754a.equals(p0Var.f8754a) && ((str = this.f8755b) != null ? str.equals(str2) : str2 == null) && this.f8756c.equals(p0Var.f8756c) && ((o1Var = this.d) != null ? o1Var.equals(o1Var2) : o1Var2 == null) && this.f8757e == p0Var.f8757e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f8754a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        String str = this.f8755b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f8756c.hashCode()) * 1000003;
        o1 o1Var = this.d;
        if (o1Var != null) {
            i10 = o1Var.hashCode();
        }
        return ((hashCode3 ^ i10) * 1000003) ^ this.f8757e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f8754a);
        sb2.append(", reason=");
        sb2.append(this.f8755b);
        sb2.append(", frames=");
        sb2.append(this.f8756c);
        sb2.append(", causedBy=");
        sb2.append(this.d);
        sb2.append(", overflowCount=");
        return a4.w.l(this.f8757e, "}", sb2);
    }
}
