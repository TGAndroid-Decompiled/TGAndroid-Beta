package da;
public final class n1 extends r2 {
    public final int f8112a;
    public final String f8113b;
    public final String f8114c;
    public final boolean d;

    public n1(int i7, String str, String str2, boolean z10) {
        this.f8112a = i7;
        this.f8113b = str;
        this.f8114c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r2) {
            n1 n1Var = (n1) ((r2) obj);
            if (this.f8112a == n1Var.f8112a && this.f8113b.equals(n1Var.f8113b) && this.f8114c.equals(n1Var.f8114c) && this.d == n1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f8112a ^ 1000003) * 1000003) ^ this.f8113b.hashCode()) * 1000003) ^ this.f8114c.hashCode()) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f8112a + ", version=" + this.f8113b + ", buildVersion=" + this.f8114c + ", jailbroken=" + this.d + "}";
    }
}
