package f2;

import b2.m0;
import b2.o0;
import v7.y7;
public final class g implements o0 {
    public final long f9208a;
    public final long f9209b;
    public final long f9210c;

    public g(long j3, long j10, long j11) {
        this.f9208a = j3;
        this.f9209b = j10;
        this.f9210c = j11;
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
        if (this.f9208a == gVar.f9208a && this.f9209b == gVar.f9209b && this.f9210c == gVar.f9210c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = y7.b(this.f9209b);
        return y7.b(this.f9210c) + ((b10 + ((y7.b(this.f9208a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f9208a + ", modification time=" + this.f9209b + ", timescale=" + this.f9210c;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
