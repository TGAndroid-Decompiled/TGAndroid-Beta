package g9;
public final class z0 extends b2 {
    public final int f7686a;
    public final String f7687b;
    public final String f7688c;
    public final boolean d;

    public z0(int i9, String str, String str2, boolean z10) {
        this.f7686a = i9;
        this.f7687b = str;
        this.f7688c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f7686a == z0Var.f7686a && this.f7687b.equals(z0Var.f7687b) && this.f7688c.equals(z0Var.f7688c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = (((((this.f7686a ^ 1000003) * 1000003) ^ this.f7687b.hashCode()) * 1000003) ^ this.f7688c.hashCode()) * 1000003;
        if (this.d) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return hashCode ^ i9;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f7686a + ", version=" + this.f7687b + ", buildVersion=" + this.f7688c + ", jailbroken=" + this.d + "}";
    }
}
