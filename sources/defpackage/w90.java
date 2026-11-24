package defpackage;

import java.util.List;
public final class w90 extends c03 {
    public final String a;
    public final String b;
    public final List c;
    public final c03 d;
    public final int e;

    public w90(String str, String str2, List list, c03 c03Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = c03Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c03) {
            w90 w90Var = (w90) ((c03) obj);
            if (this.a.equals(w90Var.a)) {
                String str = w90Var.b;
                String str2 = this.b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.c.equals(w90Var.c)) {
                        c03 c03Var = w90Var.d;
                        c03 c03Var2 = this.d;
                        if (c03Var2 != null ? c03Var2.equals(c03Var) : c03Var == null) {
                            if (this.e == w90Var.e) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003;
        c03 c03Var = this.d;
        if (c03Var != null) {
            i = c03Var.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return hg9.k(sb, this.e, "}");
    }
}
