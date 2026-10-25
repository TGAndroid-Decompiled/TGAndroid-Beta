package b9;
public final class u {
    public final int f3716a;
    public final long f3717b;

    public u(int i10, long j10) {
        this.f3716a = i10;
        this.f3717b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof u) {
                u uVar = (u) obj;
                if (this.f3716a == uVar.f3716a && this.f3717b == uVar.f3717b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f3717b;
        return ((this.f3716a ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f3716a);
        sb2.append(", eventTimestamp=");
        return a1.g.r(sb2, this.f3717b, "}");
    }
}
