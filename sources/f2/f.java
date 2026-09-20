package f2;

import b2.m0;
import b2.o0;
import v7.a8;
public final class f implements o0 {
    public final long f8805a;
    public final long f8806b;
    public final long f8807c;

    public f(long j3, long j10, long j11) {
        this.f8805a = j3;
        this.f8806b = j10;
        this.f8807c = j11;
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
        if (this.f8805a == fVar.f8805a && this.f8806b == fVar.f8806b && this.f8807c == fVar.f8807c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = a8.b(this.f8806b);
        return a8.b(this.f8807c) + ((b10 + ((a8.b(this.f8805a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f8805a + ", modification time=" + this.f8806b + ", timescale=" + this.f8807c;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
