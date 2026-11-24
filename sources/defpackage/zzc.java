package defpackage;
public final class zzc {
    public final byte a;
    public final long b;

    public zzc(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof zzc) {
                zzc zzcVar = (zzc) obj;
                if (this.a == zzcVar.a && this.b == zzcVar.b) {
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
        return ls6.p(sb, this.b, "}");
    }
}
