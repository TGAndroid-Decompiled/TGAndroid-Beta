package aa;

import a4.w;
public final class a {
    public final String f276a;
    public final long f277b;
    public final long f278c;

    public a(long j10, long j11, String str) {
        this.f276a = str;
        this.f277b = j10;
        this.f278c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f276a.equals(aVar.f276a) && this.f277b == aVar.f277b && this.f278c == aVar.f278c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f277b;
        long j11 = this.f278c;
        return ((((this.f276a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f276a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f277b);
        sb2.append(", tokenCreationTimestamp=");
        return w.p(sb2, this.f278c, "}");
    }
}
