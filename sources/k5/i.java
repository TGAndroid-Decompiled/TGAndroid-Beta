package k5;

import java.util.ArrayList;
public final class i extends o {
    public final ArrayList f14780a;

    public i(ArrayList arrayList) {
        this.f14780a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f14780a.equals(((i) ((o) obj)).f14780a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14780a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f14780a + "}";
    }
}
