package l3;

import a8.fd;
import b2.r0;
import b2.t0;
import b2.x;
public final class c implements t0 {
    public final long f16860a;

    public c(long j10) {
        this.f16860a = j10;
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
        if (obj != null && c.class == obj.getClass() && this.f16860a == ((c) obj).f16860a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return fd.b(this.f16860a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.f16860a;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
