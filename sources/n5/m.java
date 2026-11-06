package n5;

import java.util.ArrayList;
public final class m extends w {
    public final ArrayList f20458a;

    public m(ArrayList arrayList) {
        this.f20458a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f20458a.equals(((m) ((w) obj)).f20458a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20458a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f20458a + "}";
    }
}
