package d9;

import a8.p0;
public final class t {
    public final int f7645a;
    public final long f7646b;

    public t(int i7, long j3) {
        this.f7645a = i7;
        this.f7646b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (this.f7645a == tVar.f7645a && this.f7646b == tVar.f7646b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j3 = this.f7646b;
        return ((this.f7645a ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f7645a);
        sb2.append(", eventTimestamp=");
        return p0.r(sb2, this.f7646b, "}");
    }
}
