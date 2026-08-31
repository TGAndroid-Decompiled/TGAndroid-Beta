package la;
public final class j {
    public final i f12203a;
    public final i f12204b;
    public final double f12205c;

    public j(i iVar, i iVar2, double d) {
        this.f12203a = iVar;
        this.f12204b = iVar2;
        this.f12205c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f12203a == jVar.f12203a && this.f12204b == jVar.f12204b && Double.valueOf(this.f12205c).equals(Double.valueOf(jVar.f12205c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f12204b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f12205c);
        return ((hashCode + (this.f12203a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f12203a + ", crashlytics=" + this.f12204b + ", sessionSamplingRate=" + this.f12205c + ')';
    }
}
