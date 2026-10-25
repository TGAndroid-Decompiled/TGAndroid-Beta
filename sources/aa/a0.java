package aa;

import a8.ff;
public final class a0 extends g2 {
    public final String f1015b;
    public final String f1016c;
    public final int d;
    public final String e;
    public final String f1017f;
    public final String f1018g;
    public final String h;
    public final String f1019i;
    public final f2 f1020j;
    public final l1 f1021k;
    public final i1 f1022l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, f2 f2Var, l1 l1Var, i1 i1Var) {
        this.f1015b = str;
        this.f1016c = str2;
        this.d = i10;
        this.e = str3;
        this.f1017f = str4;
        this.f1018g = str5;
        this.h = str6;
        this.f1019i = str7;
        this.f1020j = f2Var;
        this.f1021k = l1Var;
        this.f1022l = i1Var;
    }

    public final ff a() {
        ?? obj = new Object();
        obj.f455a = this.f1015b;
        obj.f456b = this.f1016c;
        obj.f457c = Integer.valueOf(this.d);
        obj.d = this.e;
        obj.e = this.f1017f;
        obj.f458f = this.f1018g;
        obj.f459g = this.h;
        obj.h = this.f1019i;
        obj.f460i = this.f1020j;
        obj.f461j = this.f1021k;
        obj.f462k = this.f1022l;
        return obj;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        f2 f2Var;
        l1 l1Var;
        i1 i1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g2) {
            a0 a0Var = (a0) ((g2) obj);
            i1 i1Var2 = a0Var.f1022l;
            l1 l1Var2 = a0Var.f1021k;
            f2 f2Var2 = a0Var.f1020j;
            String str3 = a0Var.f1018g;
            String str4 = a0Var.f1017f;
            if (this.f1015b.equals(a0Var.f1015b) && this.f1016c.equals(a0Var.f1016c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f1017f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f1018g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f1019i.equals(a0Var.f1019i) && ((f2Var = this.f1020j) != null ? f2Var.equals(f2Var2) : f2Var2 == null) && ((l1Var = this.f1021k) != null ? l1Var.equals(l1Var2) : l1Var2 == null) && ((i1Var = this.f1022l) != null ? i1Var.equals(i1Var2) : i1Var2 == null)) {
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
        int hashCode5 = (((((((this.f1015b.hashCode() ^ 1000003) * 1000003) ^ this.f1016c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f1017f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f1018g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f1019i.hashCode()) * 1000003;
        f2 f2Var = this.f1020j;
        if (f2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = f2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        l1 l1Var = this.f1021k;
        if (l1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        i1 i1Var = this.f1022l;
        if (i1Var != null) {
            i10 = i1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f1015b + ", gmpAppId=" + this.f1016c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f1017f + ", appQualitySessionId=" + this.f1018g + ", buildVersion=" + this.h + ", displayVersion=" + this.f1019i + ", session=" + this.f1020j + ", ndkPayload=" + this.f1021k + ", appExitInfo=" + this.f1022l + "}";
    }
}
