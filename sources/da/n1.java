package da;
public final class n1 extends r2 {
    public final int f8149a;
    public final String f8150b;
    public final String f8151c;
    public final boolean d;

    public n1(int i7, String str, String str2, boolean z10) {
        this.f8149a = i7;
        this.f8150b = str;
        this.f8151c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r2) {
            n1 n1Var = (n1) ((r2) obj);
            if (this.f8149a == n1Var.f8149a && this.f8150b.equals(n1Var.f8150b) && this.f8151c.equals(n1Var.f8151c) && this.d == n1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f8149a ^ 1000003) * 1000003) ^ this.f8150b.hashCode()) * 1000003) ^ this.f8151c.hashCode()) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f8149a + ", version=" + this.f8150b + ", buildVersion=" + this.f8151c + ", jailbroken=" + this.d + "}";
    }
}
