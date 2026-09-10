package a9;
public final class w {
    public final int f351a;
    public final long f352b;

    public w(int i10, long j3) {
        this.f351a = i10;
        this.f352b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                if (this.f351a == wVar.f351a && this.f352b == wVar.f352b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j3 = this.f352b;
        return ((this.f351a ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f351a);
        sb2.append(", eventTimestamp=");
        return a4.a.r(sb2, this.f352b, "}");
    }
}
