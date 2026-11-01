package k5;

import java.util.ArrayList;
public final class i extends o {
    public final ArrayList f10904a;

    public i(ArrayList arrayList) {
        this.f10904a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f10904a.equals(((i) ((o) obj)).f10904a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10904a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f10904a + "}";
    }
}
