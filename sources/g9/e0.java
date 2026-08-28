package g9;

import java.util.List;
public final class e0 extends j1 {
    public final List f7508a;
    public final String f7509b;

    public e0(String str, List list) {
        this.f7508a = list;
        this.f7509b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            e0 e0Var = (e0) ((j1) obj);
            String str2 = e0Var.f7509b;
            if (this.f7508a.equals(e0Var.f7508a) && ((str = this.f7509b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f7508a.hashCode() ^ 1000003) * 1000003;
        String str = this.f7509b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f7508a);
        sb2.append(", orgId=");
        return aa.d.r(sb2, this.f7509b, "}");
    }
}
