package f2;

import b2.m0;
import b2.o0;
import v7.a8;
public final class f implements o0 {
    public final long f8799a;
    public final long f8800b;
    public final long f8801c;

    public f(long j3, long j10, long j11) {
        this.f8799a = j3;
        this.f8800b = j10;
        this.f8801c = j11;
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
        if (this.f8799a == fVar.f8799a && this.f8800b == fVar.f8800b && this.f8801c == fVar.f8801c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = a8.b(this.f8800b);
        return a8.b(this.f8801c) + ((b10 + ((a8.b(this.f8799a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f8799a + ", modification time=" + this.f8800b + ", timescale=" + this.f8801c;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
