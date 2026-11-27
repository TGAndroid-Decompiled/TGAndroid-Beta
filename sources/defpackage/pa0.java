package defpackage;
public final class pa0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final byte e;
    public final qx6 f;

    public pa0(String str, String str2, String str3, String str4, int i, qx6 qx6Var) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i;
                        this.f = qx6Var;
                        return;
                    }
                    p3d.h("Null installUuid");
                    throw null;
                }
                p3d.h("Null versionName");
                throw null;
            }
            p3d.h("Null versionCode");
            throw null;
        }
        p3d.h("Null appIdentifier");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pa0) {
            pa0 pa0Var = (pa0) obj;
            if (this.a.equals(pa0Var.a) && this.b.equals(pa0Var.b) && this.c.equals(pa0Var.c) && this.d.equals(pa0Var.d) && this.e == pa0Var.e && this.f == pa0Var.f) {
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
