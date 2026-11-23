package o3;

import c8.m1;
import e2.n0;
import e2.p0;
import e2.u;
public final class c implements p0 {
    public final long f21677a;

    public c(long j3) {
        this.f21677a = j3;
    }

    @Override
    public final u a() {
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
        if (obj != null && c.class == obj.getClass() && this.f21677a == ((c) obj).f21677a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return m1.b(this.f21677a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.f21677a;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
