package f2;

import b2.m0;
import b2.o0;
import v7.w7;
public final class g implements o0 {
    public final long f9565a;
    public final long f9566b;
    public final long f9567c;

    public g(long j3, long j10, long j11) {
        this.f9565a = j3;
        this.f9566b = j10;
        this.f9567c = j11;
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
        if (this.f9565a == gVar.f9565a && this.f9566b == gVar.f9566b && this.f9567c == gVar.f9567c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = w7.b(this.f9566b);
        return w7.b(this.f9567c) + ((b10 + ((w7.b(this.f9565a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f9565a + ", modification time=" + this.f9566b + ", timescale=" + this.f9567c;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
