package na;

import java.util.ArrayList;
public final class a {
    public final String f15416a;
    public final ArrayList f15417b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f15416a = str;
            this.f15417b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f15416a.equals(aVar.f15416a) && this.f15417b.equals(aVar.f15417b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f15416a.hashCode() ^ 1000003) * 1000003) ^ this.f15417b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f15416a + ", usedDates=" + this.f15417b + "}";
    }
}
