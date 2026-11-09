package da;
public final class d0 extends u2 {
    public final String f8310b;
    public final String f8311c;
    public final int d;
    public final String f8312e;
    public final String f8313f;
    public final String f8314g;
    public final String h;
    public final String f8315i;
    public final String f8316j;
    public final t2 f8317k;
    public final x1 f8318l;
    public final u1 f8319m;

    public d0(String str, String str2, int i7, String str3, String str4, String str5, String str6, String str7, String str8, t2 t2Var, x1 x1Var, u1 u1Var) {
        this.f8310b = str;
        this.f8311c = str2;
        this.d = i7;
        this.f8312e = str3;
        this.f8313f = str4;
        this.f8314g = str5;
        this.h = str6;
        this.f8315i = str7;
        this.f8316j = str8;
        this.f8317k = t2Var;
        this.f8318l = x1Var;
        this.f8319m = u1Var;
    }

    public final c0 a() {
        ?? obj = new Object();
        obj.f8284a = this.f8310b;
        obj.f8285b = this.f8311c;
        obj.f8286c = this.d;
        obj.d = this.f8312e;
        obj.f8287e = this.f8313f;
        obj.f8288f = this.f8314g;
        obj.f8289g = this.h;
        obj.h = this.f8315i;
        obj.f8290i = this.f8316j;
        obj.f8291j = this.f8317k;
        obj.f8292k = this.f8318l;
        obj.f8293l = this.f8319m;
        obj.f8294m = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        t2 t2Var;
        x1 x1Var;
        u1 u1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u2) {
            d0 d0Var = (d0) ((u2) obj);
            u1 u1Var2 = d0Var.f8319m;
            x1 x1Var2 = d0Var.f8318l;
            t2 t2Var2 = d0Var.f8317k;
            String str4 = d0Var.h;
            String str5 = d0Var.f8314g;
            String str6 = d0Var.f8313f;
            if (this.f8310b.equals(d0Var.f8310b) && this.f8311c.equals(d0Var.f8311c) && this.d == d0Var.d && this.f8312e.equals(d0Var.f8312e) && ((str = this.f8313f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f8314g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.h) != null ? str3.equals(str4) : str4 == null) && this.f8315i.equals(d0Var.f8315i) && this.f8316j.equals(d0Var.f8316j) && ((t2Var = this.f8317k) != null ? t2Var.equals(t2Var2) : t2Var2 == null) && ((x1Var = this.f8318l) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && ((u1Var = this.f8319m) != null ? u1Var.equals(u1Var2) : u1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((((((this.f8310b.hashCode() ^ 1000003) * 1000003) ^ this.f8311c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f8312e.hashCode()) * 1000003;
        int i7 = 0;
        String str = this.f8313f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f8314g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str3 = this.h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode7 = (((((i11 ^ hashCode3) * 1000003) ^ this.f8315i.hashCode()) * 1000003) ^ this.f8316j.hashCode()) * 1000003;
        t2 t2Var = this.f8317k;
        if (t2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t2Var.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode4) * 1000003;
        x1 x1Var = this.f8318l;
        if (x1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = x1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode5) * 1000003;
        u1 u1Var = this.f8319m;
        if (u1Var != null) {
            i7 = u1Var.hashCode();
        }
        return i13 ^ i7;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f8310b + ", gmpAppId=" + this.f8311c + ", platform=" + this.d + ", installationUuid=" + this.f8312e + ", firebaseInstallationId=" + this.f8313f + ", firebaseAuthenticationToken=" + this.f8314g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.f8315i + ", displayVersion=" + this.f8316j + ", session=" + this.f8317k + ", ndkPayload=" + this.f8318l + ", appExitInfo=" + this.f8319m + "}";
    }
}
