package da;
public final class z0 extends f2 {
    public final String f8243a;
    public final String f8244b;
    public final long f8245c;

    public z0(long j3, String str, String str2) {
        this.f8243a = str;
        this.f8244b = str2;
        this.f8245c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            z0 z0Var = (z0) ((f2) obj);
            if (this.f8243a.equals(z0Var.f8243a) && this.f8244b.equals(z0Var.f8244b) && this.f8245c == z0Var.f8245c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f8245c;
        return ((((this.f8243a.hashCode() ^ 1000003) * 1000003) ^ this.f8244b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f8243a);
        sb2.append(", code=");
        sb2.append(this.f8244b);
        sb2.append(", address=");
        return a8.p0.r(sb2, this.f8245c, "}");
    }
}
