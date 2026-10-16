package ab;
public final class j {
    public final i f422a;
    public final i f423b;
    public final double f424c;

    public j(i iVar, i iVar2, double d) {
        this.f422a = iVar;
        this.f423b = iVar2;
        this.f424c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f422a == jVar.f422a && this.f423b == jVar.f423b && Double.valueOf(this.f424c).equals(Double.valueOf(jVar.f424c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f423b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f424c);
        return ((hashCode + (this.f422a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f422a + ", crashlytics=" + this.f423b + ", sessionSamplingRate=" + this.f424c + ')';
    }
}
