package k8;
public final class t {
    public final int f14705a;
    public final long f14706b;

    public t(int i9, long j10) {
        this.f14705a = i9;
        this.f14706b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (this.f14705a == tVar.f14705a && this.f14706b == tVar.f14706b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f14706b;
        return ((this.f14705a ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f14705a);
        sb2.append(", eventTimestamp=");
        return aa.d.q(sb2, this.f14706b, "}");
    }
}
