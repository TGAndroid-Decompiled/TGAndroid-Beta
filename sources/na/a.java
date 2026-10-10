package na;

import java.util.ArrayList;
public final class a {
    public final String f16829a;
    public final ArrayList f16830b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f16829a = str;
            this.f16830b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f16829a.equals(aVar.f16829a) && this.f16830b.equals(aVar.f16830b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f16829a.hashCode() ^ 1000003) * 1000003) ^ this.f16830b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f16829a + ", usedDates=" + this.f16830b + "}";
    }
}
