package na;

import java.util.ArrayList;
public final class a {
    public final String f16851a;
    public final ArrayList f16852b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f16851a = str;
            this.f16852b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f16851a.equals(aVar.f16851a) && this.f16852b.equals(aVar.f16852b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f16851a.hashCode() ^ 1000003) * 1000003) ^ this.f16852b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f16851a + ", usedDates=" + this.f16852b + "}";
    }
}
