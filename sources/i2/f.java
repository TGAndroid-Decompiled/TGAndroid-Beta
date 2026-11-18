package i2;

import c8.l1;
import e2.n0;
import e2.p0;
public final class f implements p0 {
    public final long f15925a;
    public final long f15926b;
    public final long f15927c;

    public f(long j3, long j10, long j11) {
        this.f15925a = j3;
        this.f15926b = j10;
        this.f15927c = j11;
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
        if (this.f15925a == fVar.f15925a && this.f15926b == fVar.f15926b && this.f15927c == fVar.f15927c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = l1.b(this.f15926b);
        return l1.b(this.f15927c) + ((b10 + ((l1.b(this.f15925a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f15925a + ", modification time=" + this.f15926b + ", timescale=" + this.f15927c;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
