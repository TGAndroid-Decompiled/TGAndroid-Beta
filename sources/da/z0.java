package da;
public final class z0 extends f2 {
    public final String f8574a;
    public final String f8575b;
    public final long f8576c;

    public z0(long j3, String str, String str2) {
        this.f8574a = str;
        this.f8575b = str2;
        this.f8576c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            z0 z0Var = (z0) ((f2) obj);
            if (this.f8574a.equals(z0Var.f8574a) && this.f8575b.equals(z0Var.f8575b) && this.f8576c == z0Var.f8576c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f8576c;
        return ((((this.f8574a.hashCode() ^ 1000003) * 1000003) ^ this.f8575b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f8574a);
        sb2.append(", code=");
        sb2.append(this.f8575b);
        sb2.append(", address=");
        return a8.p0.r(sb2, this.f8576c, "}");
    }
}
