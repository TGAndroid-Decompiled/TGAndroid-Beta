package oa;

import java.util.ArrayList;
public final class a {
    public final String f17711a;
    public final ArrayList f17712b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f17711a = str;
            this.f17712b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f17711a.equals(aVar.f17711a) && this.f17712b.equals(aVar.f17712b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f17711a.hashCode() ^ 1000003) * 1000003) ^ this.f17712b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f17711a + ", usedDates=" + this.f17712b + "}";
    }
}
