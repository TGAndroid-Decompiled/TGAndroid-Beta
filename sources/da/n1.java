package da;
public final class n1 extends r2 {
    public final int f8146a;
    public final String f8147b;
    public final String f8148c;
    public final boolean d;

    public n1(int i7, String str, String str2, boolean z10) {
        this.f8146a = i7;
        this.f8147b = str;
        this.f8148c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r2) {
            n1 n1Var = (n1) ((r2) obj);
            if (this.f8146a == n1Var.f8146a && this.f8147b.equals(n1Var.f8147b) && this.f8148c.equals(n1Var.f8148c) && this.d == n1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f8146a ^ 1000003) * 1000003) ^ this.f8147b.hashCode()) * 1000003) ^ this.f8148c.hashCode()) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f8146a + ", version=" + this.f8147b + ", buildVersion=" + this.f8148c + ", jailbroken=" + this.d + "}";
    }
}
