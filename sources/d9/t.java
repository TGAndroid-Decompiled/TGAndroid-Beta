package d9;

import a8.p0;
public final class t {
    public final int f8253a;
    public final long f8254b;

    public t(int i7, long j3) {
        this.f8253a = i7;
        this.f8254b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (this.f8253a == tVar.f8253a && this.f8254b == tVar.f8254b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j3 = this.f8254b;
        return ((this.f8253a ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f8253a);
        sb2.append(", eventTimestamp=");
        return p0.r(sb2, this.f8254b, "}");
    }
}
