package da;
public final class n1 extends r2 {
    public final int f7835a;
    public final String f7836b;
    public final String f7837c;
    public final boolean d;

    public n1(int i7, String str, String str2, boolean z10) {
        this.f7835a = i7;
        this.f7836b = str;
        this.f7837c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r2) {
            n1 n1Var = (n1) ((r2) obj);
            if (this.f7835a == n1Var.f7835a && this.f7836b.equals(n1Var.f7836b) && this.f7837c.equals(n1Var.f7837c) && this.d == n1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f7835a ^ 1000003) * 1000003) ^ this.f7836b.hashCode()) * 1000003) ^ this.f7837c.hashCode()) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f7835a + ", version=" + this.f7836b + ", buildVersion=" + this.f7837c + ", jailbroken=" + this.d + "}";
    }
}
