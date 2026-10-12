package ab;
public final class j {
    public final i f418a;
    public final i f419b;
    public final double f420c;

    public j(i iVar, i iVar2, double d) {
        this.f418a = iVar;
        this.f419b = iVar2;
        this.f420c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f418a == jVar.f418a && this.f419b == jVar.f419b && Double.valueOf(this.f420c).equals(Double.valueOf(jVar.f420c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f419b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f420c);
        return ((hashCode + (this.f418a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f418a + ", crashlytics=" + this.f419b + ", sessionSamplingRate=" + this.f420c + ')';
    }
}
