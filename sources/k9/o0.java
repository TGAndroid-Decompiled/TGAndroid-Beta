package k9;
public final class o0 extends n1 {
    public final long f10192a;
    public final long f10193b;
    public final String f10194c;
    public final String d;

    public o0(String str, long j10, long j11, String str2) {
        this.f10192a = j10;
        this.f10193b = j11;
        this.f10194c = str;
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
            if (this.f10192a == o0Var.f10192a && this.f10193b == o0Var.f10193b && this.f10194c.equals(o0Var.f10194c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f10192a;
        long j11 = this.f10193b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f10194c.hashCode()) * 1000003;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f10192a);
        sb.append(", size=");
        sb.append(this.f10193b);
        sb.append(", name=");
        sb.append(this.f10194c);
        sb.append(", uuid=");
        return android.support.v4.media.a.r(sb, this.d, "}");
    }
}
