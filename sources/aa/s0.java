package aa;
public final class s0 extends r1 {
    public final String f1194a;
    public final String f1195b;
    public final long f1196c;

    public s0(long j10, String str, String str2) {
        this.f1194a = str;
        this.f1195b = str2;
        this.f1196c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            s0 s0Var = (s0) ((r1) obj);
            if (this.f1194a.equals(s0Var.f1194a) && this.f1195b.equals(s0Var.f1195b) && this.f1196c == s0Var.f1196c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f1196c;
        return ((((this.f1194a.hashCode() ^ 1000003) * 1000003) ^ this.f1195b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f1194a);
        sb2.append(", code=");
        sb2.append(this.f1195b);
        sb2.append(", address=");
        return a1.g.r(sb2, this.f1196c, "}");
    }
}
