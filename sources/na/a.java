package na;

import java.util.ArrayList;
public final class a {
    public final String f15420a;
    public final ArrayList f15421b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f15420a = str;
            this.f15421b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f15420a.equals(aVar.f15420a) && this.f15421b.equals(aVar.f15421b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f15420a.hashCode() ^ 1000003) * 1000003) ^ this.f15421b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f15420a + ", usedDates=" + this.f15421b + "}";
    }
}
