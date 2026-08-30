package ca;
public final class a {
    public final String f2186a;
    public final long f2187b;
    public final long f2188c;

    public a(long j10, long j11, String str) {
        this.f2186a = str;
        this.f2187b = j10;
        this.f2188c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f2186a.equals(aVar.f2186a) && this.f2187b == aVar.f2187b && this.f2188c == aVar.f2188c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f2187b;
        long j11 = this.f2188c;
        return ((((this.f2186a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f2186a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f2187b);
        sb.append(", tokenCreationTimestamp=");
        return android.support.v4.media.a.q(sb, this.f2188c, "}");
    }
}
