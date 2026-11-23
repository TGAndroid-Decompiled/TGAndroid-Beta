package da;
public final class d0 extends u2 {
    public final String f7976b;
    public final String f7977c;
    public final int d;
    public final String f7978e;
    public final String f7979f;
    public final String f7980g;
    public final String h;
    public final String f7981i;
    public final String f7982j;
    public final t2 f7983k;
    public final x1 f7984l;
    public final u1 f7985m;

    public d0(String str, String str2, int i7, String str3, String str4, String str5, String str6, String str7, String str8, t2 t2Var, x1 x1Var, u1 u1Var) {
        this.f7976b = str;
        this.f7977c = str2;
        this.d = i7;
        this.f7978e = str3;
        this.f7979f = str4;
        this.f7980g = str5;
        this.h = str6;
        this.f7981i = str7;
        this.f7982j = str8;
        this.f7983k = t2Var;
        this.f7984l = x1Var;
        this.f7985m = u1Var;
    }

    public final c0 a() {
        ?? obj = new Object();
        obj.f7950a = this.f7976b;
        obj.f7951b = this.f7977c;
        obj.f7952c = this.d;
        obj.d = this.f7978e;
        obj.f7953e = this.f7979f;
        obj.f7954f = this.f7980g;
        obj.f7955g = this.h;
        obj.h = this.f7981i;
        obj.f7956i = this.f7982j;
        obj.f7957j = this.f7983k;
        obj.f7958k = this.f7984l;
        obj.f7959l = this.f7985m;
        obj.f7960m = (byte) 1;
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
            u1 u1Var2 = d0Var.f7985m;
            x1 x1Var2 = d0Var.f7984l;
            t2 t2Var2 = d0Var.f7983k;
            String str4 = d0Var.h;
            String str5 = d0Var.f7980g;
            String str6 = d0Var.f7979f;
            if (this.f7976b.equals(d0Var.f7976b) && this.f7977c.equals(d0Var.f7977c) && this.d == d0Var.d && this.f7978e.equals(d0Var.f7978e) && ((str = this.f7979f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f7980g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.h) != null ? str3.equals(str4) : str4 == null) && this.f7981i.equals(d0Var.f7981i) && this.f7982j.equals(d0Var.f7982j) && ((t2Var = this.f7983k) != null ? t2Var.equals(t2Var2) : t2Var2 == null) && ((x1Var = this.f7984l) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && ((u1Var = this.f7985m) != null ? u1Var.equals(u1Var2) : u1Var2 == null)) {
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
        int hashCode6 = (((((((this.f7976b.hashCode() ^ 1000003) * 1000003) ^ this.f7977c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f7978e.hashCode()) * 1000003;
        int i7 = 0;
        String str = this.f7979f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f7980g;
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
        int hashCode7 = (((((i11 ^ hashCode3) * 1000003) ^ this.f7981i.hashCode()) * 1000003) ^ this.f7982j.hashCode()) * 1000003;
        t2 t2Var = this.f7983k;
        if (t2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t2Var.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode4) * 1000003;
        x1 x1Var = this.f7984l;
        if (x1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = x1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode5) * 1000003;
        u1 u1Var = this.f7985m;
        if (u1Var != null) {
            i7 = u1Var.hashCode();
        }
        return i13 ^ i7;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f7976b + ", gmpAppId=" + this.f7977c + ", platform=" + this.d + ", installationUuid=" + this.f7978e + ", firebaseInstallationId=" + this.f7979f + ", firebaseAuthenticationToken=" + this.f7980g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.f7981i + ", displayVersion=" + this.f7982j + ", session=" + this.f7983k + ", ndkPayload=" + this.f7984l + ", appExitInfo=" + this.f7985m + "}";
    }
}
