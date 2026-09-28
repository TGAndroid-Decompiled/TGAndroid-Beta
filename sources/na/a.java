package na;

import java.util.ArrayList;
public final class a {
    public final String f15415a;
    public final ArrayList f15416b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f15415a = str;
            this.f15416b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f15415a.equals(aVar.f15415a) && this.f15416b.equals(aVar.f15416b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f15415a.hashCode() ^ 1000003) * 1000003) ^ this.f15416b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f15415a + ", usedDates=" + this.f15416b + "}";
    }
}
