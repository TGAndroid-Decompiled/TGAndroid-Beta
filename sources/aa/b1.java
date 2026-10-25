package aa;
public final class b1 extends d2 {
    public final int f1037a;
    public final String f1038b;
    public final String f1039c;
    public final boolean d;

    public b1(int i10, String str, String str2, boolean z10) {
        this.f1037a = i10;
        this.f1038b = str;
        this.f1039c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d2) {
            b1 b1Var = (b1) ((d2) obj);
            if (this.f1037a == b1Var.f1037a && this.f1038b.equals(b1Var.f1038b) && this.f1039c.equals(b1Var.f1039c) && this.d == b1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f1037a ^ 1000003) * 1000003) ^ this.f1038b.hashCode()) * 1000003) ^ this.f1039c.hashCode()) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f1037a + ", version=" + this.f1038b + ", buildVersion=" + this.f1039c + ", jailbroken=" + this.d + "}";
    }
}
