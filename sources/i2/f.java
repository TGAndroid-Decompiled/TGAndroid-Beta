package i2;

import c8.m1;
import e2.n0;
import e2.p0;
public final class f implements p0 {
    public final long f16014a;
    public final long f16015b;
    public final long f16016c;

    public f(long j3, long j10, long j11) {
        this.f16014a = j3;
        this.f16015b = j10;
        this.f16016c = j11;
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
        if (this.f16014a == fVar.f16014a && this.f16015b == fVar.f16015b && this.f16016c == fVar.f16016c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = m1.b(this.f16015b);
        return m1.b(this.f16016c) + ((b10 + ((m1.b(this.f16014a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f16014a + ", modification time=" + this.f16015b + ", timescale=" + this.f16016c;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
