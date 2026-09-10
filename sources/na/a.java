package na;

import java.util.ArrayList;
public final class a {
    public final String f14018a;
    public final ArrayList f14019b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f14018a = str;
            this.f14019b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f14018a.equals(aVar.f14018a) && this.f14019b.equals(aVar.f14019b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f14018a.hashCode() ^ 1000003) * 1000003) ^ this.f14019b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f14018a + ", usedDates=" + this.f14019b + "}";
    }
}
