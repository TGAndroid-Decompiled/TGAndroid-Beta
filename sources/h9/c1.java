package h9;

public final class c1 {

    public final String f8654a;

    public final String f8655b;

    public final String f8656c;
    public final String d;

    public final int f8657e;

    public final xe.b f8658f;

    public c1(String str, String str2, String str3, String str4, int i10, xe.b bVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f8654a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f8655b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f8656c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.d = str4;
        this.f8657e = i10;
        this.f8658f = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f8654a.equals(c1Var.f8654a) && this.f8655b.equals(c1Var.f8655b) && this.f8656c.equals(c1Var.f8656c) && this.d.equals(c1Var.d) && this.f8657e == c1Var.f8657e && this.f8658f.equals(c1Var.f8658f);
    }

    public final int hashCode() {
        return ((((((((((this.f8654a.hashCode() ^ 1000003) * 1000003) ^ this.f8655b.hashCode()) * 1000003) ^ this.f8656c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f8657e) * 1000003) ^ this.f8658f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f8654a + ", versionCode=" + this.f8655b + ", versionName=" + this.f8656c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.f8657e + ", developmentPlatformProvider=" + this.f8658f + "}";
    }
}
