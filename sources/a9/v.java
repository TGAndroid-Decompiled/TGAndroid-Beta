package a9;
public final class v {
    public final int f366a;
    public final long f367b;

    public v(int i10, long j3) {
        this.f366a = i10;
        this.f367b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof v) {
                v vVar = (v) obj;
                if (this.f366a == vVar.f366a && this.f367b == vVar.f367b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j3 = this.f367b;
        return ((this.f366a ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f366a);
        sb2.append(", eventTimestamp=");
        return a4.a.r(sb2, this.f367b, "}");
    }
}
