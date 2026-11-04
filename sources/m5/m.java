package m5;

import java.util.ArrayList;
public final class m extends w {
    public final ArrayList f19149a;

    public m(ArrayList arrayList) {
        this.f19149a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f19149a.equals(((m) ((w) obj)).f19149a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19149a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f19149a + "}";
    }
}
