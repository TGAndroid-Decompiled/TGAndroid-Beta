package f5;
public final class q {
    public final long f10455a;
    public final long f10456b;
    public final long f10457c;

    public q(long j10, long j11, long j12) {
        this.f10455a = j10;
        this.f10456b = j11;
        this.f10457c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f10455a == qVar.f10455a && this.f10457c == qVar.f10457c && this.f10456b == qVar.f10456b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f10455a;
        long j11 = this.f10456b;
        long j12 = this.f10457c;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f10455a + ", samplesPerChunk=" + this.f10456b + ", sampleDescriptionIndex=" + this.f10457c + '}';
    }
}
