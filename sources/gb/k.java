package gb;
public final class k {
    public final j f13405a;
    public final j f13406b;
    public final double f13407c;

    public k(j jVar, j jVar2, double d) {
        this.f13405a = jVar;
        this.f13406b = jVar2;
        this.f13407c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f13405a == kVar.f13405a && this.f13406b == kVar.f13406b && Double.compare(this.f13407c, kVar.f13407c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13406b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f13407c);
        return ((hashCode + (this.f13405a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f13405a + ", crashlytics=" + this.f13406b + ", sessionSamplingRate=" + this.f13407c + ')';
    }
}
