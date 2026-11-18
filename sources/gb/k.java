package gb;
public final class k {
    public final j f13379a;
    public final j f13380b;
    public final double f13381c;

    public k(j jVar, j jVar2, double d) {
        this.f13379a = jVar;
        this.f13380b = jVar2;
        this.f13381c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f13379a == kVar.f13379a && this.f13380b == kVar.f13380b && Double.compare(this.f13381c, kVar.f13381c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13380b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f13381c);
        return ((hashCode + (this.f13379a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f13379a + ", crashlytics=" + this.f13380b + ", sessionSamplingRate=" + this.f13381c + ')';
    }
}
