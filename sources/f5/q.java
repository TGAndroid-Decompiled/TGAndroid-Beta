package f5;
public final class q {
    public final long f8924a;
    public final long f8925b;
    public final long f8926c;

    public q(long j3, long j10, long j11) {
        this.f8924a = j3;
        this.f8925b = j10;
        this.f8926c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f8924a == qVar.f8924a && this.f8926c == qVar.f8926c && this.f8925b == qVar.f8925b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f8924a;
        long j10 = this.f8925b;
        long j11 = this.f8926c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f8924a + ", samplesPerChunk=" + this.f8925b + ", sampleDescriptionIndex=" + this.f8926c + '}';
    }
}
