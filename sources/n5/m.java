package n5;

import java.util.ArrayList;
public final class m extends w {
    public final ArrayList f21030a;

    public m(ArrayList arrayList) {
        this.f21030a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f21030a.equals(((m) ((w) obj)).f21030a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21030a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f21030a + "}";
    }
}
