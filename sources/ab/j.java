package ab;
public final class j {
    public final i f420a;
    public final i f421b;
    public final double f422c;

    public j(i iVar, i iVar2, double d) {
        this.f420a = iVar;
        this.f421b = iVar2;
        this.f422c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f420a == jVar.f420a && this.f421b == jVar.f421b && Double.valueOf(this.f422c).equals(Double.valueOf(jVar.f422c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f421b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f422c);
        return ((hashCode + (this.f420a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f420a + ", crashlytics=" + this.f421b + ", sessionSamplingRate=" + this.f422c + ')';
    }
}
