package defpackage;

import java.util.ArrayList;
public final class u90 {
    public final String a;
    public final ArrayList b;

    public u90(String str, ArrayList arrayList) {
        if (str != null) {
            this.a = str;
            this.b = arrayList;
            return;
        }
        fvc.f("Null userAgent");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof u90) {
                u90 u90Var = (u90) obj;
                if (this.a.equals(u90Var.a) && this.b.equals(u90Var.b)) {
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
