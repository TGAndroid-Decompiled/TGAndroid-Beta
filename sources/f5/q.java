package f5;
public final class q {
    public final long f8936a;
    public final long f8937b;
    public final long f8938c;

    public q(long j3, long j10, long j11) {
        this.f8936a = j3;
        this.f8937b = j10;
        this.f8938c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f8936a == qVar.f8936a && this.f8938c == qVar.f8938c && this.f8937b == qVar.f8937b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f8936a;
        long j10 = this.f8937b;
        long j11 = this.f8938c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f8936a + ", samplesPerChunk=" + this.f8937b + ", sampleDescriptionIndex=" + this.f8938c + '}';
    }
}
