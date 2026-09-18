package k5;

import java.util.ArrayList;
public final class i extends o {
    public final ArrayList f13477a;

    public i(ArrayList arrayList) {
        this.f13477a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f13477a.equals(((i) ((o) obj)).f13477a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13477a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f13477a + "}";
    }
}
