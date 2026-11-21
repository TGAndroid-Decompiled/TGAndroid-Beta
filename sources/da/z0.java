package da;
public final class z0 extends f2 {
    public final String f8269a;
    public final String f8270b;
    public final long f8271c;

    public z0(long j3, String str, String str2) {
        this.f8269a = str;
        this.f8270b = str2;
        this.f8271c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            z0 z0Var = (z0) ((f2) obj);
            if (this.f8269a.equals(z0Var.f8269a) && this.f8270b.equals(z0Var.f8270b) && this.f8271c == z0Var.f8271c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f8271c;
        return ((((this.f8269a.hashCode() ^ 1000003) * 1000003) ^ this.f8270b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f8269a);
        sb2.append(", code=");
        sb2.append(this.f8270b);
        sb2.append(", address=");
        return a8.p0.r(sb2, this.f8271c, "}");
    }
}
