package a9;
public final class w {
    public final int f352a;
    public final long f353b;

    public w(int i10, long j3) {
        this.f352a = i10;
        this.f353b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                if (this.f352a == wVar.f352a && this.f353b == wVar.f353b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j3 = this.f353b;
        return ((this.f352a ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f352a);
        sb2.append(", eventTimestamp=");
        return a4.a.r(sb2, this.f353b, "}");
    }
}
