package f2;

import a8.fd;
import b2.r0;
import b2.t0;
import b2.x;
public final class h implements t0 {
    public final long f10066a;
    public final long f10067b;
    public final long f10068c;

    public h(long j10, long j11, long j12) {
        this.f10066a = j10;
        this.f10067b = j11;
        this.f10068c = j12;
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
        if (this.f10066a == hVar.f10066a && this.f10067b == hVar.f10067b && this.f10068c == hVar.f10068c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = fd.b(this.f10067b);
        return fd.b(this.f10068c) + ((b10 + ((fd.b(this.f10066a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f10066a + ", modification time=" + this.f10067b + ", timescale=" + this.f10068c;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
