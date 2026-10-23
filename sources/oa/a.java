package oa;

import java.util.ArrayList;
public final class a {
    public final String f17775a;
    public final ArrayList f17776b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f17775a = str;
            this.f17776b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f17775a.equals(aVar.f17775a) && this.f17776b.equals(aVar.f17776b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f17775a.hashCode() ^ 1000003) * 1000003) ^ this.f17776b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f17775a + ", usedDates=" + this.f17776b + "}";
    }
}
