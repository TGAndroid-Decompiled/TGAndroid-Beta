package i9;
public final class c1 {
    public final String f8618a;
    public final String f8619b;
    public final String f8620c;
    public final String d;
    public final int f8621e;
    public final ze.b f8622f;

    public c1(String str, String str2, String str3, String str4, int i10, ze.b bVar) {
        if (str != null) {
            this.f8618a = str;
            if (str2 != null) {
                this.f8619b = str2;
                if (str3 != null) {
                    this.f8620c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f8621e = i10;
                        this.f8622f = bVar;
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
                if (this.f8618a.equals(c1Var.f8618a) && this.f8619b.equals(c1Var.f8619b) && this.f8620c.equals(c1Var.f8620c) && this.d.equals(c1Var.d) && this.f8621e == c1Var.f8621e && this.f8622f.equals(c1Var.f8622f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f8618a.hashCode() ^ 1000003) * 1000003) ^ this.f8619b.hashCode()) * 1000003) ^ this.f8620c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f8621e) * 1000003) ^ this.f8622f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f8618a + ", versionCode=" + this.f8619b + ", versionName=" + this.f8620c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f8621e + ", developmentPlatformProvider=" + this.f8622f + "}";
    }
}
