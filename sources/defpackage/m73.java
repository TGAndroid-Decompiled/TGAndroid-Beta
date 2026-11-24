package defpackage;
public final class m73 {
    public final l73 a;
    public final l73 b;
    public final double c;

    public m73(l73 l73Var, l73 l73Var2, double d) {
        this.a = l73Var;
        this.b = l73Var2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m73) {
                m73 m73Var = (m73) obj;
                if (this.a != m73Var.a || this.b != m73Var.b || Double.compare(this.c, m73Var.c) != 0) {
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
