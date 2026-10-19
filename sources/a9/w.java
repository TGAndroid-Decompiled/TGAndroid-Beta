package a9;
public final class w {
    public final int f357a;
    public final long f358b;

    public w(int i10, long j10) {
        this.f357a = i10;
        this.f358b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                if (this.f357a == wVar.f357a && this.f358b == wVar.f358b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f358b;
        return ((this.f357a ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f357a);
        sb2.append(", eventTimestamp=");
        return a1.g.r(sb2, this.f358b, "}");
    }
}
