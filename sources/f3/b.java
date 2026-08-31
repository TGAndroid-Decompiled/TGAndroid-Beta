package f3;
public final class b {
    public final long f5973a;
    public final y2.i f5974b;
    public final y2.h f5975c;

    public b(long j10, y2.i iVar, y2.h hVar) {
        this.f5973a = j10;
        this.f5974b = iVar;
        this.f5975c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f5973a == bVar.f5973a && this.f5974b.equals(bVar.f5974b) && this.f5975c.equals(bVar.f5975c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f5973a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f5974b.hashCode()) * 1000003) ^ this.f5975c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f5973a + ", transportContext=" + this.f5974b + ", event=" + this.f5975c + "}";
    }
}
