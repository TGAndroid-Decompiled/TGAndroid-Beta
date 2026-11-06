package i2;

import c8.f1;
import e2.n0;
import e2.p0;
public final class f implements p0 {
    public final long f15153a;
    public final long f15154b;
    public final long f15155c;

    public f(long j3, long j10, long j11) {
        this.f15153a = j3;
        this.f15154b = j10;
        this.f15155c = j11;
    }

    @Override
    public final e2.u a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f15153a == fVar.f15153a && this.f15154b == fVar.f15154b && this.f15155c == fVar.f15155c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = f1.b(this.f15154b);
        return f1.b(this.f15155c) + ((b10 + ((f1.b(this.f15153a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f15153a + ", modification time=" + this.f15154b + ", timescale=" + this.f15155c;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
