package f2;

import b2.r0;
import b2.t0;
import b2.x;
import v7.d8;
public final class h implements t0 {
    public final long f6738a;
    public final long f6739b;
    public final long f6740c;

    public h(long j10, long j11, long j12) {
        this.f6738a = j10;
        this.f6739b = j11;
        this.f6740c = j12;
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
        if (this.f6738a == hVar.f6738a && this.f6739b == hVar.f6739b && this.f6740c == hVar.f6740c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = d8.b(this.f6739b);
        return d8.b(this.f6740c) + ((b10 + ((d8.b(this.f6738a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f6738a + ", modification time=" + this.f6739b + ", timescale=" + this.f6740c;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
