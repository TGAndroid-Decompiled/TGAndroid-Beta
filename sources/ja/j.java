package ja;
public final class j {
    public final i f11359a;
    public final i f11360b;
    public final double f11361c;

    public j(i iVar, i iVar2, double d) {
        this.f11359a = iVar;
        this.f11360b = iVar2;
        this.f11361c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f11359a == jVar.f11359a && this.f11360b == jVar.f11360b && Double.valueOf(this.f11361c).equals(Double.valueOf(jVar.f11361c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f11360b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f11361c);
        return ((hashCode + (this.f11359a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f11359a + ", crashlytics=" + this.f11360b + ", sessionSamplingRate=" + this.f11361c + ')';
    }
}
