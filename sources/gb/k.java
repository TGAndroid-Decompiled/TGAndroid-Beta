package gb;
public final class k {
    public final j f13062a;
    public final j f13063b;
    public final double f13064c;

    public k(j jVar, j jVar2, double d) {
        this.f13062a = jVar;
        this.f13063b = jVar2;
        this.f13064c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f13062a == kVar.f13062a && this.f13063b == kVar.f13063b && Double.compare(this.f13064c, kVar.f13064c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13063b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f13064c);
        return ((hashCode + (this.f13062a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f13062a + ", crashlytics=" + this.f13063b + ", sessionSamplingRate=" + this.f13064c + ')';
    }
}
