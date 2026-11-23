package gb;
public final class k {
    public final j f13370a;
    public final j f13371b;
    public final double f13372c;

    public k(j jVar, j jVar2, double d) {
        this.f13370a = jVar;
        this.f13371b = jVar2;
        this.f13372c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f13370a == kVar.f13370a && this.f13371b == kVar.f13371b && Double.compare(this.f13372c, kVar.f13372c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13371b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f13372c);
        return ((hashCode + (this.f13370a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f13370a + ", crashlytics=" + this.f13371b + ", sessionSamplingRate=" + this.f13372c + ')';
    }
}
