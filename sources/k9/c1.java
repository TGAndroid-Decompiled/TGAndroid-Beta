package k9;
public final class c1 {
    public final String f10838a;
    public final String f10839b;
    public final String f10840c;
    public final String d;
    public final int f10841e;
    public final f7.b f10842f;

    public c1(String str, String str2, String str3, String str4, int i10, f7.b bVar) {
        if (str != null) {
            this.f10838a = str;
            if (str2 != null) {
                this.f10839b = str2;
                if (str3 != null) {
                    this.f10840c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f10841e = i10;
                        this.f10842f = bVar;
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
                if (this.f10838a.equals(c1Var.f10838a) && this.f10839b.equals(c1Var.f10839b) && this.f10840c.equals(c1Var.f10840c) && this.d.equals(c1Var.d) && this.f10841e == c1Var.f10841e && this.f10842f.equals(c1Var.f10842f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f10838a.hashCode() ^ 1000003) * 1000003) ^ this.f10839b.hashCode()) * 1000003) ^ this.f10840c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f10841e) * 1000003) ^ this.f10842f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f10838a + ", versionCode=" + this.f10839b + ", versionName=" + this.f10840c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f10841e + ", developmentPlatformProvider=" + this.f10842f + "}";
    }
}
