package da;
public final class n1 extends r2 {
    public final int f7838a;
    public final String f7839b;
    public final String f7840c;
    public final boolean d;

    public n1(int i7, String str, String str2, boolean z10) {
        this.f7838a = i7;
        this.f7839b = str;
        this.f7840c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r2) {
            n1 n1Var = (n1) ((r2) obj);
            if (this.f7838a == n1Var.f7838a && this.f7839b.equals(n1Var.f7839b) && this.f7840c.equals(n1Var.f7840c) && this.d == n1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f7838a ^ 1000003) * 1000003) ^ this.f7839b.hashCode()) * 1000003) ^ this.f7840c.hashCode()) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f7838a + ", version=" + this.f7839b + ", buildVersion=" + this.f7840c + ", jailbroken=" + this.d + "}";
    }
}
