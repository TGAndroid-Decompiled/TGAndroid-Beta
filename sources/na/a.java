package na;

import java.util.ArrayList;
public final class a {
    public final String f15188a;
    public final ArrayList f15189b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f15188a = str;
            this.f15189b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f15188a.equals(aVar.f15188a) && this.f15189b.equals(aVar.f15189b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f15188a.hashCode() ^ 1000003) * 1000003) ^ this.f15189b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f15188a + ", usedDates=" + this.f15189b + "}";
    }
}
