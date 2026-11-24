package defpackage;
public final class ka0 extends p03 {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public ka0(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p03) {
            ka0 ka0Var = (ka0) ((p03) obj);
            if (this.a == ka0Var.a && this.b.equals(ka0Var.b) && this.c.equals(ka0Var.c) && this.d == ka0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.d + "}";
    }
}
