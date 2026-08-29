package i9;
public final class z0 extends b2 {
    public final int f8821a;
    public final String f8822b;
    public final String f8823c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f8821a = i10;
        this.f8822b = str;
        this.f8823c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f8821a == z0Var.f8821a && this.f8822b.equals(z0Var.f8822b) && this.f8823c.equals(z0Var.f8823c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f8821a ^ 1000003) * 1000003) ^ this.f8822b.hashCode()) * 1000003) ^ this.f8823c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f8821a + ", version=" + this.f8822b + ", buildVersion=" + this.f8823c + ", jailbroken=" + this.d + "}";
    }
}
