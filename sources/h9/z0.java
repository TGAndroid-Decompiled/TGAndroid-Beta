package h9;

public final class z0 extends b2 {

    public final int f8857a;

    public final String f8858b;

    public final String f8859c;
    public final boolean d;

    public z0(int i10, String str, String str2, boolean z10) {
        this.f8857a = i10;
        this.f8858b = str;
        this.f8859c = str2;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            z0 z0Var = (z0) ((b2) obj);
            if (this.f8857a == z0Var.f8857a && this.f8858b.equals(z0Var.f8858b) && this.f8859c.equals(z0Var.f8859c) && this.d == z0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f8857a ^ 1000003) * 1000003) ^ this.f8858b.hashCode()) * 1000003) ^ this.f8859c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f8857a + ", version=" + this.f8858b + ", buildVersion=" + this.f8859c + ", jailbroken=" + this.d + "}";
    }
}
