package f2;

import b2.r0;
import b2.t0;
import b2.x;
import v7.c8;
public final class g implements t0 {
    public final long f8844a;
    public final long f8845b;
    public final long f8846c;

    public g(long j10, long j11, long j12) {
        this.f8844a = j10;
        this.f8845b = j11;
        this.f8846c = j12;
    }

    @Override
    public final x a() {
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
        if (this.f8844a == gVar.f8844a && this.f8845b == gVar.f8845b && this.f8846c == gVar.f8846c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = c8.b(this.f8845b);
        return c8.b(this.f8846c) + ((b10 + ((c8.b(this.f8844a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f8844a + ", modification time=" + this.f8845b + ", timescale=" + this.f8846c;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
