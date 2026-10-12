package oa;

import java.util.ArrayList;
public final class a {
    public final String f16621a;
    public final ArrayList f16622b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f16621a = str;
            this.f16622b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f16621a.equals(aVar.f16621a) && this.f16622b.equals(aVar.f16622b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f16621a.hashCode() ^ 1000003) * 1000003) ^ this.f16622b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f16621a + ", usedDates=" + this.f16622b + "}";
    }
}
