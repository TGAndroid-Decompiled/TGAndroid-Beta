package la;
public final class j {
    public final i f11788a;
    public final i f11789b;
    public final double f11790c;

    public j(i iVar, i iVar2, double d) {
        this.f11788a = iVar;
        this.f11789b = iVar2;
        this.f11790c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f11788a == jVar.f11788a && this.f11789b == jVar.f11789b && Double.valueOf(this.f11790c).equals(Double.valueOf(jVar.f11790c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f11789b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f11790c);
        return ((hashCode + (this.f11788a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f11788a + ", crashlytics=" + this.f11789b + ", sessionSamplingRate=" + this.f11790c + ')';
    }
}
