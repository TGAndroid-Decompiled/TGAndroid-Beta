package ca;
public final class n1 extends r2 {
    public final int f4474a;
    public final String f4475b;
    public final String f4476c;
    public final boolean d;

    public n1(int i3, String str, String str2, boolean z10) {
        this.f4474a = i3;
        this.f4475b = str;
        this.f4476c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r2) {
            n1 n1Var = (n1) ((r2) obj);
            if (this.f4474a == n1Var.f4474a && this.f4475b.equals(n1Var.f4475b) && this.f4476c.equals(n1Var.f4476c) && this.d == n1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int hashCode = (((((this.f4474a ^ 1000003) * 1000003) ^ this.f4475b.hashCode()) * 1000003) ^ this.f4476c.hashCode()) * 1000003;
        if (this.d) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        return hashCode ^ i3;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f4474a + ", version=" + this.f4475b + ", buildVersion=" + this.f4476c + ", jailbroken=" + this.d + "}";
    }
}
