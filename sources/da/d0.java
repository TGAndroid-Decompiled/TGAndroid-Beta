package da;
public final class d0 extends u2 {
    public final String f8013b;
    public final String f8014c;
    public final int d;
    public final String f8015e;
    public final String f8016f;
    public final String f8017g;
    public final String h;
    public final String f8018i;
    public final String f8019j;
    public final t2 f8020k;
    public final x1 f8021l;
    public final u1 f8022m;

    public d0(String str, String str2, int i7, String str3, String str4, String str5, String str6, String str7, String str8, t2 t2Var, x1 x1Var, u1 u1Var) {
        this.f8013b = str;
        this.f8014c = str2;
        this.d = i7;
        this.f8015e = str3;
        this.f8016f = str4;
        this.f8017g = str5;
        this.h = str6;
        this.f8018i = str7;
        this.f8019j = str8;
        this.f8020k = t2Var;
        this.f8021l = x1Var;
        this.f8022m = u1Var;
    }

    public final c0 a() {
        ?? obj = new Object();
        obj.f7987a = this.f8013b;
        obj.f7988b = this.f8014c;
        obj.f7989c = this.d;
        obj.d = this.f8015e;
        obj.f7990e = this.f8016f;
        obj.f7991f = this.f8017g;
        obj.f7992g = this.h;
        obj.h = this.f8018i;
        obj.f7993i = this.f8019j;
        obj.f7994j = this.f8020k;
        obj.f7995k = this.f8021l;
        obj.f7996l = this.f8022m;
        obj.f7997m = (byte) 1;
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
            u1 u1Var2 = d0Var.f8022m;
            x1 x1Var2 = d0Var.f8021l;
            t2 t2Var2 = d0Var.f8020k;
            String str4 = d0Var.h;
            String str5 = d0Var.f8017g;
            String str6 = d0Var.f8016f;
            if (this.f8013b.equals(d0Var.f8013b) && this.f8014c.equals(d0Var.f8014c) && this.d == d0Var.d && this.f8015e.equals(d0Var.f8015e) && ((str = this.f8016f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f8017g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.h) != null ? str3.equals(str4) : str4 == null) && this.f8018i.equals(d0Var.f8018i) && this.f8019j.equals(d0Var.f8019j) && ((t2Var = this.f8020k) != null ? t2Var.equals(t2Var2) : t2Var2 == null) && ((x1Var = this.f8021l) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && ((u1Var = this.f8022m) != null ? u1Var.equals(u1Var2) : u1Var2 == null)) {
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
        int hashCode6 = (((((((this.f8013b.hashCode() ^ 1000003) * 1000003) ^ this.f8014c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f8015e.hashCode()) * 1000003;
        int i7 = 0;
        String str = this.f8016f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f8017g;
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
        int hashCode7 = (((((i11 ^ hashCode3) * 1000003) ^ this.f8018i.hashCode()) * 1000003) ^ this.f8019j.hashCode()) * 1000003;
        t2 t2Var = this.f8020k;
        if (t2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t2Var.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode4) * 1000003;
        x1 x1Var = this.f8021l;
        if (x1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = x1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode5) * 1000003;
        u1 u1Var = this.f8022m;
        if (u1Var != null) {
            i7 = u1Var.hashCode();
        }
        return i13 ^ i7;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f8013b + ", gmpAppId=" + this.f8014c + ", platform=" + this.d + ", installationUuid=" + this.f8015e + ", firebaseInstallationId=" + this.f8016f + ", firebaseAuthenticationToken=" + this.f8017g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.f8018i + ", displayVersion=" + this.f8019j + ", session=" + this.f8020k + ", ndkPayload=" + this.f8021l + ", appExitInfo=" + this.f8022m + "}";
    }
}
