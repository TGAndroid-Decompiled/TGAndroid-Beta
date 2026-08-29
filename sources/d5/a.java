package d5;
public final class a {
    public final long f5307a;
    public final long f5308b;

    public a(long j10, long j11) {
        this.f5307a = j10;
        this.f5308b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f5307a == aVar.f5307a && this.f5308b == aVar.f5308b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f5307a) * 31) + ((int) this.f5308b);
    }
}
