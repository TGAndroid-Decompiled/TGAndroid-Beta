package aa;
public final class e1 {
    public final String f1070a;
    public final String f1071b;
    public final String f1072c;
    public final String d;
    public final int e;
    public final m4.c f1073f;

    public e1(String str, String str2, String str3, String str4, int i10, m4.c cVar) {
        if (str != null) {
            this.f1070a = str;
            if (str2 != null) {
                this.f1071b = str2;
                if (str3 != null) {
                    this.f1072c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i10;
                        this.f1073f = cVar;
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
            if (obj instanceof e1) {
                e1 e1Var = (e1) obj;
                if (this.f1070a.equals(e1Var.f1070a) && this.f1071b.equals(e1Var.f1071b) && this.f1072c.equals(e1Var.f1072c) && this.d.equals(e1Var.d) && this.e == e1Var.e && this.f1073f.equals(e1Var.f1073f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f1070a.hashCode() ^ 1000003) * 1000003) ^ this.f1071b.hashCode()) * 1000003) ^ this.f1072c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f1073f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f1070a + ", versionCode=" + this.f1071b + ", versionName=" + this.f1072c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f1073f + "}";
    }
}
