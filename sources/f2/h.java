package f2;

import b2.q0;
import b2.s0;
import v7.c8;
public final class h implements s0 {
    public final long f10292a;
    public final long f10293b;
    public final long f10294c;

    public h(long j10, long j11, long j12) {
        this.f10292a = j10;
        this.f10293b = j11;
        this.f10294c = j12;
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
        if (this.f10292a == hVar.f10292a && this.f10293b == hVar.f10293b && this.f10294c == hVar.f10294c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = c8.b(this.f10293b);
        return c8.b(this.f10294c) + ((b10 + ((c8.b(this.f10292a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f10292a + ", modification time=" + this.f10293b + ", timescale=" + this.f10294c;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
