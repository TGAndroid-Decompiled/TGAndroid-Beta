package da;
public final class z0 extends f2 {
    public final String f8272a;
    public final String f8273b;
    public final long f8274c;

    public z0(long j3, String str, String str2) {
        this.f8272a = str;
        this.f8273b = str2;
        this.f8274c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            z0 z0Var = (z0) ((f2) obj);
            if (this.f8272a.equals(z0Var.f8272a) && this.f8273b.equals(z0Var.f8273b) && this.f8274c == z0Var.f8274c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f8274c;
        return ((((this.f8272a.hashCode() ^ 1000003) * 1000003) ^ this.f8273b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f8272a);
        sb2.append(", code=");
        sb2.append(this.f8273b);
        sb2.append(", address=");
        return a8.p0.r(sb2, this.f8274c, "}");
    }
}
