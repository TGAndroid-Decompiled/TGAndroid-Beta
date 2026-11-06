package da;
public final class z0 extends f2 {
    public final String f8571a;
    public final String f8572b;
    public final long f8573c;

    public z0(long j3, String str, String str2) {
        this.f8571a = str;
        this.f8572b = str2;
        this.f8573c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            z0 z0Var = (z0) ((f2) obj);
            if (this.f8571a.equals(z0Var.f8571a) && this.f8572b.equals(z0Var.f8572b) && this.f8573c == z0Var.f8573c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f8573c;
        return ((((this.f8571a.hashCode() ^ 1000003) * 1000003) ^ this.f8572b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f8571a);
        sb2.append(", code=");
        sb2.append(this.f8572b);
        sb2.append(", address=");
        return a8.p0.r(sb2, this.f8573c, "}");
    }
}
