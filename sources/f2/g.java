package f2;

import b2.m0;
import b2.o0;
import v7.w7;
public final class g implements o0 {
    public final long f9568a;
    public final long f9569b;
    public final long f9570c;

    public g(long j3, long j10, long j11) {
        this.f9568a = j3;
        this.f9569b = j10;
        this.f9570c = j11;
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
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f9568a == gVar.f9568a && this.f9569b == gVar.f9569b && this.f9570c == gVar.f9570c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = w7.b(this.f9569b);
        return w7.b(this.f9570c) + ((b10 + ((w7.b(this.f9568a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f9568a + ", modification time=" + this.f9569b + ", timescale=" + this.f9570c;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
