package f2;

import b2.q0;
import b2.s0;
import v7.c8;
public final class h implements s0 {
    public final long f10307a;
    public final long f10308b;
    public final long f10309c;

    public h(long j10, long j11, long j12) {
        this.f10307a = j10;
        this.f10308b = j11;
        this.f10309c = j12;
    }

    @Override
    public final b2.w a() {
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
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f10307a == hVar.f10307a && this.f10308b == hVar.f10308b && this.f10309c == hVar.f10309c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = c8.b(this.f10308b);
        return c8.b(this.f10309c) + ((b10 + ((c8.b(this.f10307a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f10307a + ", modification time=" + this.f10308b + ", timescale=" + this.f10309c;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
