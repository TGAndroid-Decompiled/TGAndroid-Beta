package f5;
public final class q {
    public final long f8935a;
    public final long f8936b;
    public final long f8937c;

    public q(long j3, long j10, long j11) {
        this.f8935a = j3;
        this.f8936b = j10;
        this.f8937c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f8935a == qVar.f8935a && this.f8937c == qVar.f8937c && this.f8936b == qVar.f8936b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f8935a;
        long j10 = this.f8936b;
        long j11 = this.f8937c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f8935a + ", samplesPerChunk=" + this.f8936b + ", sampleDescriptionIndex=" + this.f8937c + '}';
    }
}
