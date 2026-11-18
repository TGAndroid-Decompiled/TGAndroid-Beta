package da;
public final class d0 extends u2 {
    public final String f7981b;
    public final String f7982c;
    public final int d;
    public final String f7983e;
    public final String f7984f;
    public final String f7985g;
    public final String h;
    public final String f7986i;
    public final String f7987j;
    public final t2 f7988k;
    public final x1 f7989l;
    public final u1 f7990m;

    public d0(String str, String str2, int i7, String str3, String str4, String str5, String str6, String str7, String str8, t2 t2Var, x1 x1Var, u1 u1Var) {
        this.f7981b = str;
        this.f7982c = str2;
        this.d = i7;
        this.f7983e = str3;
        this.f7984f = str4;
        this.f7985g = str5;
        this.h = str6;
        this.f7986i = str7;
        this.f7987j = str8;
        this.f7988k = t2Var;
        this.f7989l = x1Var;
        this.f7990m = u1Var;
    }

    public final c0 a() {
        ?? obj = new Object();
        obj.f7955a = this.f7981b;
        obj.f7956b = this.f7982c;
        obj.f7957c = this.d;
        obj.d = this.f7983e;
        obj.f7958e = this.f7984f;
        obj.f7959f = this.f7985g;
        obj.f7960g = this.h;
        obj.h = this.f7986i;
        obj.f7961i = this.f7987j;
        obj.f7962j = this.f7988k;
        obj.f7963k = this.f7989l;
        obj.f7964l = this.f7990m;
        obj.f7965m = (byte) 1;
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
            u1 u1Var2 = d0Var.f7990m;
            x1 x1Var2 = d0Var.f7989l;
            t2 t2Var2 = d0Var.f7988k;
            String str4 = d0Var.h;
            String str5 = d0Var.f7985g;
            String str6 = d0Var.f7984f;
            if (this.f7981b.equals(d0Var.f7981b) && this.f7982c.equals(d0Var.f7982c) && this.d == d0Var.d && this.f7983e.equals(d0Var.f7983e) && ((str = this.f7984f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f7985g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.h) != null ? str3.equals(str4) : str4 == null) && this.f7986i.equals(d0Var.f7986i) && this.f7987j.equals(d0Var.f7987j) && ((t2Var = this.f7988k) != null ? t2Var.equals(t2Var2) : t2Var2 == null) && ((x1Var = this.f7989l) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && ((u1Var = this.f7990m) != null ? u1Var.equals(u1Var2) : u1Var2 == null)) {
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
        int hashCode6 = (((((((this.f7981b.hashCode() ^ 1000003) * 1000003) ^ this.f7982c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f7983e.hashCode()) * 1000003;
        int i7 = 0;
        String str = this.f7984f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f7985g;
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
        int hashCode7 = (((((i11 ^ hashCode3) * 1000003) ^ this.f7986i.hashCode()) * 1000003) ^ this.f7987j.hashCode()) * 1000003;
        t2 t2Var = this.f7988k;
        if (t2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t2Var.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode4) * 1000003;
        x1 x1Var = this.f7989l;
        if (x1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = x1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode5) * 1000003;
        u1 u1Var = this.f7990m;
        if (u1Var != null) {
            i7 = u1Var.hashCode();
        }
        return i13 ^ i7;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f7981b + ", gmpAppId=" + this.f7982c + ", platform=" + this.d + ", installationUuid=" + this.f7983e + ", firebaseInstallationId=" + this.f7984f + ", firebaseAuthenticationToken=" + this.f7985g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.f7986i + ", displayVersion=" + this.f7987j + ", session=" + this.f7988k + ", ndkPayload=" + this.f7989l + ", appExitInfo=" + this.f7990m + "}";
    }
}
