package na;

import java.util.ArrayList;
public final class a {
    public final String f15407a;
    public final ArrayList f15408b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f15407a = str;
            this.f15408b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f15407a.equals(aVar.f15407a) && this.f15408b.equals(aVar.f15408b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f15407a.hashCode() ^ 1000003) * 1000003) ^ this.f15408b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f15407a + ", usedDates=" + this.f15408b + "}";
    }
}
