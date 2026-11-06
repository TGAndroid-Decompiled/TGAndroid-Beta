package da;
public final class n1 extends r2 {
    public final int f8448a;
    public final String f8449b;
    public final String f8450c;
    public final boolean d;

    public n1(int i7, String str, String str2, boolean z9) {
        this.f8448a = i7;
        this.f8449b = str;
        this.f8450c = str2;
        this.d = z9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r2) {
            n1 n1Var = (n1) ((r2) obj);
            if (this.f8448a == n1Var.f8448a && this.f8449b.equals(n1Var.f8449b) && this.f8450c.equals(n1Var.f8450c) && this.d == n1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f8448a ^ 1000003) * 1000003) ^ this.f8449b.hashCode()) * 1000003) ^ this.f8450c.hashCode()) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f8448a + ", version=" + this.f8449b + ", buildVersion=" + this.f8450c + ", jailbroken=" + this.d + "}";
    }
}
