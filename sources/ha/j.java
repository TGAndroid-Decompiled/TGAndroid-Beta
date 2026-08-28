package ha;
public final class j {
    public final i f10324a;
    public final i f10325b;
    public final double f10326c;

    public j(i iVar, i iVar2, double d) {
        this.f10324a = iVar;
        this.f10325b = iVar2;
        this.f10326c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f10324a == jVar.f10324a && this.f10325b == jVar.f10325b && Double.valueOf(this.f10326c).equals(Double.valueOf(jVar.f10326c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f10325b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f10326c);
        return ((hashCode + (this.f10324a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f10324a + ", crashlytics=" + this.f10325b + ", sessionSamplingRate=" + this.f10326c + ')';
    }
}
