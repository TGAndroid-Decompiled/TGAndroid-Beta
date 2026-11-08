package i5;
public final class q {
    public final long f15324a;
    public final long f15325b;
    public final long f15326c;

    public q(long j3, long j10, long j11) {
        this.f15324a = j3;
        this.f15325b = j10;
        this.f15326c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f15324a == qVar.f15324a && this.f15326c == qVar.f15326c && this.f15325b == qVar.f15325b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f15324a;
        long j10 = this.f15325b;
        long j11 = this.f15326c;
        return (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f15324a + ", samplesPerChunk=" + this.f15325b + ", sampleDescriptionIndex=" + this.f15326c + '}';
    }
}
