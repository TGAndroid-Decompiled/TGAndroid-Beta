package k9;
public final class z0 extends b2 {
    public final int f10276a;
    public final String f10277b;
    public final String f10278c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z4) {
        this.f10276a = i10;
        this.f10277b = str;
        this.f10278c = str2;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f10276a == z0Var.f10276a && this.f10277b.equals(z0Var.f10277b) && this.f10278c.equals(z0Var.f10278c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f10276a ^ 1000003) * 1000003) ^ this.f10277b.hashCode()) * 1000003) ^ this.f10278c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f10276a + ", version=" + this.f10277b + ", buildVersion=" + this.f10278c + ", jailbroken=" + this.d + "}";
    }
}
