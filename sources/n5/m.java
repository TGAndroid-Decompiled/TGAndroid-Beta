package n5;

import java.util.ArrayList;
public final class m extends w {
    public final ArrayList f20466a;

    public m(ArrayList arrayList) {
        this.f20466a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f20466a.equals(((m) ((w) obj)).f20466a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20466a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f20466a + "}";
    }
}
