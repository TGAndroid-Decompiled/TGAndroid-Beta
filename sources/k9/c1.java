package k9;
public final class c1 {
    public final String f10099a;
    public final String f10100b;
    public final String f10101c;
    public final String d;
    public final int e;
    public final f7.b f10102f;

    public c1(String str, String str2, String str3, String str4, int i10, f7.b bVar) {
        if (str != null) {
            this.f10099a = str;
            if (str2 != null) {
                this.f10100b = str2;
                if (str3 != null) {
                    this.f10101c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f10102f = bVar;
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
                if (this.f10099a.equals(c1Var.f10099a) && this.f10100b.equals(c1Var.f10100b) && this.f10101c.equals(c1Var.f10101c) && this.d.equals(c1Var.d) && this.e == c1Var.e && this.f10102f.equals(c1Var.f10102f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f10099a.hashCode() ^ 1000003) * 1000003) ^ this.f10100b.hashCode()) * 1000003) ^ this.f10101c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f10102f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f10099a + ", versionCode=" + this.f10100b + ", versionName=" + this.f10101c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f10102f + "}";
    }
}
