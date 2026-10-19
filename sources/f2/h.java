package f2;

import b2.q0;
import b2.s0;
import v7.c8;
public final class h implements s0 {
    public final long f10290a;
    public final long f10291b;
    public final long f10292c;

    public h(long j10, long j11, long j12) {
        this.f10290a = j10;
        this.f10291b = j11;
        this.f10292c = j12;
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
        if (this.f10290a == hVar.f10290a && this.f10291b == hVar.f10291b && this.f10292c == hVar.f10292c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = c8.b(this.f10291b);
        return c8.b(this.f10292c) + ((b10 + ((c8.b(this.f10290a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f10290a + ", modification time=" + this.f10291b + ", timescale=" + this.f10292c;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
