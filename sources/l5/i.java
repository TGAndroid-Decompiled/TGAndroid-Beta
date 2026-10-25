package l5;

import java.util.ArrayList;
public final class i extends o {
    public final ArrayList f16899a;

    public i(ArrayList arrayList) {
        this.f16899a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f16899a.equals(((i) ((o) obj)).f16899a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16899a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f16899a + "}";
    }
}
