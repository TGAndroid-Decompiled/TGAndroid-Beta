package da;
public final class q1 {
    public final String f8485a;
    public final String f8486b;
    public final String f8487c;
    public final String d;
    public final int f8488e;
    public final sg.i0 f8489f;

    public q1(String str, String str2, String str3, String str4, int i7, sg.i0 i0Var) {
        if (str != null) {
            this.f8485a = str;
            if (str2 != null) {
                this.f8486b = str2;
                if (str3 != null) {
                    this.f8487c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f8488e = i7;
                        this.f8489f = i0Var;
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
                if (this.f8485a.equals(q1Var.f8485a) && this.f8486b.equals(q1Var.f8486b) && this.f8487c.equals(q1Var.f8487c) && this.d.equals(q1Var.d) && this.f8488e == q1Var.f8488e && this.f8489f.equals(q1Var.f8489f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f8485a.hashCode() ^ 1000003) * 1000003) ^ this.f8486b.hashCode()) * 1000003) ^ this.f8487c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f8488e) * 1000003) ^ this.f8489f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f8485a + ", versionCode=" + this.f8486b + ", versionName=" + this.f8487c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f8488e + ", developmentPlatformProvider=" + this.f8489f + "}";
    }
}
