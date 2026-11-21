package i2;

import c8.l1;
import e2.n0;
import e2.p0;
public final class f implements p0 {
    public final long f15950a;
    public final long f15951b;
    public final long f15952c;

    public f(long j3, long j10, long j11) {
        this.f15950a = j3;
        this.f15951b = j10;
        this.f15952c = j11;
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
        if (this.f15950a == fVar.f15950a && this.f15951b == fVar.f15951b && this.f15952c == fVar.f15952c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = l1.b(this.f15951b);
        return l1.b(this.f15952c) + ((b10 + ((l1.b(this.f15950a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f15950a + ", modification time=" + this.f15951b + ", timescale=" + this.f15952c;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
