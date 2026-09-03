package ca;
public final class a {
    public final String f2210a;
    public final long f2211b;
    public final long f2212c;

    public a(long j10, long j11, String str) {
        this.f2210a = str;
        this.f2211b = j10;
        this.f2212c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f2210a.equals(aVar.f2210a) && this.f2211b == aVar.f2211b && this.f2212c == aVar.f2212c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f2211b;
        long j11 = this.f2212c;
        return ((((this.f2210a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f2210a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f2211b);
        sb.append(", tokenCreationTimestamp=");
        return android.support.v4.media.a.q(sb, this.f2212c, "}");
    }
}
