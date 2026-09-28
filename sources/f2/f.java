package f2;

import b2.m0;
import b2.o0;
import v7.a8;
public final class f implements o0 {
    public final long f8787a;
    public final long f8788b;
    public final long f8789c;

    public f(long j3, long j10, long j11) {
        this.f8787a = j3;
        this.f8788b = j10;
        this.f8789c = j11;
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
        if (this.f8787a == fVar.f8787a && this.f8788b == fVar.f8788b && this.f8789c == fVar.f8789c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = a8.b(this.f8788b);
        return a8.b(this.f8789c) + ((b10 + ((a8.b(this.f8787a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f8787a + ", modification time=" + this.f8788b + ", timescale=" + this.f8789c;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
