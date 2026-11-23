package gb;
public final class k {
    public final j f13371a;
    public final j f13372b;
    public final double f13373c;

    public k(j jVar, j jVar2, double d) {
        this.f13371a = jVar;
        this.f13372b = jVar2;
        this.f13373c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f13371a == kVar.f13371a && this.f13372b == kVar.f13372b && Double.compare(this.f13373c, kVar.f13373c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13372b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f13373c);
        return ((hashCode + (this.f13371a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f13371a + ", crashlytics=" + this.f13372b + ", sessionSamplingRate=" + this.f13373c + ')';
    }
}
