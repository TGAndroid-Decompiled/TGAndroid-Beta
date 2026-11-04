package ca;

import java.util.List;
public final class i0 extends x1 {
    public final List f4403a;
    public final String f4404b;

    public i0(String str, List list) {
        this.f4403a = list;
        this.f4404b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            i0 i0Var = (i0) ((x1) obj);
            String str2 = i0Var.f4404b;
            if (this.f4403a.equals(i0Var.f4403a) && ((str = this.f4404b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f4403a.hashCode() ^ 1000003) * 1000003;
        String str = this.f4404b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f4403a);
        sb2.append(", orgId=");
        return a1.g.s(sb2, this.f4404b, "}");
    }
}
