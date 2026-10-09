package a9;
public final class w {
    public final int f379a;
    public final long f380b;

    public w(int i10, long j3) {
        this.f379a = i10;
        this.f380b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                if (this.f379a == wVar.f379a && this.f380b == wVar.f380b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j3 = this.f380b;
        return ((this.f379a ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f379a);
        sb2.append(", eventTimestamp=");
        return a1.g.s(sb2, this.f380b, "}");
    }
}
