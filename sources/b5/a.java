package b5;

public final class a {

    public final long f1915a;

    public final long f1916b;

    public a(long j10, long j11) {
        this.f1915a = j10;
        this.f1916b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1915a == aVar.f1915a && this.f1916b == aVar.f1916b;
    }

    public final int hashCode() {
        return (((int) this.f1915a) * 31) + ((int) this.f1916b);
    }
}
