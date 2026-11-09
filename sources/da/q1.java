package da;
public final class q1 {
    public final String f8480a;
    public final String f8481b;
    public final String f8482c;
    public final String d;
    public final int f8483e;
    public final sg.i0 f8484f;

    public q1(String str, String str2, String str3, String str4, int i7, sg.i0 i0Var) {
        if (str != null) {
            this.f8480a = str;
            if (str2 != null) {
                this.f8481b = str2;
                if (str3 != null) {
                    this.f8482c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f8483e = i7;
                        this.f8484f = i0Var;
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
                if (this.f8480a.equals(q1Var.f8480a) && this.f8481b.equals(q1Var.f8481b) && this.f8482c.equals(q1Var.f8482c) && this.d.equals(q1Var.d) && this.f8483e == q1Var.f8483e && this.f8484f.equals(q1Var.f8484f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f8480a.hashCode() ^ 1000003) * 1000003) ^ this.f8481b.hashCode()) * 1000003) ^ this.f8482c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f8483e) * 1000003) ^ this.f8484f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f8480a + ", versionCode=" + this.f8481b + ", versionName=" + this.f8482c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f8483e + ", developmentPlatformProvider=" + this.f8484f + "}";
    }
}
