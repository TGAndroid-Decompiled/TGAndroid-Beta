package f3;
public final class b {
    public final long f5866a;
    public final y2.i f5867b;
    public final y2.h f5868c;

    public b(long j10, y2.i iVar, y2.h hVar) {
        this.f5866a = j10;
        this.f5867b = iVar;
        this.f5868c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f5866a == bVar.f5866a && this.f5867b.equals(bVar.f5867b) && this.f5868c.equals(bVar.f5868c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f5866a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f5867b.hashCode()) * 1000003) ^ this.f5868c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f5866a + ", transportContext=" + this.f5867b + ", event=" + this.f5868c + "}";
    }
}
