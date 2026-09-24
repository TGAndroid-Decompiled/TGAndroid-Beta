package na;

import java.util.ArrayList;
public final class a {
    public final String f15400a;
    public final ArrayList f15401b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f15400a = str;
            this.f15401b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f15400a.equals(aVar.f15400a) && this.f15401b.equals(aVar.f15401b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f15400a.hashCode() ^ 1000003) * 1000003) ^ this.f15401b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f15400a + ", usedDates=" + this.f15401b + "}";
    }
}
