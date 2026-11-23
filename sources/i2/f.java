package i2;

import c8.m1;
import e2.n0;
import e2.p0;
public final class f implements p0 {
    public final long f15919a;
    public final long f15920b;
    public final long f15921c;

    public f(long j3, long j10, long j11) {
        this.f15919a = j3;
        this.f15920b = j10;
        this.f15921c = j11;
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
        if (this.f15919a == fVar.f15919a && this.f15920b == fVar.f15920b && this.f15921c == fVar.f15921c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = m1.b(this.f15920b);
        return m1.b(this.f15921c) + ((b10 + ((m1.b(this.f15919a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f15919a + ", modification time=" + this.f15920b + ", timescale=" + this.f15921c;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
