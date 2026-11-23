package da;
public final class n1 extends r2 {
    public final int f8111a;
    public final String f8112b;
    public final String f8113c;
    public final boolean d;

    public n1(int i7, String str, String str2, boolean z10) {
        this.f8111a = i7;
        this.f8112b = str;
        this.f8113c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r2) {
            n1 n1Var = (n1) ((r2) obj);
            if (this.f8111a == n1Var.f8111a && this.f8112b.equals(n1Var.f8112b) && this.f8113c.equals(n1Var.f8113c) && this.d == n1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f8111a ^ 1000003) * 1000003) ^ this.f8112b.hashCode()) * 1000003) ^ this.f8113c.hashCode()) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f8111a + ", version=" + this.f8112b + ", buildVersion=" + this.f8113c + ", jailbroken=" + this.d + "}";
    }
}
