package m8;
public final class t {
    public final int f16926a;
    public final long f16927b;

    public t(int i10, long j10) {
        this.f16926a = i10;
        this.f16927b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (this.f16926a == tVar.f16926a && this.f16927b == tVar.f16927b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f16927b;
        return ((this.f16926a ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f16926a);
        sb2.append(", eventTimestamp=");
        return a4.w.p(sb2, this.f16927b, "}");
    }
}
