package defpackage;
public final class q4d {
    public final byte a;
    public final long b;

    public q4d(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q4d) {
                q4d q4dVar = (q4d) obj;
                if (this.a == q4dVar.a && this.b == q4dVar.b) {
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
        return qu6.p(sb, this.b, "}");
    }
}
