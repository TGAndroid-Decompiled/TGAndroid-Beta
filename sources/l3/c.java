package l3;

import b2.r0;
import b2.t0;
import b2.x;
import v7.d8;
public final class c implements t0 {
    public final long f11641a;

    public c(long j10) {
        this.f11641a = j10;
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
        if (obj != null && c.class == obj.getClass() && this.f11641a == ((c) obj).f11641a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return d8.b(this.f11641a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.f11641a;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
