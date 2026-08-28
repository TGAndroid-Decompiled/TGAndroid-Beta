package b5;
public final class a {
    public final long f1423a;
    public final long f1424b;

    public a(long j10, long j11) {
        this.f1423a = j10;
        this.f1424b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1423a == aVar.f1423a && this.f1424b == aVar.f1424b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f1423a) * 31) + ((int) this.f1424b);
    }
}
