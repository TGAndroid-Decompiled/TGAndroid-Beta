package gb;
public final class k {
    public final j f13719a;
    public final j f13720b;
    public final double f13721c;

    public k(j jVar, j jVar2, double d) {
        this.f13719a = jVar;
        this.f13720b = jVar2;
        this.f13721c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f13719a == kVar.f13719a && this.f13720b == kVar.f13720b && Double.compare(this.f13721c, kVar.f13721c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13720b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f13721c);
        return ((hashCode + (this.f13719a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f13719a + ", crashlytics=" + this.f13720b + ", sessionSamplingRate=" + this.f13721c + ')';
    }
}
