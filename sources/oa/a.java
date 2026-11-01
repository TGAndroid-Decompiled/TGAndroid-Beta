package oa;

import java.util.ArrayList;
public final class a {
    public final String f14113a;
    public final ArrayList f14114b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f14113a = str;
            this.f14114b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f14113a.equals(aVar.f14113a) && this.f14114b.equals(aVar.f14114b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f14113a.hashCode() ^ 1000003) * 1000003) ^ this.f14114b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f14113a + ", usedDates=" + this.f14114b + "}";
    }
}
