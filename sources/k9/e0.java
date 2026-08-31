package k9;

import java.util.List;
public final class e0 extends j1 {
    public final List f10863a;
    public final String f10864b;

    public e0(String str, List list) {
        this.f10863a = list;
        this.f10864b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            e0 e0Var = (e0) ((j1) obj);
            String str2 = e0Var.f10864b;
            if (this.f10863a.equals(e0Var.f10863a) && ((str = this.f10864b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f10863a.hashCode() ^ 1000003) * 1000003;
        String str = this.f10864b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f10863a);
        sb.append(", orgId=");
        return android.support.v4.media.a.r(sb, this.f10864b, "}");
    }
}
