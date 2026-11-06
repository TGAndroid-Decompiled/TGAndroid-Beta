package da;
public final class d0 extends u2 {
    public final String f8312b;
    public final String f8313c;
    public final int d;
    public final String f8314e;
    public final String f8315f;
    public final String f8316g;
    public final String h;
    public final String f8317i;
    public final String f8318j;
    public final t2 f8319k;
    public final x1 f8320l;
    public final u1 f8321m;

    public d0(String str, String str2, int i7, String str3, String str4, String str5, String str6, String str7, String str8, t2 t2Var, x1 x1Var, u1 u1Var) {
        this.f8312b = str;
        this.f8313c = str2;
        this.d = i7;
        this.f8314e = str3;
        this.f8315f = str4;
        this.f8316g = str5;
        this.h = str6;
        this.f8317i = str7;
        this.f8318j = str8;
        this.f8319k = t2Var;
        this.f8320l = x1Var;
        this.f8321m = u1Var;
    }

    public final c0 a() {
        ?? obj = new Object();
        obj.f8286a = this.f8312b;
        obj.f8287b = this.f8313c;
        obj.f8288c = this.d;
        obj.d = this.f8314e;
        obj.f8289e = this.f8315f;
        obj.f8290f = this.f8316g;
        obj.f8291g = this.h;
        obj.h = this.f8317i;
        obj.f8292i = this.f8318j;
        obj.f8293j = this.f8319k;
        obj.f8294k = this.f8320l;
        obj.f8295l = this.f8321m;
        obj.f8296m = (byte) 1;
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
            u1 u1Var2 = d0Var.f8321m;
            x1 x1Var2 = d0Var.f8320l;
            t2 t2Var2 = d0Var.f8319k;
            String str4 = d0Var.h;
            String str5 = d0Var.f8316g;
            String str6 = d0Var.f8315f;
            if (this.f8312b.equals(d0Var.f8312b) && this.f8313c.equals(d0Var.f8313c) && this.d == d0Var.d && this.f8314e.equals(d0Var.f8314e) && ((str = this.f8315f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f8316g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.h) != null ? str3.equals(str4) : str4 == null) && this.f8317i.equals(d0Var.f8317i) && this.f8318j.equals(d0Var.f8318j) && ((t2Var = this.f8319k) != null ? t2Var.equals(t2Var2) : t2Var2 == null) && ((x1Var = this.f8320l) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && ((u1Var = this.f8321m) != null ? u1Var.equals(u1Var2) : u1Var2 == null)) {
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
        int hashCode6 = (((((((this.f8312b.hashCode() ^ 1000003) * 1000003) ^ this.f8313c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f8314e.hashCode()) * 1000003;
        int i7 = 0;
        String str = this.f8315f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f8316g;
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
        int hashCode7 = (((((i11 ^ hashCode3) * 1000003) ^ this.f8317i.hashCode()) * 1000003) ^ this.f8318j.hashCode()) * 1000003;
        t2 t2Var = this.f8319k;
        if (t2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t2Var.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode4) * 1000003;
        x1 x1Var = this.f8320l;
        if (x1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = x1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode5) * 1000003;
        u1 u1Var = this.f8321m;
        if (u1Var != null) {
            i7 = u1Var.hashCode();
        }
        return i13 ^ i7;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f8312b + ", gmpAppId=" + this.f8313c + ", platform=" + this.d + ", installationUuid=" + this.f8314e + ", firebaseInstallationId=" + this.f8315f + ", firebaseAuthenticationToken=" + this.f8316g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.f8317i + ", displayVersion=" + this.f8318j + ", session=" + this.f8319k + ", ndkPayload=" + this.f8320l + ", appExitInfo=" + this.f8321m + "}";
    }
}
