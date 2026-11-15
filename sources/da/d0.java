package da;
public final class d0 extends u2 {
    public final String f7702b;
    public final String f7703c;
    public final int d;
    public final String f7704e;
    public final String f7705f;
    public final String f7706g;
    public final String h;
    public final String f7707i;
    public final String f7708j;
    public final t2 f7709k;
    public final x1 f7710l;
    public final u1 f7711m;

    public d0(String str, String str2, int i7, String str3, String str4, String str5, String str6, String str7, String str8, t2 t2Var, x1 x1Var, u1 u1Var) {
        this.f7702b = str;
        this.f7703c = str2;
        this.d = i7;
        this.f7704e = str3;
        this.f7705f = str4;
        this.f7706g = str5;
        this.h = str6;
        this.f7707i = str7;
        this.f7708j = str8;
        this.f7709k = t2Var;
        this.f7710l = x1Var;
        this.f7711m = u1Var;
    }

    public final c0 a() {
        ?? obj = new Object();
        obj.f7676a = this.f7702b;
        obj.f7677b = this.f7703c;
        obj.f7678c = this.d;
        obj.d = this.f7704e;
        obj.f7679e = this.f7705f;
        obj.f7680f = this.f7706g;
        obj.f7681g = this.h;
        obj.h = this.f7707i;
        obj.f7682i = this.f7708j;
        obj.f7683j = this.f7709k;
        obj.f7684k = this.f7710l;
        obj.f7685l = this.f7711m;
        obj.f7686m = (byte) 1;
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
            u1 u1Var2 = d0Var.f7711m;
            x1 x1Var2 = d0Var.f7710l;
            t2 t2Var2 = d0Var.f7709k;
            String str4 = d0Var.h;
            String str5 = d0Var.f7706g;
            String str6 = d0Var.f7705f;
            if (this.f7702b.equals(d0Var.f7702b) && this.f7703c.equals(d0Var.f7703c) && this.d == d0Var.d && this.f7704e.equals(d0Var.f7704e) && ((str = this.f7705f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f7706g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.h) != null ? str3.equals(str4) : str4 == null) && this.f7707i.equals(d0Var.f7707i) && this.f7708j.equals(d0Var.f7708j) && ((t2Var = this.f7709k) != null ? t2Var.equals(t2Var2) : t2Var2 == null) && ((x1Var = this.f7710l) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && ((u1Var = this.f7711m) != null ? u1Var.equals(u1Var2) : u1Var2 == null)) {
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
        int hashCode6 = (((((((this.f7702b.hashCode() ^ 1000003) * 1000003) ^ this.f7703c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f7704e.hashCode()) * 1000003;
        int i7 = 0;
        String str = this.f7705f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f7706g;
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
        int hashCode7 = (((((i11 ^ hashCode3) * 1000003) ^ this.f7707i.hashCode()) * 1000003) ^ this.f7708j.hashCode()) * 1000003;
        t2 t2Var = this.f7709k;
        if (t2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t2Var.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode4) * 1000003;
        x1 x1Var = this.f7710l;
        if (x1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = x1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode5) * 1000003;
        u1 u1Var = this.f7711m;
        if (u1Var != null) {
            i7 = u1Var.hashCode();
        }
        return i13 ^ i7;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f7702b + ", gmpAppId=" + this.f7703c + ", platform=" + this.d + ", installationUuid=" + this.f7704e + ", firebaseInstallationId=" + this.f7705f + ", firebaseAuthenticationToken=" + this.f7706g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.f7707i + ", displayVersion=" + this.f7708j + ", session=" + this.f7709k + ", ndkPayload=" + this.f7710l + ", appExitInfo=" + this.f7711m + "}";
    }
}
