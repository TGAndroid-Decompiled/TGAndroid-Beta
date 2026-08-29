package i9;
public final class s0 extends q1 {
    public final long f8779a;
    public final String f8780b;
    public final String f8781c;
    public final long d;
    public final int f8782e;

    public s0(long j10, String str, String str2, long j11, int i10) {
        this.f8779a = j10;
        this.f8780b = str;
        this.f8781c = str2;
        this.d = j11;
        this.f8782e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            s0 s0Var = (s0) ((q1) obj);
            String str2 = s0Var.f8781c;
            if (this.f8779a == s0Var.f8779a && this.f8780b.equals(s0Var.f8780b) && ((str = this.f8781c) != null ? str.equals(str2) : str2 == null) && this.d == s0Var.d && this.f8782e == s0Var.f8782e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f8779a;
        int hashCode2 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f8780b.hashCode()) * 1000003;
        String str = this.f8781c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j11 = this.d;
        return this.f8782e ^ ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f8779a);
        sb2.append(", symbol=");
        sb2.append(this.f8780b);
        sb2.append(", file=");
        sb2.append(this.f8781c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return a4.w.l(this.f8782e, "}", sb2);
    }
}
