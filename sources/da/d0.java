package da;
public final class d0 extends u2 {
    public final String f7975b;
    public final String f7976c;
    public final int d;
    public final String f7977e;
    public final String f7978f;
    public final String f7979g;
    public final String h;
    public final String f7980i;
    public final String f7981j;
    public final t2 f7982k;
    public final x1 f7983l;
    public final u1 f7984m;

    public d0(String str, String str2, int i7, String str3, String str4, String str5, String str6, String str7, String str8, t2 t2Var, x1 x1Var, u1 u1Var) {
        this.f7975b = str;
        this.f7976c = str2;
        this.d = i7;
        this.f7977e = str3;
        this.f7978f = str4;
        this.f7979g = str5;
        this.h = str6;
        this.f7980i = str7;
        this.f7981j = str8;
        this.f7982k = t2Var;
        this.f7983l = x1Var;
        this.f7984m = u1Var;
    }

    public final c0 a() {
        ?? obj = new Object();
        obj.f7949a = this.f7975b;
        obj.f7950b = this.f7976c;
        obj.f7951c = this.d;
        obj.d = this.f7977e;
        obj.f7952e = this.f7978f;
        obj.f7953f = this.f7979g;
        obj.f7954g = this.h;
        obj.h = this.f7980i;
        obj.f7955i = this.f7981j;
        obj.f7956j = this.f7982k;
        obj.f7957k = this.f7983l;
        obj.f7958l = this.f7984m;
        obj.f7959m = (byte) 1;
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
            u1 u1Var2 = d0Var.f7984m;
            x1 x1Var2 = d0Var.f7983l;
            t2 t2Var2 = d0Var.f7982k;
            String str4 = d0Var.h;
            String str5 = d0Var.f7979g;
            String str6 = d0Var.f7978f;
            if (this.f7975b.equals(d0Var.f7975b) && this.f7976c.equals(d0Var.f7976c) && this.d == d0Var.d && this.f7977e.equals(d0Var.f7977e) && ((str = this.f7978f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f7979g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.h) != null ? str3.equals(str4) : str4 == null) && this.f7980i.equals(d0Var.f7980i) && this.f7981j.equals(d0Var.f7981j) && ((t2Var = this.f7982k) != null ? t2Var.equals(t2Var2) : t2Var2 == null) && ((x1Var = this.f7983l) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && ((u1Var = this.f7984m) != null ? u1Var.equals(u1Var2) : u1Var2 == null)) {
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
        int hashCode6 = (((((((this.f7975b.hashCode() ^ 1000003) * 1000003) ^ this.f7976c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f7977e.hashCode()) * 1000003;
        int i7 = 0;
        String str = this.f7978f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f7979g;
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
        int hashCode7 = (((((i11 ^ hashCode3) * 1000003) ^ this.f7980i.hashCode()) * 1000003) ^ this.f7981j.hashCode()) * 1000003;
        t2 t2Var = this.f7982k;
        if (t2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t2Var.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode4) * 1000003;
        x1 x1Var = this.f7983l;
        if (x1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = x1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode5) * 1000003;
        u1 u1Var = this.f7984m;
        if (u1Var != null) {
            i7 = u1Var.hashCode();
        }
        return i13 ^ i7;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f7975b + ", gmpAppId=" + this.f7976c + ", platform=" + this.d + ", installationUuid=" + this.f7977e + ", firebaseInstallationId=" + this.f7978f + ", firebaseAuthenticationToken=" + this.f7979g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.f7980i + ", displayVersion=" + this.f7981j + ", session=" + this.f7982k + ", ndkPayload=" + this.f7983l + ", appExitInfo=" + this.f7984m + "}";
    }
}
