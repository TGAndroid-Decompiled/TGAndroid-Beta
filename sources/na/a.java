package na;

import java.util.ArrayList;
public final class a {
    public final String f16861a;
    public final ArrayList f16862b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f16861a = str;
            this.f16862b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f16861a.equals(aVar.f16861a) && this.f16862b.equals(aVar.f16862b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f16861a.hashCode() ^ 1000003) * 1000003) ^ this.f16862b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f16861a + ", usedDates=" + this.f16862b + "}";
    }
}
