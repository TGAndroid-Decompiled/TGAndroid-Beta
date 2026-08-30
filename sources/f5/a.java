package f5;
public final class a {
    public final long f5896a;
    public final long f5897b;

    public a(long j10, long j11) {
        this.f5896a = j10;
        this.f5897b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f5896a == aVar.f5896a && this.f5897b == aVar.f5897b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f5896a) * 31) + ((int) this.f5897b);
    }
}
