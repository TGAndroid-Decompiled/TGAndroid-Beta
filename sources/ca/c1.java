package ca;
public final class c1 extends g2 {
    public final long f4323a;
    public final String f4324b;
    public final String f4325c;
    public final long d;
    public final int f4326e;

    public c1(String str, int i3, String str2, long j10, long j11) {
        this.f4323a = j10;
        this.f4324b = str;
        this.f4325c = str2;
        this.d = j11;
        this.f4326e = i3;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g2) {
            c1 c1Var = (c1) ((g2) obj);
            String str2 = c1Var.f4325c;
            if (this.f4323a == c1Var.f4323a && this.f4324b.equals(c1Var.f4324b) && ((str = this.f4325c) != null ? str.equals(str2) : str2 == null) && this.d == c1Var.d && this.f4326e == c1Var.f4326e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f4323a;
        int hashCode2 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f4324b.hashCode()) * 1000003;
        String str = this.f4325c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j11 = this.d;
        return ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f4326e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f4323a);
        sb2.append(", symbol=");
        sb2.append(this.f4324b);
        sb2.append(", file=");
        sb2.append(this.f4325c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return a1.g.o(this.f4326e, "}", sb2);
    }
}
