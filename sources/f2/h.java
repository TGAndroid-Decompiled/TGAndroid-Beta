package f2;

import b2.q0;
import b2.s0;
import v7.c8;
public final class h implements s0 {
    public final long f10291a;
    public final long f10292b;
    public final long f10293c;

    public h(long j10, long j11, long j12) {
        this.f10291a = j10;
        this.f10292b = j11;
        this.f10293c = j12;
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
        if (this.f10291a == hVar.f10291a && this.f10292b == hVar.f10292b && this.f10293c == hVar.f10293c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = c8.b(this.f10292b);
        return c8.b(this.f10293c) + ((b10 + ((c8.b(this.f10291a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f10291a + ", modification time=" + this.f10292b + ", timescale=" + this.f10293c;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
