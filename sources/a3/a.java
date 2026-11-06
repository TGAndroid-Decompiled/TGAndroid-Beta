package a3;
public final class a {
    public final long f57a;
    public final long f58b;

    public a(long j3, long j10) {
        this.f57a = j3;
        this.f58b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f57a == aVar.f57a && this.f58b == aVar.f58b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f57a) * 31) + ((int) this.f58b);
    }
}
