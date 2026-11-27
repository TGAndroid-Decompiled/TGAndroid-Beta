package defpackage;
public final class t63 {
    public final s63 a;
    public final s63 b;
    public final double c;

    public t63(s63 s63Var, s63 s63Var2, double d) {
        this.a = s63Var;
        this.b = s63Var2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t63) {
                t63 t63Var = (t63) obj;
                if (this.a != t63Var.a || this.b != t63Var.b || Double.compare(this.c, t63Var.c) != 0) {
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
