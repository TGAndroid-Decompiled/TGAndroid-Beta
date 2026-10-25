package aa;

import java.util.List;
public final class f0 extends l1 {
    public final List f1077a;
    public final String f1078b;

    public f0(String str, List list) {
        this.f1077a = list;
        this.f1078b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l1) {
            f0 f0Var = (f0) ((l1) obj);
            String str2 = f0Var.f1078b;
            if (this.f1077a.equals(f0Var.f1077a) && ((str = this.f1078b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f1077a.hashCode() ^ 1000003) * 1000003;
        String str = this.f1078b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f1077a);
        sb2.append(", orgId=");
        return a1.g.s(sb2, this.f1078b, "}");
    }
}
