package f2;

import b2.m0;
import b2.o0;
import v7.z7;
public final class f implements o0 {
    public final long f9557a;
    public final long f9558b;
    public final long f9559c;

    public f(long j3, long j10, long j11) {
        this.f9557a = j3;
        this.f9558b = j10;
        this.f9559c = j11;
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
        if (this.f9557a == fVar.f9557a && this.f9558b == fVar.f9558b && this.f9559c == fVar.f9559c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = z7.b(this.f9558b);
        return z7.b(this.f9559c) + ((b10 + ((z7.b(this.f9557a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f9557a + ", modification time=" + this.f9558b + ", timescale=" + this.f9559c;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
