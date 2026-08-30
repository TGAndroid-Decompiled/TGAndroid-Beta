package f3;
public final class b {
    public final long f5877a;
    public final y2.i f5878b;
    public final y2.h f5879c;

    public b(long j10, y2.i iVar, y2.h hVar) {
        this.f5877a = j10;
        this.f5878b = iVar;
        this.f5879c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f5877a == bVar.f5877a && this.f5878b.equals(bVar.f5878b) && this.f5879c.equals(bVar.f5879c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f5877a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f5878b.hashCode()) * 1000003) ^ this.f5879c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f5877a + ", transportContext=" + this.f5878b + ", event=" + this.f5879c + "}";
    }
}
