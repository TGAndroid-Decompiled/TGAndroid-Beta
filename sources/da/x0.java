package da;
public final class x0 extends d2 {
    public final long f8222a;
    public final long f8223b;
    public final String f8224c;
    public final String d;

    public x0(String str, String str2, long j3, long j10) {
        this.f8222a = j3;
        this.f8223b = j10;
        this.f8224c = str;
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
            if (this.f8222a == x0Var.f8222a && this.f8223b == x0Var.f8223b && this.f8224c.equals(x0Var.f8224c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8222a;
        long j10 = this.f8223b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f8224c.hashCode()) * 1000003;
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
        sb2.append(this.f8222a);
        sb2.append(", size=");
        sb2.append(this.f8223b);
        sb2.append(", name=");
        sb2.append(this.f8224c);
        sb2.append(", uuid=");
        return a8.p0.s(sb2, this.d, "}");
    }
}
