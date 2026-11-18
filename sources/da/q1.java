package da;
public final class q1 {
    public final String f8154a;
    public final String f8155b;
    public final String f8156c;
    public final String d;
    public final int f8157e;
    public final sg.h0 f8158f;

    public q1(String str, String str2, String str3, String str4, int i7, sg.h0 h0Var) {
        if (str != null) {
            this.f8154a = str;
            if (str2 != null) {
                this.f8155b = str2;
                if (str3 != null) {
                    this.f8156c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f8157e = i7;
                        this.f8158f = h0Var;
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
                if (this.f8154a.equals(q1Var.f8154a) && this.f8155b.equals(q1Var.f8155b) && this.f8156c.equals(q1Var.f8156c) && this.d.equals(q1Var.d) && this.f8157e == q1Var.f8157e && this.f8158f.equals(q1Var.f8158f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f8154a.hashCode() ^ 1000003) * 1000003) ^ this.f8155b.hashCode()) * 1000003) ^ this.f8156c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f8157e) * 1000003) ^ this.f8158f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f8154a + ", versionCode=" + this.f8155b + ", versionName=" + this.f8156c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f8157e + ", developmentPlatformProvider=" + this.f8158f + "}";
    }
}
