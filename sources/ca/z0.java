package ca;
public final class z0 extends f2 {
    public final String f4597a;
    public final String f4598b;
    public final long f4599c;

    public z0(long j10, String str, String str2) {
        this.f4597a = str;
        this.f4598b = str2;
        this.f4599c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            z0 z0Var = (z0) ((f2) obj);
            if (this.f4597a.equals(z0Var.f4597a) && this.f4598b.equals(z0Var.f4598b) && this.f4599c == z0Var.f4599c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f4599c;
        return ((((this.f4597a.hashCode() ^ 1000003) * 1000003) ^ this.f4598b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f4597a);
        sb2.append(", code=");
        sb2.append(this.f4598b);
        sb2.append(", address=");
        return a1.g.r(sb2, this.f4599c, "}");
    }
}
