package da;
public final class z0 extends f2 {
    public final String f7958a;
    public final String f7959b;
    public final long f7960c;

    public z0(long j3, String str, String str2) {
        this.f7958a = str;
        this.f7959b = str2;
        this.f7960c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            z0 z0Var = (z0) ((f2) obj);
            if (this.f7958a.equals(z0Var.f7958a) && this.f7959b.equals(z0Var.f7959b) && this.f7960c == z0Var.f7960c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f7960c;
        return ((((this.f7958a.hashCode() ^ 1000003) * 1000003) ^ this.f7959b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f7958a);
        sb2.append(", code=");
        sb2.append(this.f7959b);
        sb2.append(", address=");
        return a8.p0.r(sb2, this.f7960c, "}");
    }
}
