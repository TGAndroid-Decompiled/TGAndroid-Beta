package oa;

import java.util.ArrayList;
public final class a {
    public final String f17715a;
    public final ArrayList f17716b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f17715a = str;
            this.f17716b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f17715a.equals(aVar.f17715a) && this.f17716b.equals(aVar.f17716b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f17715a.hashCode() ^ 1000003) * 1000003) ^ this.f17716b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f17715a + ", usedDates=" + this.f17716b + "}";
    }
}
