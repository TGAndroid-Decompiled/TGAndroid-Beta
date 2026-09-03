package f5;
public final class a {
    public final long f5885a;
    public final long f5886b;

    public a(long j10, long j11) {
        this.f5885a = j10;
        this.f5886b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f5885a == aVar.f5885a && this.f5886b == aVar.f5886b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f5885a) * 31) + ((int) this.f5886b);
    }
}
