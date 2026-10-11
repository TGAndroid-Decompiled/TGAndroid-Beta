package na;

import java.util.ArrayList;
public final class a {
    public final String f16874a;
    public final ArrayList f16875b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f16874a = str;
            this.f16875b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f16874a.equals(aVar.f16874a) && this.f16875b.equals(aVar.f16875b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f16874a.hashCode() ^ 1000003) * 1000003) ^ this.f16875b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f16874a + ", usedDates=" + this.f16875b + "}";
    }
}
