package ia;

public final class j {

    public final i f11027a;

    public final i f11028b;

    public final double f11029c;

    public j(i iVar, i iVar2, double d) {
        this.f11027a = iVar;
        this.f11028b = iVar2;
        this.f11029c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f11027a == jVar.f11027a && this.f11028b == jVar.f11028b && Double.valueOf(this.f11029c).equals(Double.valueOf(jVar.f11029c));
    }

    public final int hashCode() {
        int iHashCode = (this.f11028b.hashCode() + (this.f11027a.hashCode() * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f11029c);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f11027a + ", crashlytics=" + this.f11028b + ", sessionSamplingRate=" + this.f11029c + ')';
    }
}
