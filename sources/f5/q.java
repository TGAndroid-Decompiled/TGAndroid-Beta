package f5;
public final class q {
    public final long f9361a;
    public final long f9362b;
    public final long f9363c;

    public q(long j3, long j10, long j11) {
        this.f9361a = j3;
        this.f9362b = j10;
        this.f9363c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f9361a == qVar.f9361a && this.f9363c == qVar.f9363c && this.f9362b == qVar.f9362b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f9361a;
        long j10 = this.f9362b;
        long j11 = this.f9363c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f9361a + ", samplesPerChunk=" + this.f9362b + ", sampleDescriptionIndex=" + this.f9363c + '}';
    }
}
