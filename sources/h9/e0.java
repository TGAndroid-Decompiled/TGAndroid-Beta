package h9;

import java.util.List;

public final class e0 extends j1 {

    public final List f8679a;

    public final String f8680b;

    public e0(String str, List list) {
        this.f8679a = list;
        this.f8680b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            e0 e0Var = (e0) ((j1) obj);
            String str2 = e0Var.f8680b;
            if (this.f8679a.equals(e0Var.f8679a) && ((str = this.f8680b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f8679a.hashCode() ^ 1000003) * 1000003;
        String str = this.f8680b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f8679a);
        sb2.append(", orgId=");
        return a9.p.p(sb2, this.f8680b, "}");
    }
}
