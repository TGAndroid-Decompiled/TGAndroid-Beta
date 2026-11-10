package da;
public final class d0 extends u2 {
    public final String f8315b;
    public final String f8316c;
    public final int d;
    public final String f8317e;
    public final String f8318f;
    public final String f8319g;
    public final String h;
    public final String f8320i;
    public final String f8321j;
    public final t2 f8322k;
    public final x1 f8323l;
    public final u1 f8324m;

    public d0(String str, String str2, int i7, String str3, String str4, String str5, String str6, String str7, String str8, t2 t2Var, x1 x1Var, u1 u1Var) {
        this.f8315b = str;
        this.f8316c = str2;
        this.d = i7;
        this.f8317e = str3;
        this.f8318f = str4;
        this.f8319g = str5;
        this.h = str6;
        this.f8320i = str7;
        this.f8321j = str8;
        this.f8322k = t2Var;
        this.f8323l = x1Var;
        this.f8324m = u1Var;
    }

    public final c0 a() {
        ?? obj = new Object();
        obj.f8289a = this.f8315b;
        obj.f8290b = this.f8316c;
        obj.f8291c = this.d;
        obj.d = this.f8317e;
        obj.f8292e = this.f8318f;
        obj.f8293f = this.f8319g;
        obj.f8294g = this.h;
        obj.h = this.f8320i;
        obj.f8295i = this.f8321j;
        obj.f8296j = this.f8322k;
        obj.f8297k = this.f8323l;
        obj.f8298l = this.f8324m;
        obj.f8299m = (byte) 1;
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
            u1 u1Var2 = d0Var.f8324m;
            x1 x1Var2 = d0Var.f8323l;
            t2 t2Var2 = d0Var.f8322k;
            String str4 = d0Var.h;
            String str5 = d0Var.f8319g;
            String str6 = d0Var.f8318f;
            if (this.f8315b.equals(d0Var.f8315b) && this.f8316c.equals(d0Var.f8316c) && this.d == d0Var.d && this.f8317e.equals(d0Var.f8317e) && ((str = this.f8318f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f8319g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.h) != null ? str3.equals(str4) : str4 == null) && this.f8320i.equals(d0Var.f8320i) && this.f8321j.equals(d0Var.f8321j) && ((t2Var = this.f8322k) != null ? t2Var.equals(t2Var2) : t2Var2 == null) && ((x1Var = this.f8323l) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && ((u1Var = this.f8324m) != null ? u1Var.equals(u1Var2) : u1Var2 == null)) {
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
        int hashCode6 = (((((((this.f8315b.hashCode() ^ 1000003) * 1000003) ^ this.f8316c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f8317e.hashCode()) * 1000003;
        int i7 = 0;
        String str = this.f8318f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f8319g;
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
        int hashCode7 = (((((i11 ^ hashCode3) * 1000003) ^ this.f8320i.hashCode()) * 1000003) ^ this.f8321j.hashCode()) * 1000003;
        t2 t2Var = this.f8322k;
        if (t2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t2Var.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode4) * 1000003;
        x1 x1Var = this.f8323l;
        if (x1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = x1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode5) * 1000003;
        u1 u1Var = this.f8324m;
        if (u1Var != null) {
            i7 = u1Var.hashCode();
        }
        return i13 ^ i7;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f8315b + ", gmpAppId=" + this.f8316c + ", platform=" + this.d + ", installationUuid=" + this.f8317e + ", firebaseInstallationId=" + this.f8318f + ", firebaseAuthenticationToken=" + this.f8319g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.f8320i + ", displayVersion=" + this.f8321j + ", session=" + this.f8322k + ", ndkPayload=" + this.f8323l + ", appExitInfo=" + this.f8324m + "}";
    }
}
