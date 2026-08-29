package f3;
public final class b {
    public final long f6529a;
    public final y2.i f6530b;
    public final y2.h f6531c;

    public b(long j10, y2.i iVar, y2.h hVar) {
        this.f6529a = j10;
        this.f6530b = iVar;
        this.f6531c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f6529a == bVar.f6529a && this.f6530b.equals(bVar.f6530b) && this.f6531c.equals(bVar.f6531c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f6529a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f6530b.hashCode()) * 1000003) ^ this.f6531c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f6529a + ", transportContext=" + this.f6530b + ", event=" + this.f6531c + "}";
    }
}
