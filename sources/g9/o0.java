package g9;
public final class o0 extends n1 {
    public final long f7613a;
    public final long f7614b;
    public final String f7615c;
    public final String d;

    public o0(String str, long j10, long j11, String str2) {
        this.f7613a = j10;
        this.f7614b = j11;
        this.f7615c = str;
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
            if (this.f7613a == o0Var.f7613a && this.f7614b == o0Var.f7614b && this.f7615c.equals(o0Var.f7615c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f7613a;
        long j11 = this.f7614b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f7615c.hashCode()) * 1000003;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f7613a);
        sb2.append(", size=");
        sb2.append(this.f7614b);
        sb2.append(", name=");
        sb2.append(this.f7615c);
        sb2.append(", uuid=");
        return aa.d.r(sb2, this.d, "}");
    }
}
