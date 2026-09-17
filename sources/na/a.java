package na;

import java.util.ArrayList;
public final class a {
    public final String f16735a;
    public final ArrayList f16736b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f16735a = str;
            this.f16736b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f16735a.equals(aVar.f16735a) && this.f16736b.equals(aVar.f16736b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f16735a.hashCode() ^ 1000003) * 1000003) ^ this.f16736b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f16735a + ", usedDates=" + this.f16736b + "}";
    }
}
