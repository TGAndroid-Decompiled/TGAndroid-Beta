package da;
public final class c1 extends g2 {
    public final long f8300a;
    public final String f8301b;
    public final String f8302c;
    public final long d;
    public final int f8303e;

    public c1(String str, int i7, String str2, long j3, long j10) {
        this.f8300a = j3;
        this.f8301b = str;
        this.f8302c = str2;
        this.d = j10;
        this.f8303e = i7;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g2) {
            c1 c1Var = (c1) ((g2) obj);
            String str2 = c1Var.f8302c;
            if (this.f8300a == c1Var.f8300a && this.f8301b.equals(c1Var.f8301b) && ((str = this.f8302c) != null ? str.equals(str2) : str2 == null) && this.d == c1Var.d && this.f8303e == c1Var.f8303e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8300a;
        int hashCode2 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f8301b.hashCode()) * 1000003;
        String str = this.f8302c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.d;
        return ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f8303e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f8300a);
        sb2.append(", symbol=");
        sb2.append(this.f8301b);
        sb2.append(", file=");
        sb2.append(this.f8302c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return a8.p0.n(this.f8303e, "}", sb2);
    }
}
