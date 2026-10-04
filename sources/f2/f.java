package f2;

import b2.m0;
import b2.o0;
import v7.z7;
public final class f implements o0 {
    public final long f9556a;
    public final long f9557b;
    public final long f9558c;

    public f(long j3, long j10, long j11) {
        this.f9556a = j3;
        this.f9557b = j10;
        this.f9558c = j11;
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
        if (this.f9556a == fVar.f9556a && this.f9557b == fVar.f9557b && this.f9558c == fVar.f9558c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = z7.b(this.f9557b);
        return z7.b(this.f9558c) + ((b10 + ((z7.b(this.f9556a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f9556a + ", modification time=" + this.f9557b + ", timescale=" + this.f9558c;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
