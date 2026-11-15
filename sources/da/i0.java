package da;

import java.util.List;
public final class i0 extends x1 {
    public final List f7764a;
    public final String f7765b;

    public i0(String str, List list) {
        this.f7764a = list;
        this.f7765b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            i0 i0Var = (i0) ((x1) obj);
            String str2 = i0Var.f7765b;
            if (this.f7764a.equals(i0Var.f7764a) && ((str = this.f7765b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f7764a.hashCode() ^ 1000003) * 1000003;
        String str = this.f7765b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f7764a);
        sb2.append(", orgId=");
        return a8.p0.s(sb2, this.f7765b, "}");
    }
}
