package da;

import java.util.List;
public final class y0 extends e2 {
    public final String f7955a;
    public final String f7956b;
    public final List f7957c;
    public final e2 d;
    public final int f7958e;

    public y0(String str, String str2, List list, e2 e2Var, int i7) {
        this.f7955a = str;
        this.f7956b = str2;
        this.f7957c = list;
        this.d = e2Var;
        this.f7958e = i7;
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
            String str2 = y0Var.f7956b;
            if (this.f7955a.equals(y0Var.f7955a) && ((str = this.f7956b) != null ? str.equals(str2) : str2 == null) && this.f7957c.equals(y0Var.f7957c) && ((e2Var = this.d) != null ? e2Var.equals(e2Var2) : e2Var2 == null) && this.f7958e == y0Var.f7958e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f7955a.hashCode() ^ 1000003) * 1000003;
        int i7 = 0;
        String str = this.f7956b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f7957c.hashCode()) * 1000003;
        e2 e2Var = this.d;
        if (e2Var != null) {
            i7 = e2Var.hashCode();
        }
        return ((hashCode3 ^ i7) * 1000003) ^ this.f7958e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f7955a);
        sb2.append(", reason=");
        sb2.append(this.f7956b);
        sb2.append(", frames=");
        sb2.append(this.f7957c);
        sb2.append(", causedBy=");
        sb2.append(this.d);
        sb2.append(", overflowCount=");
        return a8.p0.n(this.f7958e, "}", sb2);
    }
}
