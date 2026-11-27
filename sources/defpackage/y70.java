package defpackage;

import java.util.ArrayList;
public final class y70 extends bh0 {
    public final ArrayList a;

    public y70(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bh0) {
            return this.a.equals(((y70) ((bh0) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
