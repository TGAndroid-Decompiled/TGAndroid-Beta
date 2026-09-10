package k5;

import java.util.ArrayList;
public final class i extends o {
    public final ArrayList f12322a;

    public i(ArrayList arrayList) {
        this.f12322a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f12322a.equals(((i) ((o) obj)).f12322a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12322a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f12322a + "}";
    }
}
