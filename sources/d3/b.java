package d3;

public final class b {

    public final long f4734a;

    public final w2.i f4735b;

    public final w2.h f4736c;

    public b(long j10, w2.i iVar, w2.h hVar) {
        this.f4734a = j10;
        this.f4735b = iVar;
        this.f4736c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f4734a == bVar.f4734a && this.f4735b.equals(bVar.f4735b) && this.f4736c.equals(bVar.f4736c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f4734a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f4735b.hashCode()) * 1000003) ^ this.f4736c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f4734a + ", transportContext=" + this.f4735b + ", event=" + this.f4736c + "}";
    }
}
