package na;

import java.util.ArrayList;
public final class a {
    public final String f16910a;
    public final ArrayList f16911b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f16910a = str;
            this.f16911b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f16910a.equals(aVar.f16910a) && this.f16911b.equals(aVar.f16911b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f16910a.hashCode() ^ 1000003) * 1000003) ^ this.f16911b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f16910a + ", usedDates=" + this.f16911b + "}";
    }
}
