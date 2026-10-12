package a9;
public final class w {
    public final int f355a;
    public final long f356b;

    public w(int i10, long j10) {
        this.f355a = i10;
        this.f356b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                if (this.f355a == wVar.f355a && this.f356b == wVar.f356b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f356b;
        return ((this.f355a ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f355a);
        sb2.append(", eventTimestamp=");
        return a1.g.r(sb2, this.f356b, "}");
    }
}
