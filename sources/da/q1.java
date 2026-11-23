package da;
public final class q1 {
    public final String f8145a;
    public final String f8146b;
    public final String f8147c;
    public final String d;
    public final int f8148e;
    public final s2.e f8149f;

    public q1(String str, String str2, String str3, String str4, int i7, s2.e eVar) {
        if (str != null) {
            this.f8145a = str;
            if (str2 != null) {
                this.f8146b = str2;
                if (str3 != null) {
                    this.f8147c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f8148e = i7;
                        this.f8149f = eVar;
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
            if (obj instanceof q1) {
                q1 q1Var = (q1) obj;
                if (this.f8145a.equals(q1Var.f8145a) && this.f8146b.equals(q1Var.f8146b) && this.f8147c.equals(q1Var.f8147c) && this.d.equals(q1Var.d) && this.f8148e == q1Var.f8148e && this.f8149f.equals(q1Var.f8149f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f8145a.hashCode() ^ 1000003) * 1000003) ^ this.f8146b.hashCode()) * 1000003) ^ this.f8147c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f8148e) * 1000003) ^ this.f8149f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f8145a + ", versionCode=" + this.f8146b + ", versionName=" + this.f8147c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f8148e + ", developmentPlatformProvider=" + this.f8149f + "}";
    }
}
