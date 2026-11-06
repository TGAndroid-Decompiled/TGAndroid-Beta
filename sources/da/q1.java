package da;
public final class q1 {
    public final String f8482a;
    public final String f8483b;
    public final String f8484c;
    public final String d;
    public final int f8485e;
    public final sg.i0 f8486f;

    public q1(String str, String str2, String str3, String str4, int i7, sg.i0 i0Var) {
        if (str != null) {
            this.f8482a = str;
            if (str2 != null) {
                this.f8483b = str2;
                if (str3 != null) {
                    this.f8484c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f8485e = i7;
                        this.f8486f = i0Var;
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
                if (this.f8482a.equals(q1Var.f8482a) && this.f8483b.equals(q1Var.f8483b) && this.f8484c.equals(q1Var.f8484c) && this.d.equals(q1Var.d) && this.f8485e == q1Var.f8485e && this.f8486f.equals(q1Var.f8486f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f8482a.hashCode() ^ 1000003) * 1000003) ^ this.f8483b.hashCode()) * 1000003) ^ this.f8484c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f8485e) * 1000003) ^ this.f8486f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f8482a + ", versionCode=" + this.f8483b + ", versionName=" + this.f8484c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f8485e + ", developmentPlatformProvider=" + this.f8486f + "}";
    }
}
