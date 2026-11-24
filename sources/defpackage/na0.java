package defpackage;
public final class na0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final byte e;
    public final lv6 f;

    public na0(String str, String str2, String str3, String str4, int i, lv6 lv6Var) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i;
                        this.f = lv6Var;
                        return;
                    }
                    fvc.f("Null installUuid");
                    throw null;
                }
                fvc.f("Null versionName");
                throw null;
            }
            fvc.f("Null versionCode");
            throw null;
        }
        fvc.f("Null appIdentifier");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof na0) {
            na0 na0Var = (na0) obj;
            if (this.a.equals(na0Var.a) && this.b.equals(na0Var.b) && this.c.equals(na0Var.c) && this.d.equals(na0Var.d) && this.e == na0Var.e && this.f == na0Var.f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + ((int) this.e) + ", developmentPlatformProvider=" + this.f + "}";
    }
}
