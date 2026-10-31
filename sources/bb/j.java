package bb;
public final class j {
    public final i f2579a;
    public final i f2580b;
    public final double f2581c;

    public j(i iVar, i iVar2, double d) {
        this.f2579a = iVar;
        this.f2580b = iVar2;
        this.f2581c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f2579a == jVar.f2579a && this.f2580b == jVar.f2580b && Double.valueOf(this.f2581c).equals(Double.valueOf(jVar.f2581c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f2580b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f2581c);
        return ((hashCode + (this.f2579a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f2579a + ", crashlytics=" + this.f2580b + ", sessionSamplingRate=" + this.f2581c + ')';
    }
}
