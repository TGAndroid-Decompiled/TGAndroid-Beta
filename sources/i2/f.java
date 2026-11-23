package i2;

import c8.l1;
import e2.n0;
import e2.p0;
public final class f implements p0 {
    public final long f15953a;
    public final long f15954b;
    public final long f15955c;

    public f(long j3, long j10, long j11) {
        this.f15953a = j3;
        this.f15954b = j10;
        this.f15955c = j11;
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
        if (this.f15953a == fVar.f15953a && this.f15954b == fVar.f15954b && this.f15955c == fVar.f15955c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = l1.b(this.f15954b);
        return l1.b(this.f15955c) + ((b10 + ((l1.b(this.f15953a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f15953a + ", modification time=" + this.f15954b + ", timescale=" + this.f15955c;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
