package da;
public final class z0 extends f2 {
    public final String f8569a;
    public final String f8570b;
    public final long f8571c;

    public z0(long j3, String str, String str2) {
        this.f8569a = str;
        this.f8570b = str2;
        this.f8571c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            z0 z0Var = (z0) ((f2) obj);
            if (this.f8569a.equals(z0Var.f8569a) && this.f8570b.equals(z0Var.f8570b) && this.f8571c == z0Var.f8571c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f8571c;
        return ((((this.f8569a.hashCode() ^ 1000003) * 1000003) ^ this.f8570b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f8569a);
        sb2.append(", code=");
        sb2.append(this.f8570b);
        sb2.append(", address=");
        return a8.p0.r(sb2, this.f8571c, "}");
    }
}
