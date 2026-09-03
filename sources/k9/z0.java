package k9;
public final class z0 extends b2 {
    public final int f10256a;
    public final String f10257b;
    public final String f10258c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z4) {
        this.f10256a = i10;
        this.f10257b = str;
        this.f10258c = str2;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f10256a == z0Var.f10256a && this.f10257b.equals(z0Var.f10257b) && this.f10258c.equals(z0Var.f10258c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f10256a ^ 1000003) * 1000003) ^ this.f10257b.hashCode()) * 1000003) ^ this.f10258c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f10256a + ", version=" + this.f10257b + ", buildVersion=" + this.f10258c + ", jailbroken=" + this.d + "}";
    }
}
