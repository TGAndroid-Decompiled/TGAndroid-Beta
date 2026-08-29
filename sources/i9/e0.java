package i9;

import java.util.List;
public final class e0 extends j1 {
    public final List f8643a;
    public final String f8644b;

    public e0(String str, List list) {
        this.f8643a = list;
        this.f8644b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            e0 e0Var = (e0) ((j1) obj);
            String str2 = e0Var.f8644b;
            if (this.f8643a.equals(e0Var.f8643a) && ((str = this.f8644b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f8643a.hashCode() ^ 1000003) * 1000003;
        String str = this.f8644b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f8643a);
        sb2.append(", orgId=");
        return a4.w.q(sb2, this.f8644b, "}");
    }
}
