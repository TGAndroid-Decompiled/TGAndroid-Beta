package defpackage;
public final class a63 {
    public final z53 a;
    public final z53 b;
    public final double c;

    public a63(z53 z53Var, z53 z53Var2, double d) {
        this.a = z53Var;
        this.b = z53Var2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a63) {
                a63 a63Var = (a63) obj;
                if (this.a != a63Var.a || this.b != a63Var.b || Double.compare(this.c, a63Var.c) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.c);
        return ((hashCode + (this.a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }
}
