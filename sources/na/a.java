package na;

import java.util.ArrayList;
public final class a {
    public final String f16578a;
    public final ArrayList f16579b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f16578a = str;
            this.f16579b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f16578a.equals(aVar.f16578a) && this.f16579b.equals(aVar.f16579b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f16578a.hashCode() ^ 1000003) * 1000003) ^ this.f16579b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f16578a + ", usedDates=" + this.f16579b + "}";
    }
}
