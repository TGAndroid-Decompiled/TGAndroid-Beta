package bb;
public final class j {
    public final i f3778a;
    public final i f3779b;
    public final double f3780c;

    public j(i iVar, i iVar2, double d) {
        this.f3778a = iVar;
        this.f3779b = iVar2;
        this.f3780c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f3778a == jVar.f3778a && this.f3779b == jVar.f3779b && Double.valueOf(this.f3780c).equals(Double.valueOf(jVar.f3780c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f3779b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f3780c);
        return ((hashCode + (this.f3778a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f3778a + ", crashlytics=" + this.f3779b + ", sessionSamplingRate=" + this.f3780c + ')';
    }
}
