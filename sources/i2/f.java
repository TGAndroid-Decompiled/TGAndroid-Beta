package i2;

import c8.f1;
import e2.n0;
import e2.p0;
public final class f implements p0 {
    public final long f15158a;
    public final long f15159b;
    public final long f15160c;

    public f(long j3, long j10, long j11) {
        this.f15158a = j3;
        this.f15159b = j10;
        this.f15160c = j11;
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
        if (this.f15158a == fVar.f15158a && this.f15159b == fVar.f15159b && this.f15160c == fVar.f15160c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = f1.b(this.f15159b);
        return f1.b(this.f15160c) + ((b10 + ((f1.b(this.f15158a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f15158a + ", modification time=" + this.f15159b + ", timescale=" + this.f15160c;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
