package da;
public final class z0 extends f2 {
    public final String f8234a;
    public final String f8235b;
    public final long f8236c;

    public z0(long j3, String str, String str2) {
        this.f8234a = str;
        this.f8235b = str2;
        this.f8236c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            z0 z0Var = (z0) ((f2) obj);
            if (this.f8234a.equals(z0Var.f8234a) && this.f8235b.equals(z0Var.f8235b) && this.f8236c == z0Var.f8236c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f8236c;
        return ((((this.f8234a.hashCode() ^ 1000003) * 1000003) ^ this.f8235b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f8234a);
        sb2.append(", code=");
        sb2.append(this.f8235b);
        sb2.append(", address=");
        return a8.p0.r(sb2, this.f8236c, "}");
    }
}
