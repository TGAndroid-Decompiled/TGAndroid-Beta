package d9;

import a8.p0;
public final class t {
    public final int f8258a;
    public final long f8259b;

    public t(int i7, long j3) {
        this.f8258a = i7;
        this.f8259b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (this.f8258a == tVar.f8258a && this.f8259b == tVar.f8259b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j3 = this.f8259b;
        return ((this.f8258a ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f8258a);
        sb2.append(", eventTimestamp=");
        return p0.r(sb2, this.f8259b, "}");
    }
}
