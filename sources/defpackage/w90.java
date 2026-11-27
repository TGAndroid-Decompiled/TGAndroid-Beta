package defpackage;

import java.util.ArrayList;
public final class w90 {
    public final String a;
    public final ArrayList b;

    public w90(String str, ArrayList arrayList) {
        if (str != null) {
            this.a = str;
            this.b = arrayList;
            return;
        }
        p3d.h("Null userAgent");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof w90) {
                w90 w90Var = (w90) obj;
                if (this.a.equals(w90Var.a) && this.b.equals(w90Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
