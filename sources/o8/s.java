package o8;
public final class s {
    public final int f16659a;
    public final long f16660b;

    public s(int i10, long j10) {
        this.f16659a = i10;
        this.f16660b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                s sVar = (s) obj;
                if (this.f16659a == sVar.f16659a && this.f16660b == sVar.f16660b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f16660b;
        return ((this.f16659a ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(this.f16659a);
        sb.append(", eventTimestamp=");
        return android.support.v4.media.a.q(sb, this.f16660b, "}");
    }
}
