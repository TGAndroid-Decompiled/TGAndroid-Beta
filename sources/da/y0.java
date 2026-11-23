package da;

import java.util.List;
public final class y0 extends e2 {
    public final String f8228a;
    public final String f8229b;
    public final List f8230c;
    public final e2 d;
    public final int f8231e;

    public y0(String str, String str2, List list, e2 e2Var, int i7) {
        this.f8228a = str;
        this.f8229b = str2;
        this.f8230c = list;
        this.d = e2Var;
        this.f8231e = i7;
    }

    public final boolean equals(Object obj) {
        String str;
        e2 e2Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            y0 y0Var = (y0) ((e2) obj);
            e2 e2Var2 = y0Var.d;
            String str2 = y0Var.f8229b;
            if (this.f8228a.equals(y0Var.f8228a) && ((str = this.f8229b) != null ? str.equals(str2) : str2 == null) && this.f8230c.equals(y0Var.f8230c) && ((e2Var = this.d) != null ? e2Var.equals(e2Var2) : e2Var2 == null) && this.f8231e == y0Var.f8231e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f8228a.hashCode() ^ 1000003) * 1000003;
        int i7 = 0;
        String str = this.f8229b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f8230c.hashCode()) * 1000003;
        e2 e2Var = this.d;
        if (e2Var != null) {
            i7 = e2Var.hashCode();
        }
        return ((hashCode3 ^ i7) * 1000003) ^ this.f8231e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f8228a);
        sb2.append(", reason=");
        sb2.append(this.f8229b);
        sb2.append(", frames=");
        sb2.append(this.f8230c);
        sb2.append(", causedBy=");
        sb2.append(this.d);
        sb2.append(", overflowCount=");
        return a8.p0.n(this.f8231e, "}", sb2);
    }
}
