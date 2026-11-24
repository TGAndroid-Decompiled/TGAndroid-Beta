package defpackage;

import java.util.ArrayList;
public final class w70 extends ah0 {
    public final ArrayList a;

    public w70(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ah0) {
            return this.a.equals(((w70) ((ah0) obj)).a);
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
