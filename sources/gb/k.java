package gb;
public final class k {
    public final j f13376a;
    public final j f13377b;
    public final double f13378c;

    public k(j jVar, j jVar2, double d) {
        this.f13376a = jVar;
        this.f13377b = jVar2;
        this.f13378c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f13376a == kVar.f13376a && this.f13377b == kVar.f13377b && Double.compare(this.f13378c, kVar.f13378c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13377b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f13378c);
        return ((hashCode + (this.f13376a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f13376a + ", crashlytics=" + this.f13377b + ", sessionSamplingRate=" + this.f13378c + ')';
    }
}
