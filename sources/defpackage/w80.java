package defpackage;

import java.util.ArrayList;
public final class w80 extends ai0 {
    public final ArrayList a;

    public w80(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ai0) {
            return this.a.equals(((w80) ((ai0) obj)).a);
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
