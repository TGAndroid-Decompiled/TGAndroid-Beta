package da;
public final class d0 extends u2 {
    public final String f7984b;
    public final String f7985c;
    public final int d;
    public final String f7986e;
    public final String f7987f;
    public final String f7988g;
    public final String h;
    public final String f7989i;
    public final String f7990j;
    public final t2 f7991k;
    public final x1 f7992l;
    public final u1 f7993m;

    public d0(String str, String str2, int i7, String str3, String str4, String str5, String str6, String str7, String str8, t2 t2Var, x1 x1Var, u1 u1Var) {
        this.f7984b = str;
        this.f7985c = str2;
        this.d = i7;
        this.f7986e = str3;
        this.f7987f = str4;
        this.f7988g = str5;
        this.h = str6;
        this.f7989i = str7;
        this.f7990j = str8;
        this.f7991k = t2Var;
        this.f7992l = x1Var;
        this.f7993m = u1Var;
    }

    public final c0 a() {
        ?? obj = new Object();
        obj.f7958a = this.f7984b;
        obj.f7959b = this.f7985c;
        obj.f7960c = this.d;
        obj.d = this.f7986e;
        obj.f7961e = this.f7987f;
        obj.f7962f = this.f7988g;
        obj.f7963g = this.h;
        obj.h = this.f7989i;
        obj.f7964i = this.f7990j;
        obj.f7965j = this.f7991k;
        obj.f7966k = this.f7992l;
        obj.f7967l = this.f7993m;
        obj.f7968m = (byte) 1;
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
            u1 u1Var2 = d0Var.f7993m;
            x1 x1Var2 = d0Var.f7992l;
            t2 t2Var2 = d0Var.f7991k;
            String str4 = d0Var.h;
            String str5 = d0Var.f7988g;
            String str6 = d0Var.f7987f;
            if (this.f7984b.equals(d0Var.f7984b) && this.f7985c.equals(d0Var.f7985c) && this.d == d0Var.d && this.f7986e.equals(d0Var.f7986e) && ((str = this.f7987f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f7988g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.h) != null ? str3.equals(str4) : str4 == null) && this.f7989i.equals(d0Var.f7989i) && this.f7990j.equals(d0Var.f7990j) && ((t2Var = this.f7991k) != null ? t2Var.equals(t2Var2) : t2Var2 == null) && ((x1Var = this.f7992l) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && ((u1Var = this.f7993m) != null ? u1Var.equals(u1Var2) : u1Var2 == null)) {
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
        int hashCode6 = (((((((this.f7984b.hashCode() ^ 1000003) * 1000003) ^ this.f7985c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f7986e.hashCode()) * 1000003;
        int i7 = 0;
        String str = this.f7987f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f7988g;
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
        int hashCode7 = (((((i11 ^ hashCode3) * 1000003) ^ this.f7989i.hashCode()) * 1000003) ^ this.f7990j.hashCode()) * 1000003;
        t2 t2Var = this.f7991k;
        if (t2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t2Var.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode4) * 1000003;
        x1 x1Var = this.f7992l;
        if (x1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = x1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode5) * 1000003;
        u1 u1Var = this.f7993m;
        if (u1Var != null) {
            i7 = u1Var.hashCode();
        }
        return i13 ^ i7;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f7984b + ", gmpAppId=" + this.f7985c + ", platform=" + this.d + ", installationUuid=" + this.f7986e + ", firebaseInstallationId=" + this.f7987f + ", firebaseAuthenticationToken=" + this.f7988g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.f7989i + ", displayVersion=" + this.f7990j + ", session=" + this.f7991k + ", ndkPayload=" + this.f7992l + ", appExitInfo=" + this.f7993m + "}";
    }
}
