package ca;
public final class q1 {
    public final String f4508a;
    public final String f4509b;
    public final String f4510c;
    public final String d;
    public final int f4511e;
    public final w9.b f4512f;

    public q1(String str, String str2, String str3, String str4, int i3, w9.b bVar) {
        if (str != null) {
            this.f4508a = str;
            if (str2 != null) {
                this.f4509b = str2;
                if (str3 != null) {
                    this.f4510c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f4511e = i3;
                        this.f4512f = bVar;
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
                if (this.f4508a.equals(q1Var.f4508a) && this.f4509b.equals(q1Var.f4509b) && this.f4510c.equals(q1Var.f4510c) && this.d.equals(q1Var.d) && this.f4511e == q1Var.f4511e && this.f4512f.equals(q1Var.f4512f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f4508a.hashCode() ^ 1000003) * 1000003) ^ this.f4509b.hashCode()) * 1000003) ^ this.f4510c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f4511e) * 1000003) ^ this.f4512f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f4508a + ", versionCode=" + this.f4509b + ", versionName=" + this.f4510c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f4511e + ", developmentPlatformProvider=" + this.f4512f + "}";
    }
}
