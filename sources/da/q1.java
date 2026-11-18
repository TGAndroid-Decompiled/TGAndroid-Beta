package da;
public final class q1 {
    public final String f8151a;
    public final String f8152b;
    public final String f8153c;
    public final String d;
    public final int f8154e;
    public final sg.h0 f8155f;

    public q1(String str, String str2, String str3, String str4, int i7, sg.h0 h0Var) {
        if (str != null) {
            this.f8151a = str;
            if (str2 != null) {
                this.f8152b = str2;
                if (str3 != null) {
                    this.f8153c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f8154e = i7;
                        this.f8155f = h0Var;
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
                if (this.f8151a.equals(q1Var.f8151a) && this.f8152b.equals(q1Var.f8152b) && this.f8153c.equals(q1Var.f8153c) && this.d.equals(q1Var.d) && this.f8154e == q1Var.f8154e && this.f8155f.equals(q1Var.f8155f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f8151a.hashCode() ^ 1000003) * 1000003) ^ this.f8152b.hashCode()) * 1000003) ^ this.f8153c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f8154e) * 1000003) ^ this.f8155f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f8151a + ", versionCode=" + this.f8152b + ", versionName=" + this.f8153c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f8154e + ", developmentPlatformProvider=" + this.f8155f + "}";
    }
}
