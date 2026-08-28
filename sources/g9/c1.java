package g9;
public final class c1 {
    public final String f7483a;
    public final String f7484b;
    public final String f7485c;
    public final String d;
    public final int f7486e;
    public final we.b f7487f;

    public c1(String str, String str2, String str3, String str4, int i9, we.b bVar) {
        if (str != null) {
            this.f7483a = str;
            if (str2 != null) {
                this.f7484b = str2;
                if (str3 != null) {
                    this.f7485c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f7486e = i9;
                        this.f7487f = bVar;
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
                if (this.f7483a.equals(c1Var.f7483a) && this.f7484b.equals(c1Var.f7484b) && this.f7485c.equals(c1Var.f7485c) && this.d.equals(c1Var.d) && this.f7486e == c1Var.f7486e && this.f7487f.equals(c1Var.f7487f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f7483a.hashCode() ^ 1000003) * 1000003) ^ this.f7484b.hashCode()) * 1000003) ^ this.f7485c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f7486e) * 1000003) ^ this.f7487f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f7483a + ", versionCode=" + this.f7484b + ", versionName=" + this.f7485c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f7486e + ", developmentPlatformProvider=" + this.f7487f + "}";
    }
}
