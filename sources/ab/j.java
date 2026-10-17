package ab;
public final class j {
    public final i f421a;
    public final i f422b;
    public final double f423c;

    public j(i iVar, i iVar2, double d) {
        this.f421a = iVar;
        this.f422b = iVar2;
        this.f423c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f421a == jVar.f421a && this.f422b == jVar.f422b && Double.valueOf(this.f423c).equals(Double.valueOf(jVar.f423c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f422b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f423c);
        return ((hashCode + (this.f421a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f421a + ", crashlytics=" + this.f422b + ", sessionSamplingRate=" + this.f423c + ')';
    }
}
