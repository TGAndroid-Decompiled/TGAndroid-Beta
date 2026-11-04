package db;
public final class k {
    public final j f8695a;
    public final j f8696b;
    public final double f8697c;

    public k(j jVar, j jVar2, double d) {
        this.f8695a = jVar;
        this.f8696b = jVar2;
        this.f8697c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f8695a == kVar.f8695a && this.f8696b == kVar.f8696b && Double.compare(this.f8697c, kVar.f8697c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f8696b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f8697c);
        return ((hashCode + (this.f8695a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f8695a + ", crashlytics=" + this.f8696b + ", sessionSamplingRate=" + this.f8697c + ')';
    }
}
