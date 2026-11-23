package da;
public final class q1 {
    public final String f8146a;
    public final String f8147b;
    public final String f8148c;
    public final String d;
    public final int f8149e;
    public final sg.h0 f8150f;

    public q1(String str, String str2, String str3, String str4, int i7, sg.h0 h0Var) {
        if (str != null) {
            this.f8146a = str;
            if (str2 != null) {
                this.f8147b = str2;
                if (str3 != null) {
                    this.f8148c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f8149e = i7;
                        this.f8150f = h0Var;
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
                if (this.f8146a.equals(q1Var.f8146a) && this.f8147b.equals(q1Var.f8147b) && this.f8148c.equals(q1Var.f8148c) && this.d.equals(q1Var.d) && this.f8149e == q1Var.f8149e && this.f8150f.equals(q1Var.f8150f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f8146a.hashCode() ^ 1000003) * 1000003) ^ this.f8147b.hashCode()) * 1000003) ^ this.f8148c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f8149e) * 1000003) ^ this.f8150f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f8146a + ", versionCode=" + this.f8147b + ", versionName=" + this.f8148c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f8149e + ", developmentPlatformProvider=" + this.f8150f + "}";
    }
}
