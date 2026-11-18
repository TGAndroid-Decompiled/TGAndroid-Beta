package da;
public final class z0 extends f2 {
    public final String f8240a;
    public final String f8241b;
    public final long f8242c;

    public z0(long j3, String str, String str2) {
        this.f8240a = str;
        this.f8241b = str2;
        this.f8242c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            z0 z0Var = (z0) ((f2) obj);
            if (this.f8240a.equals(z0Var.f8240a) && this.f8241b.equals(z0Var.f8241b) && this.f8242c == z0Var.f8242c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f8242c;
        return ((((this.f8240a.hashCode() ^ 1000003) * 1000003) ^ this.f8241b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f8240a);
        sb2.append(", code=");
        sb2.append(this.f8241b);
        sb2.append(", address=");
        return a8.p0.r(sb2, this.f8242c, "}");
    }
}
