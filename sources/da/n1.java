package da;
public final class n1 extends r2 {
    public final int f8451a;
    public final String f8452b;
    public final String f8453c;
    public final boolean d;

    public n1(int i7, String str, String str2, boolean z9) {
        this.f8451a = i7;
        this.f8452b = str;
        this.f8453c = str2;
        this.d = z9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r2) {
            n1 n1Var = (n1) ((r2) obj);
            if (this.f8451a == n1Var.f8451a && this.f8452b.equals(n1Var.f8452b) && this.f8453c.equals(n1Var.f8453c) && this.d == n1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f8451a ^ 1000003) * 1000003) ^ this.f8452b.hashCode()) * 1000003) ^ this.f8453c.hashCode()) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f8451a + ", version=" + this.f8452b + ", buildVersion=" + this.f8453c + ", jailbroken=" + this.d + "}";
    }
}
