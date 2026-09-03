package o8;
public final class s {
    public final int f16480a;
    public final long f16481b;

    public s(int i10, long j10) {
        this.f16480a = i10;
        this.f16481b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                s sVar = (s) obj;
                if (this.f16480a == sVar.f16480a && this.f16481b == sVar.f16481b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f16481b;
        return ((this.f16480a ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(this.f16480a);
        sb.append(", eventTimestamp=");
        return android.support.v4.media.a.q(sb, this.f16481b, "}");
    }
}
