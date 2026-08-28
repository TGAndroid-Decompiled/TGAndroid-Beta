package d3;
public final class b {
    public final long f4292a;
    public final w2.i f4293b;
    public final w2.h f4294c;

    public b(long j10, w2.i iVar, w2.h hVar) {
        this.f4292a = j10;
        this.f4293b = iVar;
        this.f4294c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f4292a == bVar.f4292a && this.f4293b.equals(bVar.f4293b) && this.f4294c.equals(bVar.f4294c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f4292a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f4293b.hashCode()) * 1000003) ^ this.f4294c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f4292a + ", transportContext=" + this.f4293b + ", event=" + this.f4294c + "}";
    }
}
