package da;
public final class q1 {
    public final String f7869a;
    public final String f7870b;
    public final String f7871c;
    public final String d;
    public final int f7872e;
    public final sg.h0 f7873f;

    public q1(String str, String str2, String str3, String str4, int i7, sg.h0 h0Var) {
        if (str != null) {
            this.f7869a = str;
            if (str2 != null) {
                this.f7870b = str2;
                if (str3 != null) {
                    this.f7871c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f7872e = i7;
                        this.f7873f = h0Var;
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
                if (this.f7869a.equals(q1Var.f7869a) && this.f7870b.equals(q1Var.f7870b) && this.f7871c.equals(q1Var.f7871c) && this.d.equals(q1Var.d) && this.f7872e == q1Var.f7872e && this.f7873f.equals(q1Var.f7873f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f7869a.hashCode() ^ 1000003) * 1000003) ^ this.f7870b.hashCode()) * 1000003) ^ this.f7871c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f7872e) * 1000003) ^ this.f7873f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f7869a + ", versionCode=" + this.f7870b + ", versionName=" + this.f7871c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f7872e + ", developmentPlatformProvider=" + this.f7873f + "}";
    }
}
