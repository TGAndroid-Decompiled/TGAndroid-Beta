package k9;
public final class z0 extends b2 {
    public final int f11041a;
    public final String f11042b;
    public final String f11043c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z4) {
        this.f11041a = i10;
        this.f11042b = str;
        this.f11043c = str2;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f11041a == z0Var.f11041a && this.f11042b.equals(z0Var.f11042b) && this.f11043c.equals(z0Var.f11043c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f11041a ^ 1000003) * 1000003) ^ this.f11042b.hashCode()) * 1000003) ^ this.f11043c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f11041a + ", version=" + this.f11042b + ", buildVersion=" + this.f11043c + ", jailbroken=" + this.d + "}";
    }
}
