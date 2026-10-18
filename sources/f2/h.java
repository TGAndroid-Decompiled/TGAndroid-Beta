package f2;

import b2.q0;
import b2.s0;
import v7.c8;
public final class h implements s0 {
    public final long f10293a;
    public final long f10294b;
    public final long f10295c;

    public h(long j10, long j11, long j12) {
        this.f10293a = j10;
        this.f10294b = j11;
        this.f10295c = j12;
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
        if (this.f10293a == hVar.f10293a && this.f10294b == hVar.f10294b && this.f10295c == hVar.f10295c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = c8.b(this.f10294b);
        return c8.b(this.f10295c) + ((b10 + ((c8.b(this.f10293a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f10293a + ", modification time=" + this.f10294b + ", timescale=" + this.f10295c;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
