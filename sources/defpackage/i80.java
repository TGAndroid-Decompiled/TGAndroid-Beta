package defpackage;

import java.util.List;
public final class i80 extends fz2 {
    public final List a;
    public final String b;

    public i80(String str, List list) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof fz2) {
                i80 i80Var = (i80) ((fz2) obj);
                if (this.a.equals(i80Var.a)) {
                    String str = i80Var.b;
                    String str2 = this.b;
                    if (str2 == null) {
                        if (str == null) {
                            return true;
                        }
                        return false;
                    } else if (str2.equals(str)) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return c00.k(sb, this.b, "}");
    }
}
