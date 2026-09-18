package na;

import java.util.ArrayList;
public final class a {
    public final String f15198a;
    public final ArrayList f15199b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f15198a = str;
            this.f15199b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f15198a.equals(aVar.f15198a) && this.f15199b.equals(aVar.f15199b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f15198a.hashCode() ^ 1000003) * 1000003) ^ this.f15199b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f15198a + ", usedDates=" + this.f15199b + "}";
    }
}
