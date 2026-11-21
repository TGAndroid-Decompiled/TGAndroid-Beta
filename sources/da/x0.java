package da;
public final class x0 extends d2 {
    public final long f8257a;
    public final long f8258b;
    public final String f8259c;
    public final String d;

    public x0(String str, String str2, long j3, long j10) {
        this.f8257a = j3;
        this.f8258b = j10;
        this.f8259c = str;
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
            if (this.f8257a == x0Var.f8257a && this.f8258b == x0Var.f8258b && this.f8259c.equals(x0Var.f8259c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8257a;
        long j10 = this.f8258b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f8259c.hashCode()) * 1000003;
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
        sb2.append(this.f8257a);
        sb2.append(", size=");
        sb2.append(this.f8258b);
        sb2.append(", name=");
        sb2.append(this.f8259c);
        sb2.append(", uuid=");
        return a8.p0.s(sb2, this.d, "}");
    }
}
