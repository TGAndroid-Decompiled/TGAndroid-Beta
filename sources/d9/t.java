package d9;

import a8.p0;
public final class t {
    public final int f7927a;
    public final long f7928b;

    public t(int i7, long j3) {
        this.f7927a = i7;
        this.f7928b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (this.f7927a == tVar.f7927a && this.f7928b == tVar.f7928b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j3 = this.f7928b;
        return ((this.f7927a ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f7927a);
        sb2.append(", eventTimestamp=");
        return p0.r(sb2, this.f7928b, "}");
    }
}
