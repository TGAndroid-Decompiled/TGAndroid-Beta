package da;
public final class d0 extends u2 {
    public final String f7699b;
    public final String f7700c;
    public final int d;
    public final String f7701e;
    public final String f7702f;
    public final String f7703g;
    public final String h;
    public final String f7704i;
    public final String f7705j;
    public final t2 f7706k;
    public final x1 f7707l;
    public final u1 f7708m;

    public d0(String str, String str2, int i7, String str3, String str4, String str5, String str6, String str7, String str8, t2 t2Var, x1 x1Var, u1 u1Var) {
        this.f7699b = str;
        this.f7700c = str2;
        this.d = i7;
        this.f7701e = str3;
        this.f7702f = str4;
        this.f7703g = str5;
        this.h = str6;
        this.f7704i = str7;
        this.f7705j = str8;
        this.f7706k = t2Var;
        this.f7707l = x1Var;
        this.f7708m = u1Var;
    }

    public final c0 a() {
        ?? obj = new Object();
        obj.f7673a = this.f7699b;
        obj.f7674b = this.f7700c;
        obj.f7675c = this.d;
        obj.d = this.f7701e;
        obj.f7676e = this.f7702f;
        obj.f7677f = this.f7703g;
        obj.f7678g = this.h;
        obj.h = this.f7704i;
        obj.f7679i = this.f7705j;
        obj.f7680j = this.f7706k;
        obj.f7681k = this.f7707l;
        obj.f7682l = this.f7708m;
        obj.f7683m = (byte) 1;
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
            u1 u1Var2 = d0Var.f7708m;
            x1 x1Var2 = d0Var.f7707l;
            t2 t2Var2 = d0Var.f7706k;
            String str4 = d0Var.h;
            String str5 = d0Var.f7703g;
            String str6 = d0Var.f7702f;
            if (this.f7699b.equals(d0Var.f7699b) && this.f7700c.equals(d0Var.f7700c) && this.d == d0Var.d && this.f7701e.equals(d0Var.f7701e) && ((str = this.f7702f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f7703g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.h) != null ? str3.equals(str4) : str4 == null) && this.f7704i.equals(d0Var.f7704i) && this.f7705j.equals(d0Var.f7705j) && ((t2Var = this.f7706k) != null ? t2Var.equals(t2Var2) : t2Var2 == null) && ((x1Var = this.f7707l) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && ((u1Var = this.f7708m) != null ? u1Var.equals(u1Var2) : u1Var2 == null)) {
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
        int hashCode6 = (((((((this.f7699b.hashCode() ^ 1000003) * 1000003) ^ this.f7700c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f7701e.hashCode()) * 1000003;
        int i7 = 0;
        String str = this.f7702f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f7703g;
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
        int hashCode7 = (((((i11 ^ hashCode3) * 1000003) ^ this.f7704i.hashCode()) * 1000003) ^ this.f7705j.hashCode()) * 1000003;
        t2 t2Var = this.f7706k;
        if (t2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t2Var.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode4) * 1000003;
        x1 x1Var = this.f7707l;
        if (x1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = x1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode5) * 1000003;
        u1 u1Var = this.f7708m;
        if (u1Var != null) {
            i7 = u1Var.hashCode();
        }
        return i13 ^ i7;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f7699b + ", gmpAppId=" + this.f7700c + ", platform=" + this.d + ", installationUuid=" + this.f7701e + ", firebaseInstallationId=" + this.f7702f + ", firebaseAuthenticationToken=" + this.f7703g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.f7704i + ", displayVersion=" + this.f7705j + ", session=" + this.f7706k + ", ndkPayload=" + this.f7707l + ", appExitInfo=" + this.f7708m + "}";
    }
}
