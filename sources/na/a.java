package na;

import java.util.ArrayList;
public final class a {
    public final String f16708a;
    public final ArrayList f16709b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f16708a = str;
            this.f16709b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f16708a.equals(aVar.f16708a) && this.f16709b.equals(aVar.f16709b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f16708a.hashCode() ^ 1000003) * 1000003) ^ this.f16709b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f16708a + ", usedDates=" + this.f16709b + "}";
    }
}
