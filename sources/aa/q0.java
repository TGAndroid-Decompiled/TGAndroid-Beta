package aa;
public final class q0 extends p1 {
    public final long f1180a;
    public final long f1181b;
    public final String f1182c;
    public final String d;

    public q0(String str, long j10, long j11, String str2) {
        this.f1180a = j10;
        this.f1181b = j11;
        this.f1182c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            String str2 = q0Var.d;
            if (this.f1180a == q0Var.f1180a && this.f1181b == q0Var.f1181b && this.f1182c.equals(q0Var.f1182c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f1180a;
        long j11 = this.f1181b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f1182c.hashCode()) * 1000003;
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
        sb2.append(this.f1180a);
        sb2.append(", size=");
        sb2.append(this.f1181b);
        sb2.append(", name=");
        sb2.append(this.f1182c);
        sb2.append(", uuid=");
        return a1.g.s(sb2, this.d, "}");
    }
}
