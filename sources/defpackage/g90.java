package defpackage;

import java.util.List;
public final class g90 extends vz2 {
    public final List a;
    public final String b;

    public g90(String str, List list) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof vz2) {
                g90 g90Var = (g90) ((vz2) obj);
                if (this.a.equals(g90Var.a)) {
                    String str = g90Var.b;
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
        return b10.j(sb, this.b, "}");
    }
}
