package o8;
public final class s {
    public final int f16498a;
    public final long f16499b;

    public s(int i10, long j10) {
        this.f16498a = i10;
        this.f16499b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                s sVar = (s) obj;
                if (this.f16498a == sVar.f16498a && this.f16499b == sVar.f16499b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f16499b;
        return ((this.f16498a ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(this.f16498a);
        sb.append(", eventTimestamp=");
        return android.support.v4.media.a.q(sb, this.f16499b, "}");
    }
}
