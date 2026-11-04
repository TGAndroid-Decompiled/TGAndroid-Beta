package n3;

import b8.pd;
import d2.p0;
import d2.r0;
import d2.v;
public final class c implements r0 {
    public final long f20217a;

    public c(long j10) {
        this.f20217a = j10;
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
        if (obj != null && c.class == obj.getClass() && this.f20217a == ((c) obj).f20217a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return pd.b(this.f20217a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.f20217a;
    }

    @Override
    public final void a(p0 p0Var) {
    }
}
