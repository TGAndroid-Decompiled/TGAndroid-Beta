package defpackage;
public final class nb0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final byte e;
    public final hi2 f;

    public nb0(String str, String str2, String str3, String str4, int i, hi2 hi2Var) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i;
                        this.f = hi2Var;
                        return;
                    }
                    gxc.d("Null installUuid");
                    throw null;
                }
                gxc.d("Null versionName");
                throw null;
            }
            gxc.d("Null versionCode");
            throw null;
        }
        gxc.d("Null appIdentifier");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nb0) {
            nb0 nb0Var = (nb0) obj;
            if (this.a.equals(nb0Var.a) && this.b.equals(nb0Var.b) && this.c.equals(nb0Var.c) && this.d.equals(nb0Var.d) && this.e == nb0Var.e && this.f == nb0Var.f) {
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
