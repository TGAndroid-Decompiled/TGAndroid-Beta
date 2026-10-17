package l3;

import b2.q0;
import b2.s0;
import b2.w;
import v7.c8;
public final class c implements s0 {
    public final long f15891a;

    public c(long j10) {
        this.f15891a = j10;
    }

    @Override
    public final w a() {
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
        if (obj != null && c.class == obj.getClass() && this.f15891a == ((c) obj).f15891a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.b(this.f15891a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.f15891a;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
