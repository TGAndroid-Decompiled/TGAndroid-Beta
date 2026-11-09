package da;
public final class n1 extends r2 {
    public final int f8446a;
    public final String f8447b;
    public final String f8448c;
    public final boolean d;

    public n1(int i7, String str, String str2, boolean z9) {
        this.f8446a = i7;
        this.f8447b = str;
        this.f8448c = str2;
        this.d = z9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r2) {
            n1 n1Var = (n1) ((r2) obj);
            if (this.f8446a == n1Var.f8446a && this.f8447b.equals(n1Var.f8447b) && this.f8448c.equals(n1Var.f8448c) && this.d == n1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f8446a ^ 1000003) * 1000003) ^ this.f8447b.hashCode()) * 1000003) ^ this.f8448c.hashCode()) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f8446a + ", version=" + this.f8447b + ", buildVersion=" + this.f8448c + ", jailbroken=" + this.d + "}";
    }
}
