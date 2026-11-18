package da;
public final class n1 extends r2 {
    public final int f8120a;
    public final String f8121b;
    public final String f8122c;
    public final boolean d;

    public n1(int i7, String str, String str2, boolean z10) {
        this.f8120a = i7;
        this.f8121b = str;
        this.f8122c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r2) {
            n1 n1Var = (n1) ((r2) obj);
            if (this.f8120a == n1Var.f8120a && this.f8121b.equals(n1Var.f8121b) && this.f8122c.equals(n1Var.f8122c) && this.d == n1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f8120a ^ 1000003) * 1000003) ^ this.f8121b.hashCode()) * 1000003) ^ this.f8122c.hashCode()) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f8120a + ", version=" + this.f8121b + ", buildVersion=" + this.f8122c + ", jailbroken=" + this.d + "}";
    }
}
