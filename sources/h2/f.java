package h2;

import b8.pd;
import d2.p0;
import d2.r0;
import d2.v;
public final class f implements r0 {
    public final long f14109a;
    public final long f14110b;
    public final long f14111c;

    public f(long j10, long j11, long j12) {
        this.f14109a = j10;
        this.f14110b = j11;
        this.f14111c = j12;
    }

    @Override
    public final v b() {
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
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f14109a == fVar.f14109a && this.f14110b == fVar.f14110b && this.f14111c == fVar.f14111c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = pd.b(this.f14110b);
        return pd.b(this.f14111c) + ((b10 + ((pd.b(this.f14109a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f14109a + ", modification time=" + this.f14110b + ", timescale=" + this.f14111c;
    }

    @Override
    public final void a(p0 p0Var) {
    }
}
