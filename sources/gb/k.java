package gb;
public final class k {
    public final j f13721a;
    public final j f13722b;
    public final double f13723c;

    public k(j jVar, j jVar2, double d) {
        this.f13721a = jVar;
        this.f13722b = jVar2;
        this.f13723c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f13721a == kVar.f13721a && this.f13722b == kVar.f13722b && Double.compare(this.f13723c, kVar.f13723c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13722b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f13723c);
        return ((hashCode + (this.f13721a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f13721a + ", crashlytics=" + this.f13722b + ", sessionSamplingRate=" + this.f13723c + ')';
    }
}
