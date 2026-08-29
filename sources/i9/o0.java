package i9;
public final class o0 extends n1 {
    public final long f8748a;
    public final long f8749b;
    public final String f8750c;
    public final String d;

    public o0(String str, long j10, long j11, String str2) {
        this.f8748a = j10;
        this.f8749b = j11;
        this.f8750c = str;
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
            if (this.f8748a == o0Var.f8748a && this.f8749b == o0Var.f8749b && this.f8750c.equals(o0Var.f8750c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f8748a;
        long j11 = this.f8749b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f8750c.hashCode()) * 1000003;
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
        sb2.append(this.f8748a);
        sb2.append(", size=");
        sb2.append(this.f8749b);
        sb2.append(", name=");
        sb2.append(this.f8750c);
        sb2.append(", uuid=");
        return a4.w.q(sb2, this.d, "}");
    }
}
