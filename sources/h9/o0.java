package h9;

public final class o0 extends n1 {

    public final long f8784a;

    public final long f8785b;

    public final String f8786c;
    public final String d;

    public o0(String str, long j10, long j11, String str2) {
        this.f8784a = j10;
        this.f8785b = j11;
        this.f8786c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n1) {
            o0 o0Var = (o0) ((n1) obj);
            String str2 = o0Var.d;
            if (this.f8784a == o0Var.f8784a && this.f8785b == o0Var.f8785b && this.f8786c.equals(o0Var.f8786c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f8784a;
        long j11 = this.f8785b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f8786c.hashCode()) * 1000003;
        String str = this.d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f8784a);
        sb2.append(", size=");
        sb2.append(this.f8785b);
        sb2.append(", name=");
        sb2.append(this.f8786c);
        sb2.append(", uuid=");
        return a9.p.p(sb2, this.d, "}");
    }
}
