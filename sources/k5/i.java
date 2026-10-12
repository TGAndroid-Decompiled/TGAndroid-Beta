package k5;

import java.util.ArrayList;
public final class i extends o {
    public final ArrayList f14668a;

    public i(ArrayList arrayList) {
        this.f14668a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f14668a.equals(((i) ((o) obj)).f14668a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14668a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f14668a + "}";
    }
}
