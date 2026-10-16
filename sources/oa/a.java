package oa;

import java.util.ArrayList;
public final class a {
    public final String f16314a;
    public final ArrayList f16315b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f16314a = str;
            this.f16315b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f16314a.equals(aVar.f16314a) && this.f16315b.equals(aVar.f16315b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f16314a.hashCode() ^ 1000003) * 1000003) ^ this.f16315b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f16314a + ", usedDates=" + this.f16315b + "}";
    }
}
