package k5;

import java.util.ArrayList;
public final class i extends o {
    public final ArrayList f13464a;

    public i(ArrayList arrayList) {
        this.f13464a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f13464a.equals(((i) ((o) obj)).f13464a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13464a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f13464a + "}";
    }
}
