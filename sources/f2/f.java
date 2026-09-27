package f2;

import b2.m0;
import b2.o0;
import v7.a8;
public final class f implements o0 {
    public final long f8790a;
    public final long f8791b;
    public final long f8792c;

    public f(long j3, long j10, long j11) {
        this.f8790a = j3;
        this.f8791b = j10;
        this.f8792c = j11;
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
        if (this.f8790a == fVar.f8790a && this.f8791b == fVar.f8791b && this.f8792c == fVar.f8792c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = a8.b(this.f8791b);
        return a8.b(this.f8792c) + ((b10 + ((a8.b(this.f8790a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f8790a + ", modification time=" + this.f8791b + ", timescale=" + this.f8792c;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
