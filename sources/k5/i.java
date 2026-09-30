package k5;

import java.util.ArrayList;
public final class i extends o {
    public final ArrayList f13479a;

    public i(ArrayList arrayList) {
        this.f13479a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f13479a.equals(((i) ((o) obj)).f13479a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13479a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f13479a + "}";
    }
}
