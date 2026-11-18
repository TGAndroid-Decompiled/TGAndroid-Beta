package i2;

import c8.l1;
import e2.n0;
import e2.p0;
public final class f implements p0 {
    public final long f15928a;
    public final long f15929b;
    public final long f15930c;

    public f(long j3, long j10, long j11) {
        this.f15928a = j3;
        this.f15929b = j10;
        this.f15930c = j11;
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
        if (this.f15928a == fVar.f15928a && this.f15929b == fVar.f15929b && this.f15930c == fVar.f15930c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = l1.b(this.f15929b);
        return l1.b(this.f15930c) + ((b10 + ((l1.b(this.f15928a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f15928a + ", modification time=" + this.f15929b + ", timescale=" + this.f15930c;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
