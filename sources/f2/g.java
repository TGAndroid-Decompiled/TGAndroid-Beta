package f2;

import b2.m0;
import b2.o0;
import v7.w7;
public final class g implements o0 {
    public final long f9567a;
    public final long f9568b;
    public final long f9569c;

    public g(long j3, long j10, long j11) {
        this.f9567a = j3;
        this.f9568b = j10;
        this.f9569c = j11;
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
        if (this.f9567a == gVar.f9567a && this.f9568b == gVar.f9568b && this.f9569c == gVar.f9569c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = w7.b(this.f9568b);
        return w7.b(this.f9569c) + ((b10 + ((w7.b(this.f9567a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f9567a + ", modification time=" + this.f9568b + ", timescale=" + this.f9569c;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
