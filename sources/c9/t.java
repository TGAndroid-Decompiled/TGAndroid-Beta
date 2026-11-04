package c9;
public final class t {
    public final int f4281a;
    public final long f4282b;

    public t(int i3, long j10) {
        this.f4281a = i3;
        this.f4282b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (this.f4281a == tVar.f4281a && this.f4282b == tVar.f4282b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f4282b;
        return ((this.f4281a ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f4281a);
        sb2.append(", eventTimestamp=");
        return a1.g.r(sb2, this.f4282b, "}");
    }
}
