package a9;
public final class w {
    public final int f359a;
    public final long f360b;

    public w(int i10, long j10) {
        this.f359a = i10;
        this.f360b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                if (this.f359a == wVar.f359a && this.f360b == wVar.f360b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f360b;
        return ((this.f359a ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f359a);
        sb2.append(", eventTimestamp=");
        return a1.g.r(sb2, this.f360b, "}");
    }
}
