package na;

import java.util.ArrayList;
public final class a {
    public final String f16577a;
    public final ArrayList f16578b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f16577a = str;
            this.f16578b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f16577a.equals(aVar.f16577a) && this.f16578b.equals(aVar.f16578b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f16577a.hashCode() ^ 1000003) * 1000003) ^ this.f16578b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f16577a + ", usedDates=" + this.f16578b + "}";
    }
}
