package g9;
public final class s0 extends q1 {
    public final long f7644a;
    public final String f7645b;
    public final String f7646c;
    public final long d;
    public final int f7647e;

    public s0(long j10, String str, String str2, long j11, int i9) {
        this.f7644a = j10;
        this.f7645b = str;
        this.f7646c = str2;
        this.d = j11;
        this.f7647e = i9;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            s0 s0Var = (s0) ((q1) obj);
            String str2 = s0Var.f7646c;
            if (this.f7644a == s0Var.f7644a && this.f7645b.equals(s0Var.f7645b) && ((str = this.f7646c) != null ? str.equals(str2) : str2 == null) && this.d == s0Var.d && this.f7647e == s0Var.f7647e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f7644a;
        int hashCode2 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f7645b.hashCode()) * 1000003;
        String str = this.f7646c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j11 = this.d;
        return this.f7647e ^ ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f7644a);
        sb2.append(", symbol=");
        sb2.append(this.f7645b);
        sb2.append(", file=");
        sb2.append(this.f7646c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return aa.d.l(this.f7647e, "}", sb2);
    }
}
