package defpackage;

import java.util.List;
public final class w80 extends ry2 {
    public final String a;
    public final String b;
    public final List c;
    public final ry2 d;
    public final int e;

    public w80(String str, String str2, List list, ry2 ry2Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = ry2Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ry2) {
            w80 w80Var = (w80) ((ry2) obj);
            if (this.a.equals(w80Var.a)) {
                String str = w80Var.b;
                String str2 = this.b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.c.equals(w80Var.c)) {
                        ry2 ry2Var = w80Var.d;
                        ry2 ry2Var2 = this.d;
                        if (ry2Var2 != null ? ry2Var2.equals(ry2Var) : ry2Var == null) {
                            if (this.e == w80Var.e) {
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
        ry2 ry2Var = this.d;
        if (ry2Var != null) {
            i = ry2Var.hashCode();
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
        return de9.l(sb, this.e, "}");
    }
}
