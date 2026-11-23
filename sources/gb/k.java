package gb;
public final class k {
    public final j f13408a;
    public final j f13409b;
    public final double f13410c;

    public k(j jVar, j jVar2, double d) {
        this.f13408a = jVar;
        this.f13409b = jVar2;
        this.f13410c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f13408a == kVar.f13408a && this.f13409b == kVar.f13409b && Double.compare(this.f13410c, kVar.f13410c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13409b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f13410c);
        return ((hashCode + (this.f13408a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f13408a + ", crashlytics=" + this.f13409b + ", sessionSamplingRate=" + this.f13410c + ')';
    }
}
