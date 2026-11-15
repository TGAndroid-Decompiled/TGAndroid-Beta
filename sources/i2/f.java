package i2;

import c8.j1;
import e2.n0;
import e2.p0;
public final class f implements p0 {
    public final long f15610a;
    public final long f15611b;
    public final long f15612c;

    public f(long j3, long j10, long j11) {
        this.f15610a = j3;
        this.f15611b = j10;
        this.f15612c = j11;
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
        if (this.f15610a == fVar.f15610a && this.f15611b == fVar.f15611b && this.f15612c == fVar.f15612c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = j1.b(this.f15611b);
        return j1.b(this.f15612c) + ((b10 + ((j1.b(this.f15610a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f15610a + ", modification time=" + this.f15611b + ", timescale=" + this.f15612c;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
