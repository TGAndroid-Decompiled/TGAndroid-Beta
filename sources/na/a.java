package na;

import java.util.ArrayList;
public final class a {
    public final String f16825a;
    public final ArrayList f16826b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f16825a = str;
            this.f16826b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f16825a.equals(aVar.f16825a) && this.f16826b.equals(aVar.f16826b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f16825a.hashCode() ^ 1000003) * 1000003) ^ this.f16826b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f16825a + ", usedDates=" + this.f16826b + "}";
    }
}
