package i2;

import c8.f1;
import e2.n0;
import e2.p0;
public final class f implements p0 {
    public final long f15156a;
    public final long f15157b;
    public final long f15158c;

    public f(long j3, long j10, long j11) {
        this.f15156a = j3;
        this.f15157b = j10;
        this.f15158c = j11;
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
        if (this.f15156a == fVar.f15156a && this.f15157b == fVar.f15157b && this.f15158c == fVar.f15158c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = f1.b(this.f15157b);
        return f1.b(this.f15158c) + ((b10 + ((f1.b(this.f15156a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f15156a + ", modification time=" + this.f15157b + ", timescale=" + this.f15158c;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
