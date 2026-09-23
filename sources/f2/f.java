package f2;

import b2.m0;
import b2.o0;
import v7.z7;
public final class f implements o0 {
    public final long f8788a;
    public final long f8789b;
    public final long f8790c;

    public f(long j3, long j10, long j11) {
        this.f8788a = j3;
        this.f8789b = j10;
        this.f8790c = j11;
    }

    @Override
    public final b2.s a() {
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
        if (this.f8788a == fVar.f8788a && this.f8789b == fVar.f8789b && this.f8790c == fVar.f8790c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = z7.b(this.f8789b);
        return z7.b(this.f8790c) + ((b10 + ((z7.b(this.f8788a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f8788a + ", modification time=" + this.f8789b + ", timescale=" + this.f8790c;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
