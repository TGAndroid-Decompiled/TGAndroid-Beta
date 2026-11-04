package ca;
public final class x0 extends d2 {
    public final long f4585a;
    public final long f4586b;
    public final String f4587c;
    public final String d;

    public x0(String str, String str2, long j10, long j11) {
        this.f4585a = j10;
        this.f4586b = j11;
        this.f4587c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d2) {
            x0 x0Var = (x0) ((d2) obj);
            String str2 = x0Var.d;
            if (this.f4585a == x0Var.f4585a && this.f4586b == x0Var.f4586b && this.f4587c.equals(x0Var.f4587c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f4585a;
        long j11 = this.f4586b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f4587c.hashCode()) * 1000003;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f4585a);
        sb2.append(", size=");
        sb2.append(this.f4586b);
        sb2.append(", name=");
        sb2.append(this.f4587c);
        sb2.append(", uuid=");
        return a1.g.s(sb2, this.d, "}");
    }
}
