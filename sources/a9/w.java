package a9;
public final class w {
    public final int f358a;
    public final long f359b;

    public w(int i10, long j10) {
        this.f358a = i10;
        this.f359b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                if (this.f358a == wVar.f358a && this.f359b == wVar.f359b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f359b;
        return ((this.f358a ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f358a);
        sb2.append(", eventTimestamp=");
        return a1.g.r(sb2, this.f359b, "}");
    }
}
