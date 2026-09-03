package o8;
public final class s {
    public final int f16661a;
    public final long f16662b;

    public s(int i10, long j10) {
        this.f16661a = i10;
        this.f16662b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                s sVar = (s) obj;
                if (this.f16661a == sVar.f16661a && this.f16662b == sVar.f16662b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f16662b;
        return ((this.f16661a ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(this.f16661a);
        sb.append(", eventTimestamp=");
        return android.support.v4.media.a.q(sb, this.f16662b, "}");
    }
}
