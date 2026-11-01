package f2;

import b2.r0;
import b2.t0;
import b2.x;
import v7.d8;
public final class h implements t0 {
    public final long f6739a;
    public final long f6740b;
    public final long f6741c;

    public h(long j10, long j11, long j12) {
        this.f6739a = j10;
        this.f6740b = j11;
        this.f6741c = j12;
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
        if (this.f6739a == hVar.f6739a && this.f6740b == hVar.f6740b && this.f6741c == hVar.f6741c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = d8.b(this.f6740b);
        return d8.b(this.f6741c) + ((b10 + ((d8.b(this.f6739a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f6739a + ", modification time=" + this.f6740b + ", timescale=" + this.f6741c;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
