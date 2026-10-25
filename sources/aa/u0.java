package aa;
public final class u0 extends s1 {
    public final long f1207a;
    public final String f1208b;
    public final String f1209c;
    public final long d;
    public final int e;

    public u0(String str, int i10, String str2, long j10, long j11) {
        this.f1207a = j10;
        this.f1208b = str;
        this.f1209c = str2;
        this.d = j11;
        this.e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof s1) {
            u0 u0Var = (u0) ((s1) obj);
            String str2 = u0Var.f1209c;
            if (this.f1207a == u0Var.f1207a && this.f1208b.equals(u0Var.f1208b) && ((str = this.f1209c) != null ? str.equals(str2) : str2 == null) && this.d == u0Var.d && this.e == u0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f1207a;
        int hashCode2 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f1208b.hashCode()) * 1000003;
        String str = this.f1209c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j11 = this.d;
        return ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f1207a);
        sb2.append(", symbol=");
        sb2.append(this.f1208b);
        sb2.append(", file=");
        sb2.append(this.f1209c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return a1.g.n(this.e, "}", sb2);
    }
}
