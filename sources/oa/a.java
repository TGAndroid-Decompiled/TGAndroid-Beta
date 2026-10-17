package oa;

import java.util.ArrayList;
public final class a {
    public final String f17708a;
    public final ArrayList f17709b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f17708a = str;
            this.f17709b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f17708a.equals(aVar.f17708a) && this.f17709b.equals(aVar.f17709b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f17708a.hashCode() ^ 1000003) * 1000003) ^ this.f17709b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f17708a + ", usedDates=" + this.f17709b + "}";
    }
}
