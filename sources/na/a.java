package na;

import java.util.ArrayList;
public final class a {
    public final String f15372a;
    public final ArrayList f15373b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f15372a = str;
            this.f15373b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f15372a.equals(aVar.f15372a) && this.f15373b.equals(aVar.f15373b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f15372a.hashCode() ^ 1000003) * 1000003) ^ this.f15373b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f15372a + ", usedDates=" + this.f15373b + "}";
    }
}
