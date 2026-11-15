package da;
public final class z0 extends f2 {
    public final String f7961a;
    public final String f7962b;
    public final long f7963c;

    public z0(long j3, String str, String str2) {
        this.f7961a = str;
        this.f7962b = str2;
        this.f7963c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            z0 z0Var = (z0) ((f2) obj);
            if (this.f7961a.equals(z0Var.f7961a) && this.f7962b.equals(z0Var.f7962b) && this.f7963c == z0Var.f7963c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f7963c;
        return ((((this.f7961a.hashCode() ^ 1000003) * 1000003) ^ this.f7962b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f7961a);
        sb2.append(", code=");
        sb2.append(this.f7962b);
        sb2.append(", address=");
        return a8.p0.r(sb2, this.f7963c, "}");
    }
}
