package da;
public final class c1 extends g2 {
    public final long f7966a;
    public final String f7967b;
    public final String f7968c;
    public final long d;
    public final int f7969e;

    public c1(String str, int i7, String str2, long j3, long j10) {
        this.f7966a = j3;
        this.f7967b = str;
        this.f7968c = str2;
        this.d = j10;
        this.f7969e = i7;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g2) {
            c1 c1Var = (c1) ((g2) obj);
            String str2 = c1Var.f7968c;
            if (this.f7966a == c1Var.f7966a && this.f7967b.equals(c1Var.f7967b) && ((str = this.f7968c) != null ? str.equals(str2) : str2 == null) && this.d == c1Var.d && this.f7969e == c1Var.f7969e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f7966a;
        int hashCode2 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f7967b.hashCode()) * 1000003;
        String str = this.f7968c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.d;
        return ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f7969e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f7966a);
        sb2.append(", symbol=");
        sb2.append(this.f7967b);
        sb2.append(", file=");
        sb2.append(this.f7968c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return a8.p0.n(this.f7969e, "}", sb2);
    }
}
