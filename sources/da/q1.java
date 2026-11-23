package da;
public final class q1 {
    public final String f8183a;
    public final String f8184b;
    public final String f8185c;
    public final String d;
    public final int f8186e;
    public final sg.h0 f8187f;

    public q1(String str, String str2, String str3, String str4, int i7, sg.h0 h0Var) {
        if (str != null) {
            this.f8183a = str;
            if (str2 != null) {
                this.f8184b = str2;
                if (str3 != null) {
                    this.f8185c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f8186e = i7;
                        this.f8187f = h0Var;
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
                if (this.f8183a.equals(q1Var.f8183a) && this.f8184b.equals(q1Var.f8184b) && this.f8185c.equals(q1Var.f8185c) && this.d.equals(q1Var.d) && this.f8186e == q1Var.f8186e && this.f8187f.equals(q1Var.f8187f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f8183a.hashCode() ^ 1000003) * 1000003) ^ this.f8184b.hashCode()) * 1000003) ^ this.f8185c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f8186e) * 1000003) ^ this.f8187f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f8183a + ", versionCode=" + this.f8184b + ", versionName=" + this.f8185c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f8186e + ", developmentPlatformProvider=" + this.f8187f + "}";
    }
}
