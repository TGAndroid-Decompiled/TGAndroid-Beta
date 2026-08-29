package i9;

import h7.d8;
public final class a0 extends e2 {
    public final String f8584b;
    public final String f8585c;
    public final int d;
    public final String f8586e;
    public final String f8587f;
    public final String f8588g;
    public final String h;
    public final String f8589i;
    public final d2 f8590j;
    public final j1 f8591k;
    public final g1 f8592l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f8584b = str;
        this.f8585c = str2;
        this.d = i10;
        this.f8586e = str3;
        this.f8587f = str4;
        this.f8588g = str5;
        this.h = str6;
        this.f8589i = str7;
        this.f8590j = d2Var;
        this.f8591k = j1Var;
        this.f8592l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f7588a = this.f8584b;
        obj.f7589b = this.f8585c;
        obj.f7594i = Integer.valueOf(this.d);
        obj.f7590c = this.f8586e;
        obj.d = this.f8587f;
        obj.f7591e = this.f8588g;
        obj.f7596k = this.h;
        obj.f7592f = this.f8589i;
        obj.f7593g = this.f8590j;
        obj.h = this.f8591k;
        obj.f7595j = this.f8592l;
        return obj;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        d2 d2Var;
        j1 j1Var;
        g1 g1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            a0 a0Var = (a0) ((e2) obj);
            g1 g1Var2 = a0Var.f8592l;
            j1 j1Var2 = a0Var.f8591k;
            d2 d2Var2 = a0Var.f8590j;
            String str3 = a0Var.f8588g;
            String str4 = a0Var.f8587f;
            if (this.f8584b.equals(a0Var.f8584b) && this.f8585c.equals(a0Var.f8585c) && this.d == a0Var.d && this.f8586e.equals(a0Var.f8586e) && ((str = this.f8587f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f8588g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f8589i.equals(a0Var.f8589i) && ((d2Var = this.f8590j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f8591k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f8592l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f8584b.hashCode() ^ 1000003) * 1000003) ^ this.f8585c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f8586e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f8587f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f8588g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f8589i.hashCode()) * 1000003;
        d2 d2Var = this.f8590j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f8591k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f8592l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f8584b + ", gmpAppId=" + this.f8585c + ", platform=" + this.d + ", installationUuid=" + this.f8586e + ", firebaseInstallationId=" + this.f8587f + ", appQualitySessionId=" + this.f8588g + ", buildVersion=" + this.h + ", displayVersion=" + this.f8589i + ", session=" + this.f8590j + ", ndkPayload=" + this.f8591k + ", appExitInfo=" + this.f8592l + "}";
    }
}
