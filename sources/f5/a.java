package f5;
public final class a {
    public final long f5994a;
    public final long f5995b;

    public a(long j10, long j11) {
        this.f5994a = j10;
        this.f5995b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f5994a == aVar.f5994a && this.f5995b == aVar.f5995b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f5994a) * 31) + ((int) this.f5995b);
    }
}
