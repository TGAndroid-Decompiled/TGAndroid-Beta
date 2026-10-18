package f5;
public final class q {
    public final long f10441a;
    public final long f10442b;
    public final long f10443c;

    public q(long j10, long j11, long j12) {
        this.f10441a = j10;
        this.f10442b = j11;
        this.f10443c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f10441a == qVar.f10441a && this.f10443c == qVar.f10443c && this.f10442b == qVar.f10442b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f10441a;
        long j11 = this.f10442b;
        long j12 = this.f10443c;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f10441a + ", samplesPerChunk=" + this.f10442b + ", sampleDescriptionIndex=" + this.f10443c + '}';
    }
}
