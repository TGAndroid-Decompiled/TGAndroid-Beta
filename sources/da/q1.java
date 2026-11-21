package da;
public final class q1 {
    public final String f8180a;
    public final String f8181b;
    public final String f8182c;
    public final String d;
    public final int f8183e;
    public final sg.h0 f8184f;

    public q1(String str, String str2, String str3, String str4, int i7, sg.h0 h0Var) {
        if (str != null) {
            this.f8180a = str;
            if (str2 != null) {
                this.f8181b = str2;
                if (str3 != null) {
                    this.f8182c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f8183e = i7;
                        this.f8184f = h0Var;
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
                if (this.f8180a.equals(q1Var.f8180a) && this.f8181b.equals(q1Var.f8181b) && this.f8182c.equals(q1Var.f8182c) && this.d.equals(q1Var.d) && this.f8183e == q1Var.f8183e && this.f8184f.equals(q1Var.f8184f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f8180a.hashCode() ^ 1000003) * 1000003) ^ this.f8181b.hashCode()) * 1000003) ^ this.f8182c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f8183e) * 1000003) ^ this.f8184f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f8180a + ", versionCode=" + this.f8181b + ", versionName=" + this.f8182c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f8183e + ", developmentPlatformProvider=" + this.f8184f + "}";
    }
}
