package f2;

import b2.m0;
import b2.o0;
import v7.z7;
public final class f implements o0 {
    public final long f7687a;
    public final long f7688b;
    public final long f7689c;

    public f(long j3, long j10, long j11) {
        this.f7687a = j3;
        this.f7688b = j10;
        this.f7689c = j11;
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
        if (this.f7687a == fVar.f7687a && this.f7688b == fVar.f7688b && this.f7689c == fVar.f7689c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = z7.b(this.f7688b);
        return z7.b(this.f7689c) + ((b10 + ((z7.b(this.f7687a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f7687a + ", modification time=" + this.f7688b + ", timescale=" + this.f7689c;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
