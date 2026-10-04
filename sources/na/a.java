package na;

import java.util.ArrayList;
public final class a {
    public final String f16852a;
    public final ArrayList f16853b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f16852a = str;
            this.f16853b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f16852a.equals(aVar.f16852a) && this.f16853b.equals(aVar.f16853b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f16852a.hashCode() ^ 1000003) * 1000003) ^ this.f16853b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f16852a + ", usedDates=" + this.f16853b + "}";
    }
}
