package da;
public final class q1 {
    public final String f7872a;
    public final String f7873b;
    public final String f7874c;
    public final String d;
    public final int f7875e;
    public final sg.h0 f7876f;

    public q1(String str, String str2, String str3, String str4, int i7, sg.h0 h0Var) {
        if (str != null) {
            this.f7872a = str;
            if (str2 != null) {
                this.f7873b = str2;
                if (str3 != null) {
                    this.f7874c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f7875e = i7;
                        this.f7876f = h0Var;
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
                if (this.f7872a.equals(q1Var.f7872a) && this.f7873b.equals(q1Var.f7873b) && this.f7874c.equals(q1Var.f7874c) && this.d.equals(q1Var.d) && this.f7875e == q1Var.f7875e && this.f7876f.equals(q1Var.f7876f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f7872a.hashCode() ^ 1000003) * 1000003) ^ this.f7873b.hashCode()) * 1000003) ^ this.f7874c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f7875e) * 1000003) ^ this.f7876f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f7872a + ", versionCode=" + this.f7873b + ", versionName=" + this.f7874c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f7875e + ", developmentPlatformProvider=" + this.f7876f + "}";
    }
}
