package oa;

import java.util.ArrayList;
public final class a {
    public final String f17714a;
    public final ArrayList f17715b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f17714a = str;
            this.f17715b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f17714a.equals(aVar.f17714a) && this.f17715b.equals(aVar.f17715b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f17714a.hashCode() ^ 1000003) * 1000003) ^ this.f17715b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f17714a + ", usedDates=" + this.f17715b + "}";
    }
}
