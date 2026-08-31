package ca;
public final class a {
    public final String f2376a;
    public final long f2377b;
    public final long f2378c;

    public a(long j10, long j11, String str) {
        this.f2376a = str;
        this.f2377b = j10;
        this.f2378c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f2376a.equals(aVar.f2376a) && this.f2377b == aVar.f2377b && this.f2378c == aVar.f2378c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f2377b;
        long j11 = this.f2378c;
        return ((((this.f2376a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f2376a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f2377b);
        sb.append(", tokenCreationTimestamp=");
        return android.support.v4.media.a.q(sb, this.f2378c, "}");
    }
}
