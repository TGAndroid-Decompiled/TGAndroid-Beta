package k9;
public final class c1 {
    public final String f10079a;
    public final String f10080b;
    public final String f10081c;
    public final String d;
    public final int e;
    public final f7.b f10082f;

    public c1(String str, String str2, String str3, String str4, int i10, f7.b bVar) {
        if (str != null) {
            this.f10079a = str;
            if (str2 != null) {
                this.f10080b = str2;
                if (str3 != null) {
                    this.f10081c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f10082f = bVar;
                        return;
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof c1) {
                c1 c1Var = (c1) obj;
                if (this.f10079a.equals(c1Var.f10079a) && this.f10080b.equals(c1Var.f10080b) && this.f10081c.equals(c1Var.f10081c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f10082f.equals(c1Var.f10082f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f10079a.hashCode() ^ 1000003) * 1000003) ^ this.f10080b.hashCode()) * 1000003) ^ this.f10081c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f10082f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f10079a + ", versionCode=" + this.f10080b + ", versionName=" + this.f10081c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f10082f + "}";
    }
}
