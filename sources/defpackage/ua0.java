package defpackage;

import java.util.ArrayList;
public final class ua0 {
    public final String a;
    public final ArrayList b;

    public ua0(String str, ArrayList arrayList) {
        if (str != null) {
            this.a = str;
            this.b = arrayList;
            return;
        }
        gxc.d("Null userAgent");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ua0) {
                ua0 ua0Var = (ua0) obj;
                if (this.a.equals(ua0Var.a) && this.b.equals(ua0Var.b)) {
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
