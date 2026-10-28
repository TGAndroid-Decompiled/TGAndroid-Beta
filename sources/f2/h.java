package f2;

import a8.fd;
import b2.r0;
import b2.t0;
import b2.x;
public final class h implements t0 {
    public final long f10065a;
    public final long f10066b;
    public final long f10067c;

    public h(long j10, long j11, long j12) {
        this.f10065a = j10;
        this.f10066b = j11;
        this.f10067c = j12;
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
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f10065a == hVar.f10065a && this.f10066b == hVar.f10066b && this.f10067c == hVar.f10067c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = fd.b(this.f10066b);
        return fd.b(this.f10067c) + ((b10 + ((fd.b(this.f10065a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f10065a + ", modification time=" + this.f10066b + ", timescale=" + this.f10067c;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
