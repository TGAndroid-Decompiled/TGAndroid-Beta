package oa;

import java.util.ArrayList;
public final class a {
    public final String f17712a;
    public final ArrayList f17713b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f17712a = str;
            this.f17713b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f17712a.equals(aVar.f17712a) && this.f17713b.equals(aVar.f17713b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f17712a.hashCode() ^ 1000003) * 1000003) ^ this.f17713b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f17712a + ", usedDates=" + this.f17713b + "}";
    }
}
