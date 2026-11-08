package n5;

import java.util.ArrayList;
public final class m extends w {
    public final ArrayList f20461a;

    public m(ArrayList arrayList) {
        this.f20461a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f20461a.equals(((m) ((w) obj)).f20461a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20461a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f20461a + "}";
    }
}
