package defpackage;
public final class a2d {
    public final byte a;
    public final long b;

    public a2d(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a2d) {
                a2d a2dVar = (a2d) obj;
                if (this.a == a2dVar.a && this.b == a2dVar.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.b;
        return ((this.a ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append((int) this.a);
        sb.append(", eventTimestamp=");
        return kt6.q(sb, this.b, "}");
    }
}
