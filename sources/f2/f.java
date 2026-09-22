package f2;

import b2.m0;
import b2.o0;
import v7.z7;
public final class f implements o0 {
    public final long f8802a;
    public final long f8803b;
    public final long f8804c;

    public f(long j3, long j10, long j11) {
        this.f8802a = j3;
        this.f8803b = j10;
        this.f8804c = j11;
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
        if (this.f8802a == fVar.f8802a && this.f8803b == fVar.f8803b && this.f8804c == fVar.f8804c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = z7.b(this.f8803b);
        return z7.b(this.f8804c) + ((b10 + ((z7.b(this.f8802a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f8802a + ", modification time=" + this.f8803b + ", timescale=" + this.f8804c;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
