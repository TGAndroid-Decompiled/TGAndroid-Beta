package h9;

public final class s0 extends q1 {

    public final long f8815a;

    public final String f8816b;

    public final String f8817c;
    public final long d;

    public final int f8818e;

    public s0(long j10, String str, String str2, long j11, int i10) {
        this.f8815a = j10;
        this.f8816b = str;
        this.f8817c = str2;
        this.d = j11;
        this.f8818e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            s0 s0Var = (s0) ((q1) obj);
            String str2 = s0Var.f8817c;
            if (this.f8815a == s0Var.f8815a && this.f8816b.equals(s0Var.f8816b) && ((str = this.f8817c) != null ? str.equals(str2) : str2 == null) && this.d == s0Var.d && this.f8818e == s0Var.f8818e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f8815a;
        int iHashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f8816b.hashCode()) * 1000003;
        String str = this.f8817c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.d;
        return this.f8818e ^ ((iHashCode2 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f8815a);
        sb2.append(", symbol=");
        sb2.append(this.f8816b);
        sb2.append(", file=");
        sb2.append(this.f8817c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return a9.p.k(this.f8818e, "}", sb2);
    }
}
