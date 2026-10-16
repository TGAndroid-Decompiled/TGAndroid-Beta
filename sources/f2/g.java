package f2;

import b2.r0;
import b2.t0;
import b2.x;
import v7.c8;
public final class g implements t0 {
    public final long f8847a;
    public final long f8848b;
    public final long f8849c;

    public g(long j10, long j11, long j12) {
        this.f8847a = j10;
        this.f8848b = j11;
        this.f8849c = j12;
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
        if (this.f8847a == gVar.f8847a && this.f8848b == gVar.f8848b && this.f8849c == gVar.f8849c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = c8.b(this.f8848b);
        return c8.b(this.f8849c) + ((b10 + ((c8.b(this.f8847a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f8847a + ", modification time=" + this.f8848b + ", timescale=" + this.f8849c;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
