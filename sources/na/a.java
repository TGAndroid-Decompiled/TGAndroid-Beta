package na;

import java.util.ArrayList;
public final class a {
    public final String f15186a;
    public final ArrayList f15187b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f15186a = str;
            this.f15187b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f15186a.equals(aVar.f15186a) && this.f15187b.equals(aVar.f15187b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f15186a.hashCode() ^ 1000003) * 1000003) ^ this.f15187b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f15186a + ", usedDates=" + this.f15187b + "}";
    }
}
