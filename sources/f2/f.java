package f2;

import b2.m0;
import b2.o0;
import v7.z7;
public final class f implements o0 {
    public final long f8800a;
    public final long f8801b;
    public final long f8802c;

    public f(long j3, long j10, long j11) {
        this.f8800a = j3;
        this.f8801b = j10;
        this.f8802c = j11;
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
        if (this.f8800a == fVar.f8800a && this.f8801b == fVar.f8801b && this.f8802c == fVar.f8802c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = z7.b(this.f8801b);
        return z7.b(this.f8802c) + ((b10 + ((z7.b(this.f8800a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f8800a + ", modification time=" + this.f8801b + ", timescale=" + this.f8802c;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
