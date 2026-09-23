package na;

import java.util.ArrayList;
public final class a {
    public final String f15163a;
    public final ArrayList f15164b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f15163a = str;
            this.f15164b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f15163a.equals(aVar.f15163a) && this.f15164b.equals(aVar.f15164b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f15163a.hashCode() ^ 1000003) * 1000003) ^ this.f15164b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f15163a + ", usedDates=" + this.f15164b + "}";
    }
}
