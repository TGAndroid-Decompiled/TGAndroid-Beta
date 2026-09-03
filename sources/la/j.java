package la;
public final class j {
    public final i f11898a;
    public final i f11899b;
    public final double f11900c;

    public j(i iVar, i iVar2, double d) {
        this.f11898a = iVar;
        this.f11899b = iVar2;
        this.f11900c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f11898a == jVar.f11898a && this.f11899b == jVar.f11899b && Double.valueOf(this.f11900c).equals(Double.valueOf(jVar.f11900c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f11899b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f11900c);
        return ((hashCode + (this.f11898a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f11898a + ", crashlytics=" + this.f11899b + ", sessionSamplingRate=" + this.f11900c + ')';
    }
}
