package oa;

import java.util.ArrayList;
public final class a {
    public final String f14112a;
    public final ArrayList f14113b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f14112a = str;
            this.f14113b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f14112a.equals(aVar.f14112a) && this.f14113b.equals(aVar.f14113b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f14112a.hashCode() ^ 1000003) * 1000003) ^ this.f14113b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f14112a + ", usedDates=" + this.f14113b + "}";
    }
}
