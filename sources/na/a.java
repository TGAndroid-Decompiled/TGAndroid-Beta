package na;

import java.util.ArrayList;
public final class a {
    public final String f15431a;
    public final ArrayList f15432b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f15431a = str;
            this.f15432b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f15431a.equals(aVar.f15431a) && this.f15432b.equals(aVar.f15432b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f15431a.hashCode() ^ 1000003) * 1000003) ^ this.f15432b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f15431a + ", usedDates=" + this.f15432b + "}";
    }
}
