package a9;
public final class v {
    public final int f378a;
    public final long f379b;

    public v(int i10, long j3) {
        this.f378a = i10;
        this.f379b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof v) {
                v vVar = (v) obj;
                if (this.f378a == vVar.f378a && this.f379b == vVar.f379b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j3 = this.f379b;
        return ((this.f378a ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f378a);
        sb2.append(", eventTimestamp=");
        return a4.a.r(sb2, this.f379b, "}");
    }
}
