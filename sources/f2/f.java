package f2;

import b2.m0;
import b2.o0;
import v7.a8;
public final class f implements o0 {
    public final long f8804a;
    public final long f8805b;
    public final long f8806c;

    public f(long j3, long j10, long j11) {
        this.f8804a = j3;
        this.f8805b = j10;
        this.f8806c = j11;
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
        if (this.f8804a == fVar.f8804a && this.f8805b == fVar.f8805b && this.f8806c == fVar.f8806c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = a8.b(this.f8805b);
        return a8.b(this.f8806c) + ((b10 + ((a8.b(this.f8804a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f8804a + ", modification time=" + this.f8805b + ", timescale=" + this.f8806c;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
