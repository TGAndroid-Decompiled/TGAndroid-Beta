package defpackage;
public final class lnb implements jd7 {
    public final long a;

    public lnb(long j) {
        this.a = j;
    }

    @Override
    public final fm4 a() {
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
        if (obj != null && lnb.class == obj.getClass() && this.a == ((lnb) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return zne.b(this.a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.a;
    }

    @Override
    public final void b(hr6 hr6Var) {
    }
}
