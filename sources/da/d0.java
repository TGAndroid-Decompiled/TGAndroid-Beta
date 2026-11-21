package da;
public final class d0 extends u2 {
    public final String f8010b;
    public final String f8011c;
    public final int d;
    public final String f8012e;
    public final String f8013f;
    public final String f8014g;
    public final String h;
    public final String f8015i;
    public final String f8016j;
    public final t2 f8017k;
    public final x1 f8018l;
    public final u1 f8019m;

    public d0(String str, String str2, int i7, String str3, String str4, String str5, String str6, String str7, String str8, t2 t2Var, x1 x1Var, u1 u1Var) {
        this.f8010b = str;
        this.f8011c = str2;
        this.d = i7;
        this.f8012e = str3;
        this.f8013f = str4;
        this.f8014g = str5;
        this.h = str6;
        this.f8015i = str7;
        this.f8016j = str8;
        this.f8017k = t2Var;
        this.f8018l = x1Var;
        this.f8019m = u1Var;
    }

    public final c0 a() {
        ?? obj = new Object();
        obj.f7984a = this.f8010b;
        obj.f7985b = this.f8011c;
        obj.f7986c = this.d;
        obj.d = this.f8012e;
        obj.f7987e = this.f8013f;
        obj.f7988f = this.f8014g;
        obj.f7989g = this.h;
        obj.h = this.f8015i;
        obj.f7990i = this.f8016j;
        obj.f7991j = this.f8017k;
        obj.f7992k = this.f8018l;
        obj.f7993l = this.f8019m;
        obj.f7994m = (byte) 1;
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
            u1 u1Var2 = d0Var.f8019m;
            x1 x1Var2 = d0Var.f8018l;
            t2 t2Var2 = d0Var.f8017k;
            String str4 = d0Var.h;
            String str5 = d0Var.f8014g;
            String str6 = d0Var.f8013f;
            if (this.f8010b.equals(d0Var.f8010b) && this.f8011c.equals(d0Var.f8011c) && this.d == d0Var.d && this.f8012e.equals(d0Var.f8012e) && ((str = this.f8013f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f8014g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.h) != null ? str3.equals(str4) : str4 == null) && this.f8015i.equals(d0Var.f8015i) && this.f8016j.equals(d0Var.f8016j) && ((t2Var = this.f8017k) != null ? t2Var.equals(t2Var2) : t2Var2 == null) && ((x1Var = this.f8018l) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && ((u1Var = this.f8019m) != null ? u1Var.equals(u1Var2) : u1Var2 == null)) {
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
        int hashCode6 = (((((((this.f8010b.hashCode() ^ 1000003) * 1000003) ^ this.f8011c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f8012e.hashCode()) * 1000003;
        int i7 = 0;
        String str = this.f8013f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f8014g;
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
        int hashCode7 = (((((i11 ^ hashCode3) * 1000003) ^ this.f8015i.hashCode()) * 1000003) ^ this.f8016j.hashCode()) * 1000003;
        t2 t2Var = this.f8017k;
        if (t2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t2Var.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode4) * 1000003;
        x1 x1Var = this.f8018l;
        if (x1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = x1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode5) * 1000003;
        u1 u1Var = this.f8019m;
        if (u1Var != null) {
            i7 = u1Var.hashCode();
        }
        return i13 ^ i7;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f8010b + ", gmpAppId=" + this.f8011c + ", platform=" + this.d + ", installationUuid=" + this.f8012e + ", firebaseInstallationId=" + this.f8013f + ", firebaseAuthenticationToken=" + this.f8014g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.f8015i + ", displayVersion=" + this.f8016j + ", session=" + this.f8017k + ", ndkPayload=" + this.f8018l + ", appExitInfo=" + this.f8019m + "}";
    }
}
