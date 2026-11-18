package da;
public final class n1 extends r2 {
    public final int f8117a;
    public final String f8118b;
    public final String f8119c;
    public final boolean d;

    public n1(int i7, String str, String str2, boolean z10) {
        this.f8117a = i7;
        this.f8118b = str;
        this.f8119c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r2) {
            n1 n1Var = (n1) ((r2) obj);
            if (this.f8117a == n1Var.f8117a && this.f8118b.equals(n1Var.f8118b) && this.f8119c.equals(n1Var.f8119c) && this.d == n1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f8117a ^ 1000003) * 1000003) ^ this.f8118b.hashCode()) * 1000003) ^ this.f8119c.hashCode()) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f8117a + ", version=" + this.f8118b + ", buildVersion=" + this.f8119c + ", jailbroken=" + this.d + "}";
    }
}
