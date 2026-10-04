package na;

import java.util.ArrayList;
public final class a {
    public final String f16856a;
    public final ArrayList f16857b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f16856a = str;
            this.f16857b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f16856a.equals(aVar.f16856a) && this.f16857b.equals(aVar.f16857b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f16856a.hashCode() ^ 1000003) * 1000003) ^ this.f16857b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f16856a + ", usedDates=" + this.f16857b + "}";
    }
}
