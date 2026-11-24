package defpackage;
public final class kp9 {
    public final long a;
    public final long b;
    public final long c;

    public kp9(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kp9.class != obj.getClass()) {
            return false;
        }
        kp9 kp9Var = (kp9) obj;
        if (this.a == kp9Var.a && this.c == kp9Var.c && this.b == kp9Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.a + ", samplesPerChunk=" + this.b + ", sampleDescriptionIndex=" + this.c + '}';
    }
}
