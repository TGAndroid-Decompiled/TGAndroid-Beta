package d9;

import a8.p0;
public final class t {
    public final int f7956a;
    public final long f7957b;

    public t(int i7, long j3) {
        this.f7956a = i7;
        this.f7957b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (this.f7956a == tVar.f7956a && this.f7957b == tVar.f7957b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j3 = this.f7957b;
        return ((this.f7956a ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f7956a);
        sb2.append(", eventTimestamp=");
        return p0.r(sb2, this.f7957b, "}");
    }
}
