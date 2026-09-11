package f2;

import b2.m0;
import b2.o0;
import v7.y7;
public final class g implements o0 {
    public final long f9180a;
    public final long f9181b;
    public final long f9182c;

    public g(long j3, long j10, long j11) {
        this.f9180a = j3;
        this.f9181b = j10;
        this.f9182c = j11;
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
        if (this.f9180a == gVar.f9180a && this.f9181b == gVar.f9181b && this.f9182c == gVar.f9182c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = y7.b(this.f9181b);
        return y7.b(this.f9182c) + ((b10 + ((y7.b(this.f9180a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f9180a + ", modification time=" + this.f9181b + ", timescale=" + this.f9182c;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
